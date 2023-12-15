package curso_algoritimos;
import java.util.Scanner;
import java.lang.Math;

// Enunciado:
//Pedir ao usuário a quantidade de gols feitos por cada time e devolver em console
//a análise dam partida de acordo com os critérios:
//diferença de até 3 gols = Partida Normal
//diferença igual a 0 = Empate
//diferença de mais de 4 gols = Goleada
public class Avaliacao_Partida {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int bang, mad, media; 
		
		System.out.println("--------------------------");
		System.out.println("Partida Bangu x Madureira");
		System.out.println("--------------------------");
		
		System.out.print("Quantos gols o Bangu marcou? ");
		bang = entrada.nextInt();
		System.out.print("Quantos gols o Madureira marcou? ");
		mad = entrada.nextInt();
		
		media = Math.abs(bang - mad);
		
		switch(media) {
		case 0:
			System.out.println("Diferença: " + media);
			System.out.println("Status: Empate");
			break;
		case 1:
		case 2:
		case 3:
			System.out.println("Diferença: " + media);
			System.out.println("Status: Partida Normal");
			break;
		default:
			System.out.println("Diferença: " + media);
			System.out.println("Status: Goleada");
			break;
			
		}
		
		entrada.close();
		
	}

}

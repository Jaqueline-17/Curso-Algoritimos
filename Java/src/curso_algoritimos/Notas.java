package curso_algoritimos;
import java.util.Scanner;
// Enunciado:
//Peidr que o usuário informe duas notas de um aluno, calcular a média considerando
//a média 7,0 e informar o status de aprovação ou reprovação do aluno
public class Notas {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		double nota1, nota2, media;
		
		System.out.println("---- Calculo de Nota ----");
		System.out.println("Informe a 1ª nota: ");
		nota1 = entrada.nextDouble();
		
		System.out.println("Informe a 2ª nota: ");
		nota2 = entrada.nextDouble();
		
		media = (nota1 + nota2) / 2;
		
		if(media >= 7.0) {
			System.out.print ("Media: ");
			System.out.printf("%5.2f%n", media);
			System.out.println("Aluno Aprovado.");
		} else {
			System.out.print("Media: ");
			System.out.printf("%5.2f%n", media);
			System.out.println("Aluno Reprovado.");
		}

		entrada.close(); 
	}

}

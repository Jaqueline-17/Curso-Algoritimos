package curso_algoritimos;
import java.util.Scanner;
// Enunciado:
//Peidr que o usu�rio informe duas notas de um aluno, calcular a m�dia considerando
//a m�dia 7,0 e informar o status de aprova��o ou reprova��o do aluno
public class Notas {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		double nota1, nota2, media;
		
		System.out.println("---- Calculo de Nota ----");
		System.out.println("Informe a 1� nota: ");
		nota1 = entrada.nextDouble();
		
		System.out.println("Informe a 2� nota: ");
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

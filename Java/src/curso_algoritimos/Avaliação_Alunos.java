package curso_algoritimos;
import java.util.Scanner;
// Enunciado:
// Caucular a média de um aluno e mostrar em console seu desempenho de acordo com
// a tabela abaixo
// entre 9 e 10 = A
// entre 8 e 9 = B
// entre 7 e 8 = C
// entre 6 e 7 = D
// entre 5 e 6 = E
// abaixo de 5 = F
public class Avaliação_Alunos {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double nota1, nota2, media;
		
		System.out.println("--------------------");
		System.out.println("Avaliação de Alunos");
		System.out.println("--------------------");
		
		System.out.println("Informe a primeira nota: ");
		nota1 = entrada.nextDouble();
		System.out.println("Informe a segunda nota: ");
		nota2 = entrada.nextDouble();
		
		media = (nota1 + nota2) / 2;
		
		if(media <= 10 && media >=9) {
			System.out.println("Média: ");
			System.out.printf("%3.1f%n", media);
			System.out.println("Aproveitamento: A");
		} else if(media < 9 && media >= 8) {
			System.out.println("Média: ");
			System.out.printf("%3.1f%n", media);
			System.out.println("Aproveitamento: B");
		} else if(media < 8 && media >= 7) {
			System.out.println("Média: ");
			System.out.printf("%3.1f%n", media);
			System.out.println("Aproveitamento: C");
		} else if(media < 7 && media >= 6) {
			System.out.println("Média: ");
			System.out.printf("%3.1f%n", media);
			System.out.println("Aproveitamento: D");
		} else if(media < 6 && media >= 5) {
			System.out.println("Média: ");
			System.out.printf("%3.1f%n", media);
			System.out.println("Aproveitamento: E");
		} else if(media < 5) {
			System.out.println("Média: ");
			System.out.printf("%3.1f%n", media);
			System.out.println("Aproveitamento: F");
		}
		
		entrada.close();

	}

}

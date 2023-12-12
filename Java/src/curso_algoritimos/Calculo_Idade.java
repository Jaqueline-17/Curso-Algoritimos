package curso_algoritimos;
import java.util.Scanner;
//Enunciado:
//Fazer um programa que receba o ano atual e o ano de nascimento do usuário e
//devolver o resultado em console.
public class Calculo_Idade {

	public static void main(String[] args) {

		int idade, ano_atual, ano_nascimento;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual o ano atual?");
		ano_atual = entrada.nextInt();
		System.out.println("Qual o ano de nascimento?");
		ano_nascimento = entrada.nextInt();
		
		idade = ano_atual - ano_nascimento;
		
		System.out.println("O resultado da idade é: " + idade);
		
		entrada.close();
	}

}

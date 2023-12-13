package curso_algoritimos;
import java.util.Scanner;
// Enunciado
// Inserir io ano atual e o ano de nascimento e verificar se a pessoa está apta
// a dirigir conforme esteja na maior idade, dar a resposta em console
public class Departamento_de_Transito {

	public static void main(String[] args) {
		
		Scanner entrada =  new Scanner(System.in);
		int nasc, ano_atual, idade;
		
		System.out.println("---- Departamento de Trânsito ----");
		System.out.println("Informe o Ano Atual: ");
		ano_atual = entrada.nextInt();
		
		System.out.println("Informe o ano de nascimento: ");
		nasc = entrada.nextInt();
		
		idade = ano_atual - nasc;
		
		if(idade >= 18) {
			System.out.println("Idade: " + idade);
			System.out.println("Apto a dirigir.");
		} else {
			System.out.println("Idade: " + idade);
			System.out.println("Não está apto a dirigir.");
		}
		
	}

}

package curso_algoritimos;
import java.util.Scanner;
// Enunciado:
//Calcular o Valor do Imposto dos produtos comprados usando como base
//uma porcentagem de 60% pelo valor das compras e devolva os valores
//em console

public class Calculo_Imposto {

	public static void main(String[] args) {
		
		double preco, imposto, preco_final;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual o valor dos Produtos? ");
		preco = entrada.nextDouble();
		
		imposto = (preco * 60) / 100;
		preco_final = preco + imposto;
		
		System.out.print("O valor do imposto sobre o produto é de: R$ ");
		System.out.printf("%5.2f%n", imposto);
		System.out.print("O valor corrigido dos produtos é de R$ " );
		System.out.printf("%5.2f%n", preco_final);
		
		
		entrada.close();

	}

}

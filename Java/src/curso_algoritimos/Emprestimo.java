package curso_algoritimos;
import java.util.Scanner;

// Enunciado:
//Escrever um algor�timo que receba o valor do empr�stimo, que receba a
//quantidade de parcelas, fa�a o c�lculo do empr�stimo que tem um adicional
//de 20% e devolva em console o resultado.
public class Emprestimo {

	public static void main(String[] args) {
		
		double valor, valor_final, adicional, valor_parcelas;
		int parcelas;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Qual o valor do Empr�stimo? ");
		valor = entrada.nextDouble();
		
		System.out.println("Pagamento em quantas parcelas? ");
		parcelas = entrada.nextInt();
		
		adicional = (valor * 20) / 100;
		valor_final = valor + adicional;
		valor_parcelas = valor_final / parcelas;
		
		
		System.out.print("O valor final do empr�stimo � de R$ ");
		System.out.printf("%5.2f%n", valor_final);
		System.out.print("Adicional de 20% � igual a R$ ");
		System.out.printf("%4.2f%n", adicional);
		System.out.print("Ser� pago em " + parcelas + "x de R$ " );
		System.out.printf("%5.2f%n", valor_parcelas);
	
	
		entrada.close();
		
	}

}

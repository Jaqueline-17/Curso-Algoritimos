import java.util.Scanner;
//Fazer um programa que receba um valor em reais e converta para o dólar usando
//como parâmetro o dólar estando em $4,90.
public class Conversor_de_Moeda {
	public static void main(String[] args) {
		
		double reais, dolar;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual o valor em reais para ser convertido?");
		reais = entrada.nextDouble();
		
		dolar = reais / 4.90;
		
		System.out.println("O valor em Dólar é de U$ " + dolar);
	}
}

package curso_algoritimos;
import java.util.Scanner;
// Enunciado: 
//Fazer um programa que receba um valor em reais e converta para o d�lar usando
//como par�metro o d�lar estando em $4,90.
public class Conversor_de_Moeda {
	public static void main(String[] args) {
		
		double reais, dolar;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual o valor em reais para ser convertido?");
		reais = entrada.nextDouble();
		
		dolar = reais / 4.90;
		
		System.out.print("O valor em D�lar � de U$ ");
		System.out.printf("%5.2f%n", dolar);
		
		entrada.close();
	}
}

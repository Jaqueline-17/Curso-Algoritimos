package curso_algoritimos;
import java.util.Scanner;
// Enunciado:
//Fazer um programa que converta a temperatura de Fahrenheit para celcius
public class Calculo_Temperatura {

	public static void main(String[] args) {
		
		double far, cel;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Qual a temperatura em Fahrenheit? ");
		far = entrada.nextDouble();
		
		cel = (far - 32) / 1.8;
		
		System.out.print("A temperatura em Celcius é ");
		System.out.printf("%3.1f%n", cel);
	
		entrada.close();
	}

}
 
package curso_algoritimos;

import java.util.Scanner;
//Enunciado
//Solicitar ao usuário o número inicial e o número final de uma contegem e 
//devolver o resultado em console, detectando se a contagem é crescente 
//ou decrescente
public class Contagem_Inteligente {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int comeco, fim, contador;
		
		System.out.println("---------------------");
		System.out.println("Contagem Inteligente");
		System.out.println("---------------------");
		
		System.out.print("Escreva o começo da contagem: ");
		comeco = entrada.nextInt();
		System.out.print("Escreva o fim da contagem: ");
		fim = entrada.nextInt();
		
		if(comeco < fim) {
		    while(comeco <= fim) {
		        System.out.print(comeco + "...");
		        comeco ++;
		    }
		} else {
		   while(comeco >= fim) {
		        System.out.print(comeco + "...");
		        comeco --;
		   }
		}
		
	}
}

package curso_algoritimos;

import java.util.Scanner;
// Enunciado: 
//Fazer o cauculo de Tr�s lados de um tri�ngulo L1, L2, L3 e definir se �
//um tri�ngulo equil�tero (EQ) ou um tri�ngulo escaleno (ES) , e se � capaz
//de formar um tri�ngulo(TRI).
public class Triangulo {
	
	public static void main(String[] args) {
		
		double l1, l2,l3;
		boolean eq, es, tri;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro Lado: ");
		l1 = entrada.nextDouble();
		System.out.println("Digite o segundo Lado: ");
		l2 = entrada.nextDouble();
		System.out.println("Digite o terceiro Lado: ");
		l3 = entrada.nextDouble();
		
		tri = ((l1 < l2 + l3) && (l2 < l1 + l3) && (l3 < l1 + l2));
		eq = ((l1 == l2) && (l2 == l3));
		es = ((l1 != l2) && (l2 != l3) && (l1 != l3));
		
		System.out.println("Pode formar um TRI�NGULO? " + tri);
		System.out.println("O tri�ngulo � EQUILATERO? " + eq);
		System.out.println("O tri�ngulo � ESCALENO? " + es);
		
		entrada.close();
		
	}
}

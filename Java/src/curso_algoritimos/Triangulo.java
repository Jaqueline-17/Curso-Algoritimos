package curso_algoritimos;

import java.util.Scanner;
// Enunciado: 
//Fazer o cauculo de Três lados de um triângulo L1, L2, L3 e definir se é
//um triângulo equilátero (EQ) ou um triângulo escaleno (ES) , e se é capaz
//de formar um triângulo(TRI).
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
		
		System.out.println("Pode formar um TRIÂNGULO? " + tri);
		System.out.println("O triângulo é EQUILATERO? " + eq);
		System.out.println("O triângulo é ESCALENO? " + es);
		
		entrada.close();
		
	}
}

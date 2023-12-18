package curso_algoritimos;
import java.util.Scanner;
// Enunciado
//Solicitar ao usuário quantos alunos a escola tem, solicitar o nome e a nota
//de cada aluno e devolover o nome e o aproveitamento do melhor aluno informado
public class Maior_Nota {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int alunos, contador;
		String nome_aluno, melhor_aluno, bug;
		double nota_aluno, maior_nota;
		
		System.out.print("Quantos alunos deseja adicionar? ");
		alunos = entrada.nextInt();
		
		contador = 0;
		melhor_aluno = "";
		maior_nota = 0;
		
		while(contador < alunos) {
		    System.out.println("---------------");
		    System.out.print("Aluno: ");
		    bug = entrada.nextLine(); // variável para consumir o bug do next.Line();
		    nome_aluno = entrada.nextLine();
		    System.out.print("Nota: ");
		    nota_aluno = entrada.nextDouble();
		    
		    contador ++;
		    
		    if(nota_aluno > maior_nota) {
		        melhor_aluno = nome_aluno;
		        maior_nota = nota_aluno;
		    }
		    
		}
		
        System.out.println("Aluno com a maior nota: " + melhor_aluno);
        System.out.print("Com o desempenho de: ");
        System.out.printf("%4.1f%n", maior_nota);
	}
}

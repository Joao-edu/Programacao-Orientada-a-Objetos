package Exercicio_NotaAluno;

import java.util.Locale;
import java.util.Scanner;

public class NotaAluno {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Prova Pro = new Prova();
		
		System.out.println("Nome do Aluno");
		Pro.Aluno = sc.nextLine();
		System.out.println("Nota 1, 2 e 3");
		Pro.Nota1 = sc.nextDouble();
		Pro.Nota2 = sc.nextDouble();
		Pro.Nota3 = sc.nextDouble();
		
		System.out.printf("Nota Final do aluno, " + Pro.Aluno + " é %.2f.\n", Pro.Soma());
		
		if ( Pro.Soma() > 60) {
			System.out.println("Aluno apovado");
			
		}else {
			System.out.printf("Aluno reprovado para obter a media falta %.2f", Pro.Situacao());
		}
		
		sc.close();
	}

	
	
}

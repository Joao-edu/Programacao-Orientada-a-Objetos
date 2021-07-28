package Curso_algoritmo_POO;
import java.util.Scanner;

public class Estru_Sequencial_Exercicio_3 {

	public static void main(String[] args) {
		
		
		int A, B, C, D;
		int Diferenca;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Valor A");
		A = sc.nextInt();
		System.out.println("Valor B");
		B = sc.nextInt();
		System.out.println("Valor C");
		C = sc.nextInt();
		System.out.println("Valor D"
				+ "");
		D = sc.nextInt();
		
		Diferenca = (A * B) - (C * D);
		
		System.out.println("Diferença = " + Diferenca);
		
		sc.close();
	}

}

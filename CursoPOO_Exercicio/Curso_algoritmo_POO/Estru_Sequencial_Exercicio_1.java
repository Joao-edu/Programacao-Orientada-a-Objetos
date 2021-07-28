package Curso_algoritmo_POO;
import java.util.Scanner;

public class Estru_Sequencial_Exercicio_1 {

	public static void main(String[] args) {
		
		int A, B, Total;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Valor 1");
		A = sc.nextInt();
		System.out.println("Valor 2");
		B = sc.nextInt();
		
		Total = A + B;
		
		System.out.println("SOMA = " + Total);
		
		sc.close();

		
	}

}

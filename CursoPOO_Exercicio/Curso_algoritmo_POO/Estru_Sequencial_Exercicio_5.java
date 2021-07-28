package Curso_algoritmo_POO;
import java.util.Locale;
import java.util.Scanner;

public class Estru_Sequencial_Exercicio_5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		int Codigo1, Codigo2;
		int numero1, numero2;
		double valor1, valor2;
		double total;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("CODE 1");

		Codigo1 = sc.nextInt();
		System.out.println("CODE 2");
		Codigo2 = sc.nextInt();
		
		System.out.println("PART NUMBER 1 ");
		numero1 = sc.nextInt();
		System.out.println("PART NUMBER 2");
		numero2 = sc.nextInt();
		
		System.out.println("VALUE 1");
		valor1 = sc.nextDouble();
		System.out.println("VALUE 2");
		valor2 = sc.nextDouble();
		
		total = (numero1 * valor1) + (numero2 * valor2);
		
		System.out.println("PRODUCT CODE ONE = " + Codigo1);
		System.out.println("PRODUCT CODE TWO = " + Codigo2);
		System.out.printf("AMOUNT TO PAY: U$ = %.2f", total);
		
		
		sc.close();
	}

}

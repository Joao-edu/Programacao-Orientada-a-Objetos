package Curso_algoritmo_POO;
import java.util.Scanner;

public class Estru_Condicional_Exercicio_1 {

	public static void main(String[] args) {

		int numero;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number");
		numero = sc.nextInt();

		if (numero < 0) {
			System.out.println("Positive number");
		} else {
			System.out.println("Negative number");
		}

		sc.close();

	}

}

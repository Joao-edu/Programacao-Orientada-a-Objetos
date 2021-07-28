package Curso_algoritmo_POO;
import java.util.Locale;
import java.util.Scanner;

public class Estru_Condicional_Exercicio_7 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.println("Eixo X");
		double X = sc.nextDouble();
		System.out.println("Eixo Y");
		double Y = sc.nextDouble();

		if (X == 0.0 && Y == 00.) {
			System.out.println("Origem");
		} else if (Y > 0.0 && X > 0.0) {
			System.out.println("Q1");
		} else if (Y > 0.0 && X < 0.0) {
			System.out.println("Q2");
		} else if (X < 0.0 && Y < 0.0) {
			System.out.println("Q3");
		} else if (X > 0.0 && Y < 0.0) {
			System.out.println("Q4");
		}

		sc.close();

	}

}

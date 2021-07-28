package Curso_algoritmo_POO;
import java.util.Scanner;

public class Aula2_Estrutura_Repetitiva {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		int y = sc.nextInt();

		while (x < 3 && y > 5) {

			y += 1;
			x += 2;

			x = sc.nextInt();

			y = sc.nextInt();

			System.out.println(y + " " + x);
		}

		sc.close();

	}

}

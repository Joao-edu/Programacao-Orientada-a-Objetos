package Curso_algoritmo_POO;
import java.util.Scanner;

public class Aula3_Estrutura_Repetitiva {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int soma = 0;

		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			soma = soma + x;

		}

		System.out.println(soma);

		sc.close();
	}

}

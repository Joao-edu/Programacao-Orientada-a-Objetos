package Curso_algoritmo_POO;
import java.util.Locale;
import java.util.Scanner;

public class Aula_Estrutura_Condicional {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		double hora;

		Scanner sc = new Scanner(System.in);

		System.out.println("Qual horario?\n");
		hora = sc.nextFloat();

		if (hora < 12) {
			System.out.println("Bom dia!");
		}

		else if (hora >= 12 && hora < 18) {
			System.out.println("Boa tarde!");
		}

		else {
			System.out.println("Boa noite!");
		}

		sc.close();
	}

}

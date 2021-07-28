package Curso_algoritmo_POO;
import java.util.Locale;
import java.util.Scanner;

public class Estru_Condicional_Exercicio_8 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		double Salario = sc.nextDouble();

		if (Salario >= 0.00 && Salario <= 2000.00) {
			System.out.println("Isento");
		} 
		else if (Salario >= 2000.00 && Salario <= 3000.00) {
			Salario = (Salario - 2000.00) * 0.08;
		} 
		else if (Salario >= 3000.01 && Salario <= 4500.00) {
			Salario = (Salario - 3000) * 0.18 + 1000.00 * 0.08;
		} 
		else {
			Salario = (Salario -4500.00) * 0.28 + 1500.00 * 0.18 + 1000.00 *0.08;
		}

		System.out.printf("Imposto = R$ %.2f", Salario);

		sc.close();

	}
}

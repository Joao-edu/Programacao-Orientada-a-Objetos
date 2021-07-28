package Curso_algoritmo_POO;
import java.util.Locale;
import java.util.Scanner;

public class Estru_Sequencial_Exercicio_2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Double raio, pi = 3.14159, V_raio;

		Scanner sc = new Scanner(System.in);

		System.out.println("Valor do raio de um circulo");
		
		
		
		raio = sc.nextDouble();

		V_raio = pi * (raio * raio);

		
		
		System.out.printf("Valor da área do circulo = %.4f", V_raio);

		
		
		sc.close();
	}

}

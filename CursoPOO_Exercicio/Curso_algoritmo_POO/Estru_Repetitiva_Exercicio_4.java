package Curso_algoritmo_POO;
import java.util.Scanner;

public class Estru_Repetitiva_Exercicio_4 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		for (int i=0;i<n;i++) {
			
			double x = sc.nextDouble();
			double y = sc.nextDouble();
		
			if(y == 0) {
				System.out.println("Divisão impossivel");
			}else {
				double divisao = x / y;
				System.out.printf("Divisão = %.2f", divisao);
			}
		}
		sc.close();
	}

}

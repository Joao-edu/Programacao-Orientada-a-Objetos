package Curso_algoritmo_POO;
import java.util.Scanner;

public class Estru_Repetitiva_Exercicio_6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		
		for(int i=1;i<=N;i++) {
			
			if( N % i == 0) {
			
			System.out.println(i);
			}
			
			sc.close();
		}
	}

}

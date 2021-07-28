package Curso_algoritmo_POO;
import java.util.Scanner;

public class Estru_Condicional_Exercicio_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number A");
		int A = sc.nextInt();
		System.out.println("Enter number B");
		int B = sc.nextInt();
		
		

		
		if (  A % B == 0 ||  B % A ==0) {
			System.out.println("Multiple number");
		}else {
			System.out.println("Not is multiple");
		}
		sc.close();
	}

}

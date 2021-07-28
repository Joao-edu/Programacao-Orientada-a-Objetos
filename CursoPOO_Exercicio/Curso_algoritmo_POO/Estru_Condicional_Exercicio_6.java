package Curso_algoritmo_POO;
import java.util.Scanner;

public class Estru_Condicional_Exercicio_6 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		double intervalo = sc.nextDouble();
		
		
		if (intervalo > 0.00 || intervalo < 100) {
			System.out.println("Fora do intervalo");
		}
		
		else if ( intervalo <= 0.25) {
			System.out.println("Intervalo [0,25]");
		}
		else if(intervalo > 0.25 || intervalo <= 25.50) {
			System.out.println("Intervalo [25,50]");
		}
		else if(intervalo > 25.50 || intervalo <= 50.75) {
			System.out.println("Intervalo [50.75");
		}
		else if(intervalo > 50.75 || intervalo <= 75.100) {
			System.out.println("Intervalo [75,100]");
		}
		
		sc.close();

	}

}

package Curso_algoritmo_POO;
import java.util.Scanner;

public class Estru_Condicional_Exercicio_2 {

	public static void main(String[] args) {
	


		
	int numero;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter number");
	numero = sc.nextInt();
	
	if (numero % 2 == 0) {
		System.out.println(" even number");
	}else {
		System.out.println("Ood number");
	}
	sc.close();
	}

}

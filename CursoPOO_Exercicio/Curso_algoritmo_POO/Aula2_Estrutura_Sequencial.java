package Curso_algoritmo_POO;
import java.util.Scanner;

public class Aula2_Estrutura_Sequencial {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		
		String s1, s2, s3;
		
		System.out.println("Entrada de dados");
		
		
		x  = sc.nextInt();
		sc.nextLine();//nextLine extra para evitar quebra de linha 
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("Dados digitados");
		System.out.println(x);
		System.out.println( s1 );
		System.out.println( s2 );
		System.out.println( s3 );
		
		sc.close();
	
	}

}

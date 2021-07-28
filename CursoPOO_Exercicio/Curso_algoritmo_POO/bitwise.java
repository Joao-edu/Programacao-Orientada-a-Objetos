package Curso_algoritmo_POO;
import java.util.Scanner;

public class bitwise {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Scanner cs = new Scanner(System.in);

		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = cs.nextInt();
        int mascara = sc.nextInt();
		

		
		if (( n3 &  mascara) != 0 ) {
			System.out.println("6 Bit e verdadeiro");
		}else
			System.out.println("6 Bit e falso\n");
		
		System.out.println(n1 & n2);
		System.out.println(n1 | n2);
		System.out.println(n1 ^ n2);
		
		sc.close();
		cs.close();

	}
}

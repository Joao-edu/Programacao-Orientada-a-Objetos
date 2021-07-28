package Curso_algoritmo_POO;
import java.util.Locale;
import java.util.Scanner;

public class Estru_Condicional_Exercicio_5 {

	public static void main(String[] args) {

		System.out.println("-----Menu de opçoes-----");
		System.out.println("1____Cachorro Quente.");
		System.out.println("2____X-Slada.");
		System.out.println("3____Torrada simples.");
		System.out.println("4____Refrigerente.\n");

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.println("Selecione um codigo");
		int codigo = sc.nextInt();
		System.out.println("Selecione a quantidade");
		double Quantidade = sc.nextDouble();
		
		double total = 0;

		if (codigo == 1) {
			total = Quantidade * 4.00;
		} 
		else if (codigo == 2) {
			total = Quantidade * 4.50;
		}
		else if (codigo == 3) {
			total = Quantidade * 5.00;
		}
		else if(codigo == 4) {
			total = Quantidade * 2.00;
		}
		else if(codigo == 4) {
			total = Quantidade * 1.50;
		}
		
		System.out.printf("Total a pagar %.2f", total);

		sc.close();
	}

}

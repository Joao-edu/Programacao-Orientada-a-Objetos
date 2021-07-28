package Curso_algoritmo_POO;
import java.util.Locale;

public class Aula1_Estrutura_Sequencial {

	public static void main(String[] args) {

		
//----------------------------------------//		
		
		int y = 32;

		double x = 10.35784;
		
//----------------------------------------//

		String nome = "Maria";

		int idade = 31;

		double renda = 4000.;

//----------------------------------------//		

		System.out.println("Inicio");
		System.out.printf("%.2f\n", x);
		System.out.printf("%.4f\n", x);
		System.out.println(y);

		Locale.setDefault(Locale.US);

		// Separarador com ponto //
		System.out.printf("%.4f\n", x);
		System.out.println("Resultado = " + x + " Metros");
		// Concatenar
		System.out.printf("Resultado = %.4f Metros\n", x);

		// Concatenar vários elementos
		System.out.printf("%s tem %d de idade e ganha R$ %.2f reains", nome, idade, renda);

		
		
		
		
	}

}
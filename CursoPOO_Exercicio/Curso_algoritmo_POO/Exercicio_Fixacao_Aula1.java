package Curso_algoritmo_POO;
import java.util.Locale;

public class Exercicio_Fixacao_Aula1 {

	public static void main(String[] args) {
		
		String Produto1 = "Computador";
		String Produto2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double preco1 = 2100.0;
		double preco2 = 650.50;
		double medida = 53.234567;
		
		System.out.printf("O preço do %s e R$ %.2f\n", Produto1, preco1);
		
		System.out.printf("O preço do %s e R$ %.2f\n", Produto2, preco2);
		
		System.out.printf("Registro: %d anos, codigo %d, genero: %c\n", age, code, gender);
		
		System.out.printf("Media = %f\n", medida);
		
		System.out.printf("Media (Com 2 casa decimal) = %.2f\n", medida);
		
		Locale.setDefault(Locale.US);
		
		System.out.printf("Media (Com pondo decimal padrão US ) = %.2f", medida);
	}

}
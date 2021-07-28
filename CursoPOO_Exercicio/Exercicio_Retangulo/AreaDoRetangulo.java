// Calcular Área, Prerimetro e Diagonal do retangulo
package Exercicio_Retangulo;

import java.util.Locale;
import java.util.Scanner;

public class AreaDoRetangulo {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo rec = new Retangulo();
		
				
		System.out.println("Digite o valor da 'ÀLTURA' ");
		rec.altura = sc.nextDouble();
		System.out.println("Digite o valor da 'LARGURA' ");
		rec.largura = sc.nextDouble();
		
			
		
		System.out.printf("ÁREA       = %.2f\n" , rec.Area());
		System.out.printf("PERIMETRO  = %.2f\n" , rec.Perimetro());
		System.out.printf("DIAGONAL   = %.2f\n" , rec.Diagonal());
		
		sc.close();
	}

}

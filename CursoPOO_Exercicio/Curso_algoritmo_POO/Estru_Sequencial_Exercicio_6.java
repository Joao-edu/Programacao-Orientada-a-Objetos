package Curso_algoritmo_POO;
import java.util.Locale;
import java.util.Scanner;

public class Estru_Sequencial_Exercicio_6 {

	public static void main(String[] args) {
		
	Locale.setDefault(Locale.US);
		
		float A, B, C;
		
	    double pi =  3.14159;
		
		
		Scanner sc = new Scanner(System.in);
		
		float Triangulo;
		
		float Circulo;
		
		float Trapezio;
		
		float Quadrado; 
		
		float Retangulo;
		
		
		System.out.println("Par�metro A");
		A = sc.nextFloat();
		System.out.println("Par�metro B");
		B = sc.nextFloat();
		System.out.println("Par�metro C");
		C = sc.nextFloat();
		
		
		Triangulo =  (A * C) / 2; 
		
		Circulo   =  (float)pi * (C * C);
		 
		Trapezio  =  ((A + B) * C) /2;
		
		Quadrado  =  (B * B);
		
		Retangulo =  (A * B);
		
		
		System.out.printf("�rea do tri�ngulo ret�ngulo = %.3f\n", Triangulo);
		System.out.printf("�rea do raio do c�rculo = %.3f\n",Circulo);
		System.out.printf("�rea do trap�zio = %.3f\n",Trapezio);
		System.out.printf("�rea do quadrado = %.3f\n",Quadrado);
		System.out.printf("�rea do ret�ngulo = %.3f",Retangulo);
	
	
		sc.close();
		
	}

}

package AreaDoTriangulo_Ex_1;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Triangulo x, y;
		x = new Triangulo();
		y = new Triangulo();
		
		System.out.println("Digite as medidas do triangulo X:");

		 x.a= sc.nextDouble();
		 x.b= sc.nextDouble();
		 x.c= sc.nextDouble();

		System.out.println("Digite as medidas do triangulo Y:");

		 x.a = sc.nextDouble();
		 x.b= sc.nextDouble();
		 x.c = sc.nextDouble();
		
		double p = (x.a + x.b + x.c) / 2.0;
		double areax = Math.sqrt(p * (p - x.a) * (p - x.b) * ( p - x.c));
		
		p = (y.a + y.b + y.c) / 2.0;
		double areay = Math.sqrt(p *(p - y.a) * (p - y.b) * (p - y.c));

		System.out.printf("Area do triangulo X: %.4f\n", areax);
		System.out.printf("Area do triangulo Y: %.4f\n", areay);
	
	   if (areax > areay) {
		   System.out.println("maior area: X");
	   }else {
		   System.out.println("maior area: Y");
	   }
	
	   sc.close();
	   
	}
}
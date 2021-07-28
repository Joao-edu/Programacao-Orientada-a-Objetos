package Exerciciio_Triangulo;

import java.util.Locale;
import java.util.Scanner;

public class AreaDoTriangulo {

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

		 y.a = sc.nextDouble();
		 y.b= sc.nextDouble();
		 y.c = sc.nextDouble();
		
		 double areax = x.area();
		 double areay = y.area();
		
		
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

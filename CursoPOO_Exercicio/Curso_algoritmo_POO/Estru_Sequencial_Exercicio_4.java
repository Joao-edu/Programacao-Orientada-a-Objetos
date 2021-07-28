package Curso_algoritmo_POO;
import java.util.Locale;
import java.util.Scanner;

public class Estru_Sequencial_Exercicio_4 {

	public static void main(String[] args) {
		
		
    Locale.setDefault(Locale.US);	
		
	int numero;
	int H_trabalhadas;
	double V_horas;
	double Total;
		
	Scanner sc = new Scanner(System.in);
	
	
	System.out.println("NUMBER"  );
	numero = sc.nextInt();
	System.out.println("WORKED HOURS");
	H_trabalhadas = sc.nextInt();
	System.out.println("HOURS VALUE");
	V_horas = sc.nextDouble();
	
	
	Total = H_trabalhadas * V_horas;
	
	System.out.println("Number = "+ numero);
	System.out.printf("Salary = U$ %.2f", Total);
	
	sc.close();

	}

}

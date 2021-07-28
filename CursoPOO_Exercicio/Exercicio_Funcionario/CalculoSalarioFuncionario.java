package Exercicio_Funcionario;

import java.util.Locale;
import java.util.Scanner;

public class CalculoSalarioFuncionario {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario Fun = new Funcionario();
		
		System.out.println("Nome do funcionario: ");
		Fun.nome = sc.nextLine();
		System.out.println("Salario bruto");
		Fun.SalarioBruto = sc.nextDouble();
		System.out.println("Imposto");
		Fun.Imposto = sc.nextDouble();
		
		System.out.println();
		System.out.println("Funcinario :" + Fun);
		System.out.println();
		System.out.println("Digite o percentual do aumento do salário?" );
		double Porcentagem = sc.nextDouble();
		Fun.NovoSalario(Porcentagem);
		
		
		System.out.println();
		System.out.println("Aumento de salário " + Fun);
	
		
		sc.close();

				
	}

	

}

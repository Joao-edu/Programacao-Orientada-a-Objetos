package Exercicio_Funcionario;

public class Funcionario {

	String nome;
	double SalarioBruto;
	double Imposto;

	public double CalculoImposto() {
		return SalarioBruto - Imposto;

	}

	public void NovoSalario(double Porcentagem) {

		 SalarioBruto += SalarioBruto * Porcentagem / 100.00;

	}
	
	public String toString(){
		return nome + ", $ " + String.format("%.2f", CalculoImposto());
	}

}

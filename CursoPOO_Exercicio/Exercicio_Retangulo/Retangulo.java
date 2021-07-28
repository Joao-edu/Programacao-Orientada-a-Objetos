package Exercicio_Retangulo;

public class Retangulo {

	double largura;
	double altura;

	public double Area() {
		
		return  altura * largura;
	}

	public double Perimetro() {
		return 2 * (altura + largura);
	}

	public double Diagonal() {
		return Math.sqrt((altura*altura) + (largura * largura));

	}

}

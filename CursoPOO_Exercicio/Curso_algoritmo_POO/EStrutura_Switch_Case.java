package Curso_algoritmo_POO;
import java.util.Scanner;

public class EStrutura_Switch_Case {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		@SuppressWarnings("unused")
		String Dia = null ;
		
		switch (x) {
		
		
		case 1:
			Dia = "Domingo" ;
		    break;
		case 2:
			Dia = "Segunda";
			break;
		case 3:
			Dia = "Terça";
			break;
		case 4:
			Dia = "Quarta";
			break;
		case 5:
			Dia = "Quinta";
			break;
		case 6:
			Dia = "Sexta";
			break;
		case 7:
			Dia = "Sabado";
			break;
		case 8:
			Dia = "Valor invalido";
			break;
		

		}
		
		System.out.println(Dia);
		
		sc.close();
	}

}

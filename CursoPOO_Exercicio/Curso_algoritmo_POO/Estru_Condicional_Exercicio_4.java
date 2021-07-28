package Curso_algoritmo_POO;

//Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode 
//começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas

import java.util.Scanner;

public class Estru_Condicional_Exercicio_4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Game start time.");
		int HoraInicial = sc.nextInt();
		System.out.println("Game edn time.");
		int HoraFinal   = sc.nextInt();
		
		int duracao;
		
		if (HoraInicial < HoraFinal) {
			
			duracao = HoraFinal - HoraInicial;
		
		}else {
			
			duracao = 24 - HoraInicial + HoraFinal;
		}
		

		System.out.println("Game lastes " + duracao + " hours");
	
	sc.close();
		
	}

}

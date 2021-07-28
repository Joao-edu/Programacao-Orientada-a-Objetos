package Exercicio_NotaAluno;

public class Prova {
	
	String Aluno;
	double Nota1;
	double Nota2;
	double Nota3;
	
	   public double Soma() {
		   return Nota1 + Nota2 + Nota3 ;
	   }
	   
	   public double Situacao() {
		   
		   if (Soma() < 60) {
			   return 60 - Soma();
		   }else {
			   
		   }return 0.0;
	   
	   }

	
	
	
	
	
	
	
	
}

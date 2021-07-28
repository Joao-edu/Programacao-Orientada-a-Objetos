package Curso_algoritmo_POO;
import java.util.Scanner;

public class Comentario {

	public static void main(String[] args) {
		/*
		 * Operadores  de atribui��o cumulativa 
		 * 
		 *  A += B;   =   A = A + B;
		 *  A -= B;   =   A = A - B;
		 *  A *= B;   =   A = A * B;
		 *  A /= B;   =   A = A / B;
		 *  A %= B;   =   A = A % B;
	     */
	
	
	
	    /* Express�o condicional termin�ria
	     * 
	     *  (condi��o) ? Valor_se_verdadiro : Valor_se_falso
	     *  
	     *  Ex:
	     *  
	     *  (4 > 8   ) 50 : 80    =   80
	     *   
	     *  (10 != 3 ) "Maria" : "Alex"    =  "Maria"
 	     *  
	     */
		
		Scanner  sc = new Scanner(System.in);
		
		double preco = sc.nextDouble();
		
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.5;
	
		
		
	    System.out.println("Deswconto:R$ " + desconto );
	
	    sc.close();
	
	/*
	 *  Estrutura (for)
	 *  
	 *  for (inicio; condi��o ; incremento) {
	 *     
	 *     comando 1
	 *     comando 2
	 *  
	 *   inicio     = Executa somente na primeira vez
	 *   
	 *   condi��o   = V: executa e volta
	 *                F: pula fora 
	 *  
	 *   incremento = Executa toda vez depois volta;        
	 *         
	 */
	
	
	
	
	}

}

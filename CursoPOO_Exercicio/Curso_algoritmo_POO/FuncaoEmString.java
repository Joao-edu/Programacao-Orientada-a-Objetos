package Curso_algoritmo_POO;

public class FuncaoEmString {

	public static void main(String[] args) {
		
		
		String original = "abc DEF GHI jkl MNO abcde    ";
		String s = "batada maça limao";
		String [] vect = s.split(" ");/*Slplt serve para recortar uma String*/
		
		
		String S01 = original.toLowerCase();/*Letra minuscala*/
		String S02 = original.toUpperCase();/*Letra maiuscula*/
		String S03 = original.trim();/* Elimina os espaços no final*/
		String S04 = original.substring(2);/*Elimina as dua primeiras letras*/
		String S05 = original.substring(2, 9);/*Elimina as dua primeiras e ultimas letras*/ 
		String S06 = original.replace('a', 'x');/*Subistitui a por x*/
		String S07 = original.replace("abc","xyz");/*Subistitui abc por xyz*/
	
		int i = original.indexOf("bc");/**/
		int j = original.lastIndexOf("bc");/**/
		
		
		
		/*------------------------------------------------------------------*/
		
		
		
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
	
		
		System.out.println("Original: -" + original  + "-");
		System.out.println("toLowrCase: -" + S01  + "-");
		System.out.println("toUpperCase: -" + S02  + "-");
		System.out.println("trim: -" + S03   +  "-");
		System.out.println("subString -" + S04 + "-" );
		System.out.println("subStribg -" + S05 + "-");
		System.out.println("replace ('a', 'x' ): -" + S06 + "-");
		System.out.println("repalce('abc, xyz): -" + S07 + "-");
        System.out.println("indexOf 'bc' =" + i);
        System.out.println("lastIndexOf 'bc' -" + j);
        
	}

}

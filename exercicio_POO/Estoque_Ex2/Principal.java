package Estoque_Ex2;

import java.util.Locale;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Produto produto = new Produto();
		System.out.println("Entrada de produto:  ");
		System.out.println("Nome: ");
		produto.nome = sc.nextLine();

		System.out.println("Preço: ");
		produto.preco = sc.nextDouble();
		
		System.out.println("Quantidade em estoque: ");
		produto.quantidade = sc.nextInt();

		System.out.println();
		System.out.println("Informaçoes do produto: " + produto);
		
		System.out.println();
		System.out.println("Entre com o numero de produto para ser adicionado no estoque: ");
	    int quantidade = sc.nextInt();
	    produto.addProduto(quantidade);
	    
	    System.out.println();
		System.out.println("Dados atualizados: " + produto);
	   
	    
	    System.out.println();
	    System.out.println("Entre com a quantidade de produtos a serem removidos do estoque");
	    quantidade = sc.nextInt();
	    produto.removerProduto(quantidade);    
	    
	    System.out.println();
		System.out.println("Dados atualizados: " + produto);
	   
		sc.close();
	    
	    
	}

}

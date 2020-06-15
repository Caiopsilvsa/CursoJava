/* Favor identar mais tarde*/

package classes;

import java.util.Scanner;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook");
		p1.preco = 250.50f;
		
		
		Produto p2 = new Produto();
		p2.nome = "Lapis";
		p2.preco = 15.90f;		
Scanner scanner = new Scanner (System.in);
	


	  System.out.println("E feriado? ");
	  String resp =  scanner.nextLine();
	    
	  if (resp.contains("sim")) {
		   Produto.desconto = 0.30;
	  }
	double precof = p1.preco - Produto.desconto;
	 System.out.println(precof);
	  
	  
	scanner.close();
	}

}

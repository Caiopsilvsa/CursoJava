package oo.composi��o;

public class Comprateste {

	public static void main(String[] args) {
		
		Compra c1 = new Compra();
		c1.cliente = "Jo�o";
		c1.itens.add(new Item ("Caneta",20,7.5));
		c1.itens.add(new Item ("Borracha",12,3.89));
		c1.itens.add(new Item ("Caderno",3,18));
		
		  System.out.println(c1.itens.size());
	
	       System.out.println(c1.GetValorTotal());
	
	
	
	
	}
}

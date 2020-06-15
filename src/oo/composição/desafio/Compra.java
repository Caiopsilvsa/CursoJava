package oo.composição.desafio;

import java.util.ArrayList;


public class Compra {

	ArrayList<Item>itens = new ArrayList<Item>();
	
  	void adcitem(Produto p,int qtde) {
		this.itens.add(new Item(p, qtde));
	}

     double getvalortotal() {
    	 double total = 0;
     
    	 for(Item item:itens) {
    		 total +=item.quantidade * item.produto.preco;
    	 }
    	 
    	 return total;
     }

}

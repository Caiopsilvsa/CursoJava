package oo.composi��o;

import java.util.ArrayList;

public class Compra {

	String cliente;
	ArrayList<Item> itens = new ArrayList <Item>();

	  double GetValorTotal() {
		  double Total = 0;
		    for (Item i:itens) {
		    	Total = Total + i.quantidade * i.pre�o; 
		    }
		  
		  return Total;
	  }
	
}

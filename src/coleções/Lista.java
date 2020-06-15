package coleções;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
		ArrayList<Usuario> lista = new ArrayList<>();
		
		lista.add(new Usuario("Carlos"));
		Usuario u2 = new Usuario("Ana");
		lista.add(u2);
		lista.add(new Usuario("Bia"));
		
		System.out.println(lista.get(2)); // Acessar pelo índice 
	
	    for(Usuario u :lista) {
	    	System.out.println(u);
	    }
	
	}
}

package oo.polimorfismo;

public class Janta {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa(99);
		Comida entrada1 = new Arroz(2);
		Comida entrada2 = new Feijão(3);
	
	System.out.println(p1.getPeso());
	
	  p1.comer(entrada1);
	  p1.comer(entrada2);
       
       System.out.println(p1.getPeso());

	
    
	}	
}

package oo.herança.desafio;

public class Ferrari extends Carro {
 
	
	
	Ferrari(int velocidadeMaxima) {
		super(velocidadeMaxima);
		
	}

	boolean acelerar() {
	    	super.veloatual += 15;
	    return true;	
	}
	
}

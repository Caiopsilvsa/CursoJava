package oo.polimorfismo;

public abstract class Comida {

	private int peso;
	
	
	public Comida(int peso) {
		setPeso(peso);
	}
	
	
	public int getPeso() {
		
		return peso;
	}

     
	public void setPeso(int peso) {
		if (peso >= 0) {
			this.peso = peso;
			}
	    
	}

}

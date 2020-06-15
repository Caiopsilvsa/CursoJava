package oo.polimorfismo;

public class Pessoa {
	
private int peso;
	
	
	public Pessoa(int peso) {
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
    
	public void comer(Comida comida) {
		  this.peso += comida.getPeso();
	}
     
	

}

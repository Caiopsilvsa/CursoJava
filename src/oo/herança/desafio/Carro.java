package oo.herança.desafio;

public class Carro {

	final int VELOCIDADE_MAXIMA;
	
	int veloatual;
			
	Carro(int velocidadeMaxima){
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	  
	
	  boolean acelerar() {
		 if(veloatual + 5 > VELOCIDADE_MAXIMA) {
			 veloatual = VELOCIDADE_MAXIMA;
		 }
		 else { 
		 this.veloatual+=5;
		 }
		 return true;
		 
	  }

      boolean desacelerar () {
    	  if(this.veloatual >0) {
    		  this.veloatual-=3; 
            	
    	  }
    	  return true; 
      }
}

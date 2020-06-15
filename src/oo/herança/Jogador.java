package oo.herança;

public class Jogador {

	 int x;
     int y;
     int vida = 100;
    
     
     boolean atacar(Jogador oponente) {
    	 
    	 int deltax = Math.abs(x - oponente.x);
    	 int deltay = Math.abs(y - oponente.y);
    	 
    	 if (deltax == 0 && deltay == 1) {
    		 oponente.vida = oponente.vida = 10;
             return true;    	 
    	 }
    	 else
    		 if (deltax == 1 && deltay == 0) {
        		 oponente.vida = oponente.vida = 10;
        	     return true;
    		 }
    		 else {
    			 return false;
    		 }
    			 
     }
     
     
     
     boolean andar ( Direção direção) {
    	 if (direção == Direção.NORTE) {
    		 y--;
    	 }
    	 else
    		 
    	 if (direção == Direção.SUL) {
    		 y++;
    	 }
    	 else
    	 if (direção == Direção.LESTE) {
    		 x++;
    	 }
    	 else
    	 if (direção == Direção.OESTE) {
    		 x--;
    	 }
    	 
    	 return true;
     }
}

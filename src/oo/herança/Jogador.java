package oo.heran�a;

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
     
     
     
     boolean andar ( Dire��o dire��o) {
    	 if (dire��o == Dire��o.NORTE) {
    		 y--;
    	 }
    	 else
    		 
    	 if (dire��o == Dire��o.SUL) {
    		 y++;
    	 }
    	 else
    	 if (dire��o == Dire��o.LESTE) {
    		 x++;
    	 }
    	 else
    	 if (dire��o == Dire��o.OESTE) {
    		 x--;
    	 }
    	 
    	 return true;
     }
}

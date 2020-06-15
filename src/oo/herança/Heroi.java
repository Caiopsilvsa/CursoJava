package oo.herança;

public class Heroi extends Jogador {

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
}

package oo.herança;

public class Jogo {

	public static void main(String[] args) {
		
		Monstro monstro = new Monstro();
         monstro.x = 10;
         monstro.y = 20;
         
         Heroi heroi = new Heroi ();
         heroi.x = 10;
         heroi.y = 11;
         
         System.out.println("Monstro tem:" + monstro.vida);
         System.out.println("heroi tem:" + heroi.vida);
        
        monstro.atacar(heroi);
        heroi.atacar(monstro);
         
	}
}

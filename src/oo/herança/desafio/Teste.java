package oo.herança.desafio;

public class Teste {

	public static void main(String[] args) {
		
		Carro f1 = new Ferrari(150);
		Fusca f2 = new Fusca(150);
	
	   System.out.println(f1.veloatual);
	   System.out.println(f2.veloatual);
		
	   f1.acelerar();
	   f1.acelerar();
	   
	   f2.acelerar();
	   f2.acelerar();
	   
	   System.out.println(f1.veloatual);
	   System.out.println(f2.veloatual);
	   
	   f1.desacelerar();
	   f2.desacelerar();
	   
	   System.out.println(f1.veloatual);
	   System.out.println(f2.veloatual);
	   
	   
	   
	
	}
}

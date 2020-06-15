package oo.composição;

public class Carroteste {

	public static void main(String[] args) {
		Carro c1 = new Carro();
		
		  System.out.println(c1.status());
		  
		  c1.ligar();
		  System.out.println(c1.status());
		  
		 System.out.println(c1.motor.giros()); 
		  
	}
	
	
}

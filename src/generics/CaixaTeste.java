package generics;

public class CaixaTeste {

	public static void main(String[] args) {
		Caixa c1 = new Caixa();
		c1.guardar(2.3);
		
		Double coisa = (Double) c1.abrir();
		System.out.println(coisa);
	    
		
	}
}

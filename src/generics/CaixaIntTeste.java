package generics;

public class CaixaIntTeste {

	public static void main(String[] args) {
		CaixaInt  c1 = new CaixaInt();
		c1.guardar(1234);
		  Integer coisa = c1.abrir();
		  System.out.println(coisa);
		
		
	}
}

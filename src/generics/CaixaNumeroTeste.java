package generics;

public class CaixaNumeroTeste {

	public static void main(String[] args) {
		CaixaObjeto<Double> c1 = new CaixaObjeto<Double>();
		
		c1.guardar(22.2);
		System.out.println(c1.abrir());
		
        CaixaObjeto<Integer> c2 = new CaixaObjeto<Integer>();
		
		c2.guardar(22);
		System.out.println(c2.abrir());
		
		
	}
}

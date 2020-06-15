package generics;

public class CaixaObjetoTeste {

	public static void main(String[] args) {
	
       CaixaObjeto<String> c1 = new CaixaObjeto<>();
       c1.guardar("Olá");
       
       String coisa = c1.abrir();
       System.out.println(coisa);
		
	
       CaixaObjeto<Double> c2 = new CaixaObjeto<Double>();
       c2.guardar(3.234);
       
       Double coisa2 = c2.abrir();
       System.out.println(coisa2);
		
	
	}
}

package lambdas;

import java.util.function.Consumer;

public class Comsumidor {

	public static void main(String[] args) {
		
		Consumer<Produto>imprimir = p -> System.out.println(p.nome);
	
	      Produto pp = new Produto("Caneta",2.0,0.9);
	      imprimir.accept(pp);
	
	}
}

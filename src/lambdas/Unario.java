package lambdas;

import java.util.function.UnaryOperator;

public class Unario {
	
	public static void main(String[] args) {
		
		UnaryOperator<Integer> SomaDois = valor -> valor + 2;
		UnaryOperator<Integer> Multiplica = valor -> valor * 2;
		UnaryOperator<Integer> AoQuadrado = valor -> valor * valor;
		
		  int ResultadoFinal = SomaDois
				  .andThen(Multiplica)
				  .andThen(AoQuadrado)
				  .apply(0);
		  
		  System.out.println(ResultadoFinal);
		  
		  
		  int ResultadoFinal2 = AoQuadrado
				  .compose(Multiplica)
				  .compose(SomaDois)
				  .apply(0);
		  
		  System.out.println(ResultadoFinal2); 
		
		
	}

}

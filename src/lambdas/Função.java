package lambdas;

import java.util.function.Function;

public class Função {

	public static void main(String[] args) {
		
		Function<Integer, String> ParOuImpar = num -> num%2 == 0 ? "Par" : "Impar";
		Function<String, String> OresultadoE = valor -> "O resultado é" + valor;
		Function<String, String> Empolgado = valor -> "!!!";
		
		String ResultadoFinal = ParOuImpar
				.andThen(OresultadoE)
				.andThen(Empolgado).
				apply(32);
		  System.out.println(ResultadoFinal);
		 
		 
	} 
	
}

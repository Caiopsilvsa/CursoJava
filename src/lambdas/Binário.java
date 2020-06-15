package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class Binário {

	public static void main(String[] args) {
	
		BinaryOperator<Double> media = (n1, n2) -> (n1 + n2)/2;
		BiFunction<Double, Double, String> resultado = (n1, n2) -> {Double re = (n1+n2)/2;
		return re>=7  ? "Aprovado": "Reprovado";}; 
		
		
	}
}

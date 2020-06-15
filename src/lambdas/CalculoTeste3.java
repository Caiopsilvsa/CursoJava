package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {

	public static void main(String[] args) {
		
		  BinaryOperator<Double> conta = (x,y) -> {return x + y;};
		  
		  System.out.println(conta.apply(2.0, 3.0));
		
	
		  
		  
	}
}
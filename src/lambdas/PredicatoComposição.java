package lambdas;

import java.util.function.Predicate;

public class PredicatoComposição {

	public static void main(String[] args) {
		
		Predicate<Integer> Épar = valor -> valor %2 == 0;
		Predicate<Integer> ÉTres = valor -> valor >= 100 && valor<=999;
		
		  System.out.println(Épar.and(ÉTres).test(11));
	}
}

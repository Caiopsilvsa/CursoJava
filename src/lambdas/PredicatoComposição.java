package lambdas;

import java.util.function.Predicate;

public class PredicatoComposi��o {

	public static void main(String[] args) {
		
		Predicate<Integer> �par = valor -> valor %2 == 0;
		Predicate<Integer> �Tres = valor -> valor >= 100 && valor<=999;
		
		  System.out.println(�par.and(�Tres).test(11));
	}
}

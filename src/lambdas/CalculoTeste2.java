package lambdas;

public class CalculoTeste2 {

	public static void main(String[] args) {
		
		Calculo conta = (x,y) -> {
		  return x + y;};
		
	
		  System.out.println(conta.executar(3, 2));
		  
	}
}
package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {

	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Ana", "Gui", "Bia");
		
	 System.out.println("Forma tradicional....");	 
		for(String i: aprovados) {
			 System.out.println(i);
		 }
		
	 System.out.println("\nLambda #01...");
		aprovados.forEach((i) -> {System.out.println(i + "!!!");});
		
	System.out.println("\nLambda #02...");
		aprovados.forEach((i) -> {Meuimprimir(i);});	
		
	System.out.println("\nMethod Reference#01...");
	   aprovados.forEach(System.out::println);
	
	
	   System.out.println("\nMethod Reference#02...");
	   aprovados.forEach(Foreach::Meuimprimir);   
	
	}
  
	static void Meuimprimir(String nome) {
		System.out.println("Meu nome é: " + nome);
	}

}

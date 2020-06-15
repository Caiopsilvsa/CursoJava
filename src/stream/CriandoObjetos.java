package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CriandoObjetos {

	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Bia","Joao","Gui","Ana");
		 Stream<String> stream = aprovados.stream();
		 stream.forEach(System.out::println);
		 
		
		 
	}
}

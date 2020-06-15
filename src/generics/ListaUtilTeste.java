package generics;


import java.util.Arrays;
import java.util.List;

public class ListaUtilTeste {

	public static void main(String[] args) {
		
		List<String> Langs = Arrays.asList("JS", "PHP", "JAVA", "C++");
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6);
		
		String L = (String)  ListaUtil.getUltimo(Langs);
		System.out.println(L);
		
		Integer N = (Integer) ListaUtil.getUltimo(nums);
		System.out.println(N);
		
	}
}

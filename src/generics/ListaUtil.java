package generics;

import java.util.List;

public class ListaUtil {

	public static Object getUltimo(List<?> X) {
	
		return X.get(X.size() -1);
	}
}

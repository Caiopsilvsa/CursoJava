package cole��es;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBagun�ado {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main (String[] args) {
		
		HashSet conjunto = new HashSet();
		
           conjunto.add(1.2);
           conjunto.add("Ola");
           conjunto.add(true);
		
           System.out.println(conjunto);
             conjunto.remove(true);
             System.out.println(conjunto);
               System.out.println(conjunto.size());
           
         Set nuns = new HashSet();
          nuns.add(1);
	      nuns.add(2);
	      nuns.add(3);
	conjunto.addAll(nuns);
	  System.out.println(conjunto); // Uni�o entre dois conjuntos //
	 conjunto.retainAll(nuns); //interce��o entre conjuntos
	 System.out.println(conjunto);
	
	}
	
	
	
}

package exceção;

import exceção.personalizadoA.NumeroNegativoException;
import exceção.personalizadoA.StringVaziaException;

public class Validar {

	private Validar() {
		
	}
	
	public static void usuario (Aluno x) {
		
		if(x == null) {
			throw new IllegalArgumentException("O aluno esta nulo"); 
		}
	
	    if(x.nome == null || x.nome.trim().isEmpty()) {
	    	throw new StringVaziaException ("nome");
	    }
	
	
	    if(x.nota <0 || x.nota >10) {
	    	throw new NumeroNegativoException("nota");
	    }
	    
	}

}
	


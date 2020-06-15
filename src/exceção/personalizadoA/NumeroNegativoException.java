package exceção.personalizadoA;

@SuppressWarnings("serial")
public class NumeroNegativoException extends RuntimeException{
	

	public String nomeDoAtributo;

	public String getMessage() {
		return String.format("O atributo %s esta negativo", nomeDoAtributo);
	}

	

	public NumeroNegativoException(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	
	}
	 
	
	
}

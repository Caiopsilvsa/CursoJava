package exceção.personalizadoA;

@SuppressWarnings("serial")
public class StringVaziaException extends RuntimeException {

	public String nomeDoAtributo;

	public String getMessage() {
		return String.format("O atributo %s esta vazio", nomeDoAtributo);
	}

	

	public StringVaziaException(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	
	}
}

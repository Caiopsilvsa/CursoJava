package exceção.personalizadoA;

import exceção.Aluno;
import exceção.Validar;

public class Teste {

	public static void main(String[] args) {
		
		Aluno a = new Aluno("Ana", -7);
		
		try {
			Validar.usuario(a);
		} catch (StringVaziaException  | NumeroNegativoException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Fim");
		
		
		
	}
}

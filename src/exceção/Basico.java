package exceção;

public class Basico {

	public static void main(String[] args) {
		
		
		
	Aluno a1 = null;
	
	try {
	  Imprimialuno(a1);
	} catch (Exception excecao) {
		System.out.println("Ocorreu um erro		");
	}
	  
	
	try {
		System.out.println(7/0);
	} catch (ArithmeticException e ) {
	
		System.out.println("Ocorreu um erro" + e.getMessage());
	}
		
		System.out.println("Fim ");
		
	}
	
	public static void Imprimialuno(Aluno x) {
		System.out.println(x.nome);
	}
	
}

package exceção;

public class ChecadaVsNaoChecada {

	public static void main(String[] args) {
		
		try {
			geraErro1();
		} catch (RuntimeException e) {
			
			System.out.println(e.getMessage());
		}
		
		try {
			geraErro2();
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		
		System.out.println("Fim"); 
		
	}

     public static void geraErro1() {
    	 throw new RuntimeException("Ocorreu um erro");
     }

     public static void geraErro2() throws Exception {
    	throw new Exception("Ocorreu um erro denovo");
     }


}

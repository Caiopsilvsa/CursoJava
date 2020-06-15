package Fundamentos;

public class DesafioOpAritimeticos {

	public static void main (String[] args) {
	
		int a = 6*(3+2)/3*2;
		int a_verdadeiro = (int)  Math.pow(a, 2);
		
       int b = (1-5) * (2-7)/2;	
	   int Novob = (int)  Math.pow(b, 2);
	   int b_verdadeiro = a_verdadeiro - Novob;
	   
	   
	   int c = (int) Math.pow(b_verdadeiro, 3);
	   int c_verdadeiro = (int) Math.pow(10, 3);
	      
	   
	   int resposta = (c / c_verdadeiro);
	      
	        System.out.println(resposta);
	      
	} 
	
	/* O algoritimo está errado, o resultado deve dar 125*/
	
}

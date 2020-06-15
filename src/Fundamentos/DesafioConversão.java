package Fundamentos;

import java.util.Scanner;

public class DesafioConversão {
 
	public static void main (String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	    System.out.println("Digite o salário: ");
	       String sal1 = scanner.nextLine().replace(",", "." );
	           Float salario1 = Float.parseFloat(sal1);
 
	     System.out.println("Digite o salário: ");
		       String sal2 = scanner.nextLine().replace(",", "." );
		           Float salario2 = Float.parseFloat(sal2);        
	           
		 System.out.println("Digite o salário: ");
			   String sal3 = scanner.nextLine().replace(",", ".");
			        Float salario3 = Float.parseFloat(sal1);         
		           
		                Float media = salario1 + salario2 + salario3/3;       
		           
		              System.out.printf("Media dos salarios--> %3.1f",media);  
	
		              scanner.close();
	}
	
  
	
}

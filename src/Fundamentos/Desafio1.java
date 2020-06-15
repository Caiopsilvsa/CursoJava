package Fundamentos;

import java.util.Scanner;

public class Desafio1 {

   	public static void main(String[] args) {
		
    Scanner scanner = new Scanner(System.in);
   	    	
   		 System.out.print("Digite o numero em celciuls ");  
   		 float c = scanner.nextFloat();
   		 
   		 System.out.println("Numero em F");
	     System.out.print((c - 32) * 5/9.0);
   	   
   	
	
	scanner.close();
   	}
   	}

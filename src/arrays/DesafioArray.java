package arrays;

import java.util.Scanner;

public class DesafioArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		   double [] notas = new double [4];
		   int i;
		   double soma = 0;
		
	  for ( i = 0; i<notas.length;i++) {	   
	  	   
	       System.out.printf("Digite a %s nota: ",i+1);
	     notas[i] = scanner.nextDouble();
	       soma += notas[i];
	       
	  }   
	
	
         
		double media = soma/notas.length;
	System.out.printf("Media: %3.1f",media);
		scanner.close();
	}
	
	
}

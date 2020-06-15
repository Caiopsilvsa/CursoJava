package classes;

import java.util.Scanner;

public class JantarDesafio {

	public static void main (String[] args) {
	Scanner scanner = new Scanner (System.in);
	double fresp = 0;
	PessoaDesafio p1 = new PessoaDesafio("João", 10.2);
		
		Comidadesafio c1 = new Comidadesafio ("Arroz", 2.0);
		Comidadesafio c2 = new Comidadesafio ("Feijão",3.0);
		
		
	System.out.printf("Nome: %s ", p1.nome);
	System.out.printf("\nPeso atual:%f ",p1.peso);
	    
	  
	  System.out.println("\nQual comida você deseja?");
	          String resp = scanner.nextLine();

	             if (resp.contains("Arroz")){
	            	 
	            	  fresp = PessoaDesafio.comer(p1.peso,c1.pesoC);
	            	
	             }
	
                 if (resp.contains("Feijão")){
	            	 
	            	  fresp = fresp + PessoaDesafio.comer(p1.peso,c2.pesoC);
	            	 
	             }	              
	             
	             System.out.printf("Novo peso: %f", fresp);
                
	         
	             
scanner.close();	
	}

	
	}

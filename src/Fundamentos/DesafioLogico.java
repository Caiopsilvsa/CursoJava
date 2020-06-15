package Fundamentos;

import java.util.Scanner;

public class DesafioLogico {

	public static void main(String[] args) {
		
		Boolean job1;
		Boolean job2;
		String resp1;
		String resp2;
		
Scanner scanner = new Scanner (System.in);
         		 
          System.out.println("O trabalho de terça deu certo? ");		
           resp1 = scanner.nextLine();
           System.out.println("O trabalho de quinta deu certo? ");		
           resp2 = scanner.nextLine();

            
        
           
           
            if (resp1.contains("nao")) 
            	  
            	  job1 = false;
              
            else {
            	job1 = true;
            }
              
           
              if (resp2.contains("nao")) 
            	  job2 = false;
            	  
                
              else {
            	  job2 = true;
              }
         
       if (job1 && job2 == true) {   
            System.out.println("Ganhou tv de 50 polegadas!! ");       
                  	
	       }	
       else           
	  if (job1 || job2 == true) {
		  System.out.println(" Ganhou tv de 32 polegadas!");
	  }
	
	  else {
		  System.out.println("Vão passar fome!");
	  }
     scanner.close();      
}
}
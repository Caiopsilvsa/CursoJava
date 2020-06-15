package Fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main (String[] args) {
		
Scanner scanner = new Scanner(System.in);
     
     float num1;		
     float num2;
     String op; 
     
     System.out.println("\nDigite o primeiro operando: ");
         num1 = scanner.nextFloat();
       System.out.println("\nDigite o segundo operando: ");
         num2 = scanner.nextFloat();
       System.out.println("\nDigite a operação: ");
         op = scanner.next();
         
         if (op.equals("+")) {
         	System.out.printf("%f + %f = %f",num1,num2,num1 + num2);
         }

         if (op.equals("-")) {
         	System.out.printf("%f - %f = %f",num1,num2,num1 - num2);
         }
         if (op.equals("*")) {
         	System.out.printf("%2.1f * %2.1f = %2.1f",num1,num2,num1 * num2);
         }

         if (op.equals("/")) {
         	System.out.printf("%2.1f / %2.1f = %2.1f",num1,num2,num1 / num2);
         }
         if (op.equals("%")) {
         	System.out.printf("%2.1f % %2.1f = %2.1f",num1,num2,num1 % num2);
         }
                   
	scanner.close();
	}
	
}

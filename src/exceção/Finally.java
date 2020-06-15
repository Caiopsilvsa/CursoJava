package exceção;

import java.util.Scanner;

public class Finally {

	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in);
		
		try {
			System.out.println(7/ teclado.nextInt());
		} catch (Exception e) {
	
			System.out.println(e.getMessage());
		}
		
		finally {
			teclado.close();
		    System.out.println("Finalmente!!!");
		}
		
		
		
		System.out.println("Chegou ao fim!!");
		
	}
}

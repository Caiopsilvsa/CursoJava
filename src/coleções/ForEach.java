package coleções;

public class ForEach {

	public static void main(String[] args) {
		
		double [] num = {9.9,8.7,7.2,9.4};
	
	      for(int i =0; i<num.length;i++) {
	    	  System.out.println(num[i]);
	    	  
	    	  
	      }
	      System.out.println();
	      
	      for(double nums:num) {
	    	  System.out.println(nums);
	      }
	}
}

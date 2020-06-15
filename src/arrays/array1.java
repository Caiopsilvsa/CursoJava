package arrays;

public class array1 {

	public static void main(String[] args) {
		
		int [] array = new int [3]; 
		
	    for (int i = 1; i < array.length;i++) {
	    	
	    	array[i] = i;
	    	
	    	System.out.println(array[i]);
	    
	 /* foreach */
	    	for(int numb : array) 
	    {	
	    	System.out.println(numb);
	    
	    }

		
	
}
}
}
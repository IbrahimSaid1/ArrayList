package ArrayList;

public class MissingNumber {

	public static void main(String[] args) {
		
		   int[] numbers= {0,1,2,3,4,6,7};
		   for (int i=0; i< numbers.length; i++) {
		    if(i != numbers[i] ) {
			    System.out.println("Missing number is "+i);
		    	break; 
		    	
		    }
		   }
		      
	}

}

package ArrayList;

public class MissingNo {

	public static void main(String[] args) {
		
		  int[] numbers= {5,10,20,25,30};
		   int a=numbers[0];

		  
		   for (int i=0; i< numbers.length; i++) {
			   
		    if(a != numbers[i] ) {
		    	
				   System.out.println("Missing number is "+a);
		    }
		    
			   a= 5+numbers[i]; //Add 5 after each time

		   }
	}

}

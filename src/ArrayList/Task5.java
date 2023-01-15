package ArrayList;


public class Task5 {

	public static void main(String[] args) {
		int[] arr = {1,1,2,2,3,3,4,4};
		
		for(int i=0; i< arr.length-1 ; i++)  {
		
			if(arr[i] == arr[i+1]) {
		    System.out.println(arr[i]);
			}
		}
	}
	
}


/*Problem in this task:
 * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 8
	at ArrayList/ArrayList.Task5.main(Task5.java:11)

that is because i was writing the following code: 
for(int i=0; i< arr.length ; i++)  {
			if(arr[i] != arr[i+1]) 

(we can not use != and we should add -1 to rr.length)
*/
package ArrayList;

import java.util.Stack;

public class LongestDecreasingSubarray {

	public static void main(String[] args) {
		
		Stack<Integer> myStack= new Stack<>();
		Stack<Integer> myStack1= new Stack<>();

		int[] arr= {1,2,3,4,5,1,2,3};	
		int max= arr[0]; // Determine the first number as the largest number
		

		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]>= max) {
				
				max= arr[i];
			
				myStack.push(max); // Save all results in the stack

				
			}
				
			
		}
		
		Object[] arr1= myStack.toArray(); // Save the numbers of the stack in new array 
		
		for(int j= arr1.length; j>0; j--) { // Start the loop of the largest number
			myStack1.push(j); // Save the numbers in new stack

		}
		
		System.out.print(myStack1); 

	}
 	

}


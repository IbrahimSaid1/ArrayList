package ArrayList;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5,6,7};
		Scanner sca= new Scanner(System.in);
		System.out.print("Enter number: ");
		int number= sca.nextInt();
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				if(arr[i]+arr[j]== number) {
					System.out.println("["+arr[i]+", "+arr[j]+"]");
				}
			}
		}

	}

}

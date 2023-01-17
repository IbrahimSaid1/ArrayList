package ArrayList;

import java.util.Scanner;

public class AppearNo {

	public static void main(String[] args) {
		
		int[] num= {1,2,3,10,12,14,15,16,20,10,20,15,15};
	
		Scanner sca= new Scanner(System.in);
		System.out.print("Enter number: ");
		int number= sca.nextInt();
		int count=0;
		if(number>10) { // The number should be greater than 10
		for(int i=0; i<num.length; i++) {
			if(num[i]==number) {
				count++; //count how many times repeated the number
			}
			
		}
		
		System.out.println(number+" appear "+count+" times");
		}
		
		else {
			System.out.println("The number should be greater than 10.");
		}
	}

}

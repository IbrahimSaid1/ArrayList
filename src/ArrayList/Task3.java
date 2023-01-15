package ArrayList;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		
		int[] num= {1,2,3,4,1,3,5,3,5};
		Scanner sca= new Scanner(System.in);
		System.out.print("Enter number: ");
		int number= sca.nextInt();
		int count=0;
		for(int i=0; i<num.length; i++) {
			if(num[i]==number) {
				count++;
			}
			
		}
		
		System.out.println(number+" appear "+count+" times");

	
	}

}

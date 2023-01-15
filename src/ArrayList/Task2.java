package ArrayList;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner sca= new Scanner(System.in);
		System.out.print("Please enter first number: ");
		int num1= sca.nextInt();
		while(num1<0 || num1>100){
			System.out.print("Please enter first number again: ");
			num1= sca.nextInt();
		}
		System.out.print("Please enter second number: ");
		int num2= sca.nextInt();
			while(num2<0 || num2>100) {
				System.out.print("Please enter second number again: ");
				num2= sca.nextInt();
			}
			System.out.println("Done");

	}

}

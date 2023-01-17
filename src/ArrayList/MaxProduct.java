package ArrayList;

import java.util.Arrays;

public class MaxProduct {

	public static void main(String[] args) {
		int[] num= {4,3,2,1,5,6,7,8};
		Arrays.sort(num);
		
			for(int j= num.length-1; j>=num.length-4; j--) {

			int mul= num[j]* num[j-1]* num[j-2]* num[j-3];
			
			System.out.println("The result= "+ mul+" ("+num[j]+", "+num[j-1]+", "+num[j-2]+", "+num[j-3]+")");
			
			break;
			
			}
			
	}
}



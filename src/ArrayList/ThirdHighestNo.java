package ArrayList;

import java.util.Arrays;

public class ThirdHighestNo {

	public static void main(String[] args) {
		int[] num= {4,3,2,1,5,6,7,8};
		Arrays.sort(num);
		for(int j= num.length-1; j>=num.length-3; j--) {
			System.out.println("The third highest number is "+num[j-2]);
			break;
		}
	}

}

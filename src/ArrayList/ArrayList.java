package ArrayList;

public class ArrayList {

	public static void main(String[] args) {
		int[] num= {1,2,22,2,5,55,14};
		int largest= Integer.MIN_VALUE;
		int index=0;
		while(index< num.length) {
			
			if (largest< num[index]) {
				largest= num[index];
			}
			index++;
		}
		System.out.println("The largest number is "+largest);

			}
		 
}



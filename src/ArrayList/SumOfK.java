package ArrayList;


public class SumOfK {

	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5,6,7};
		int k=10;
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=i+1; j<arr.length; j++) {
				
				if(arr[i]+arr[j]== k  && arr[i]%2==0 && arr[j]%2==0) {
					System.out.println("["+arr[i]+", "+arr[j]+"]");
				}
				
			}
		}
	}

}

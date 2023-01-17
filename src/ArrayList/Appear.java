package ArrayList;


public class Appear {

	public static void main(String[] args) {
		int[] num= {1,2,3,4,1,3,5,3,5};
		int count = 1;
	
		for(int i=0; i<num.length; i++) {
			for(int j=i+1; j< num.length; j++) {
				if(num[i] != num[j] && i != j){
				
					while(count<=2) {
					System.out.println(num[i]+" appear one time");
					count++;
					break;
					}
				}
			}
			

		}
		

	}

}

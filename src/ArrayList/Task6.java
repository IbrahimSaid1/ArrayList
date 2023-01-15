package ArrayList;

public class Task6 {

	public static void main(String[] args) {
		
		int[] rise= {900, 1200, 1200, 1210, 900, 750, 1050};
		int[] wheat= {1100, 1900, 1500, 1500, 1500, 1500, 1400};
		int[] cotton= {200, 700, 300, 290, 600, 750, 350};
		
		int maxRise= rise[0];
		int maxWheat= wheat[0];
		int maxcotton= cotton[0];
		
		
		for(int i=0; i< 6; i++) {
			
 		int profit= rise[i]-rise[i+1];
 		rise[i]= profit;
 		
			if(rise[i]<maxRise ){
				maxRise = rise[i];
				int a= 0-maxRise;
				System.out.println("Maximum profit of rise is "+a);
			}
		}
			

		
		
		for(int j=0; j<6; j++) {
			int profit1= wheat[j]-wheat[j+1];
			wheat[j]= profit1;
			
			if(wheat[j]<maxWheat) {
				maxWheat= wheat[j];
				int b= 0-maxWheat;
				System.out.println("Maximum profit of wheat is "+b);
			}
		}
		
		
		
			for(int l=0; l<6; l++) {
			int profit2= cotton[l]-cotton[l+1];
				cotton[l]= profit2;
				
				if(cotton[l]<maxcotton) {
					maxcotton= cotton[l];
					int c= 0-maxcotton;
					System.out.println("Maximum profit of cotton is "+c);
				}
			}
	}
}
		


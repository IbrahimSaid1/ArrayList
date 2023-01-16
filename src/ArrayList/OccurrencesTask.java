package ArrayList;

import java.util.HashSet;

public class OccurrencesTask {

	public static void main(String[] args) {
		String[] names= {"Atyab", "Fatima", "Saeed", "Malak", "Fatima", "Daniyal", "Abdullah", "Abdullah"};
		HashSet<String> name= new HashSet<>();
		int count=0;
		for(String element : names) {
			if(name.contains(element)) {
				count++;
			}
		
			System.out.println(name+"   "+count);
			
		}

	}

}

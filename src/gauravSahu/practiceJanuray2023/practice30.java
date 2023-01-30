
package gauravSahu.practiceJanuray2023;

import java.util.HashSet;

public class practice30 {
	
	void getDupName(String[] array) {
		for(int index = 0;index<array.length;index++) {
			boolean flag = true;
			for(int i = index + 1; i<array.length;i++) {
				if(array[index].equals(array[i]) && index!=i) {
					flag = false;
					
				}
			}if(!flag) {
				System.out.println(array[index]);
			}
		}
	}
	
	void getDupHash(String [] input) {
		
		HashSet<String> set1 = new HashSet<String>();
		HashSet<String> set2 = new HashSet<String>();
		for(String name : input) {
			if(!set1.add(name)) {
				set2.add(name);
			}
		}
		System.out.println(set2);
	}
	

	
	public static void main(String[] args) {
		String[] input = { "Maulik", "Umesh", "Saroj", "Umesh" };
		
		new practice30().getDupName(input);
		new practice30().getDupHash(input);
	}
}

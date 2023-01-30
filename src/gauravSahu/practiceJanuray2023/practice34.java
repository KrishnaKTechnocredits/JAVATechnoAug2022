package gauravSahu.practiceJanuray2023;

import java.util.ArrayList;
import java.util.Arrays;

public class practice34 {
	
	public static void main(String[] args) {
		Integer[] input = {3,5,33,3,55,3,11,11};
		
		ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(input));
		ArrayList<Integer> al2  = new ArrayList<Integer>();
		
		while(al.size()>0) {
			int num = al.get(0);
			int a = al.size();
			al2.add(num);
			al.removeAll(al2);
			int b = al.size();
			System.out.println(num + "---" + (a-b));
			al2.clear();
		}
		
		Integer [] input2 = {60,54,51,57};
		
		ArrayList<Integer> al3 = new ArrayList<Integer>(Arrays.asList(input2));
		ArrayList<Integer> al4  = new ArrayList<Integer>();
		
		
			for(int i = 50 ; i<=60 ; i++) {
				if(!al3.contains(i)) {
					al3.add(i);
				}
			}
		
		System.out.println(al3);
		
	}

}

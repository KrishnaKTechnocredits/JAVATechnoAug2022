package gauravSahu.practiceJanuray2023;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

import akankshaVyas.StringOperation.Array;

public class practice33 {
	
	public static void main(String[] args) {
		
		Integer [] input = {10,10,13,12,12,10,55,66,55,11,11};
		
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		
		for(int num : input){
			set.add(num);
		}
		
		System.out.println(set);
		
		ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(input));
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		
		for(int num : al) {
			if(!al2.contains(num) && al.indexOf(num) != al.lastIndexOf(num)) {
				al2.add(num);
			}
		}
		System.out.println(al2);
		
	}

}

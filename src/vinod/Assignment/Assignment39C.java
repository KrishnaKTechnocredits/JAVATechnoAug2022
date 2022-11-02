package vinod.Assignment;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Assignment39C {
	
	void getDuplicateNum(Integer[] input) {
		LinkedHashSet<Integer> listOfNum1 = new LinkedHashSet<Integer>();
		for(Integer num : input) {
				listOfNum1.add(num);
		}System.out.println("Dupliacted number removed : " + listOfNum1);
	}
	
	public static void main(String[] args) {
		Assignment39C assign39C = new Assignment39C();
		Integer[] array =  {10,10,13,12,12,10,55,66,55,11};
		System.out.println("Input array : " + Arrays.toString(array));
		assign39C.getDuplicateNum(array);
		
	}
}
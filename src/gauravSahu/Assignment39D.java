/*
Program 4 : Remove duplicates from array containing numbers [insertion order].

input : {10,10,13,12,12,10,55,66,55,11}
output : [10,13,12,55,66,11]
*/

package gauravSahu;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Assignment39D {
	
	void getDuplicateNum(Integer[] input) {
		LinkedHashSet<Integer> listOfNum1 = new LinkedHashSet<Integer>();
		for(Integer num : input) {
				listOfNum1.add(num);
		}System.out.println("Dupliacted number removed : " + listOfNum1);
	}
	
	public static void main(String[] args) {
		Assignment39D a39 = new Assignment39D();
		Integer[] array =  {10,10,13,12,12,10,55,66,55,11};
		System.out.println("Input array : " + Arrays.toString(array));
		a39.getDuplicateNum(array);
		
	}
}

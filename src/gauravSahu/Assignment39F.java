/*
Program 6 : Remove duplicates from array containing numbers using Set.

input : {10,10,13,12,12,10,55,66,55,11,11}
output : [10,12,55,11]
*/
package gauravSahu;


import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Assignment39F {
		
		void removeDuplicateNum(Integer[] input) {
			Set<Integer> setOfNum1 = new LinkedHashSet<Integer>();
			Set<Integer> setOfNum2 = new LinkedHashSet<Integer>();
			for(Integer num : input) {
				if(!setOfNum1.add(num)) {
					setOfNum2.add(num);
				}
			}System.out.println("Output array : " + setOfNum2);
		}
	public static void main(String[] args) {
		Assignment39F a39 = new Assignment39F();
		Integer[] input = {10,10,13,12,12,10,55,66,55,11,11};
		System.out.println("Input Number array : " + Arrays.toString(input));
		a39.removeDuplicateNum(input);
	}

}

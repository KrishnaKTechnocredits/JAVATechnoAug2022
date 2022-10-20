/*Program 5 : Remove duplicates from array containing numbers [natural order].

input : {10,10,13,12,12,10,55,66,55,11}
output : [10,11,12,13,55,66]*/
package gauravSahu;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Assignment39E {

	void getDuplicateNumber(Integer[] input) {
		HashSet<Integer> setOfNum1 = new HashSet<Integer>();
		for (Integer num : input) {
			setOfNum1.add(num);
		}
		System.out.println("Duplicates Numbers are removed : " + setOfNum1);
	}
	
	void getDuplicateNumberUsingLHS(Integer[] input) {
		LinkedHashSet<Integer> setOfNum2 = new LinkedHashSet<Integer>();
		for (Integer num : input) {
			setOfNum2.add(num);
		}
		System.out.println("Duplicates Numbers are removed using LHS : " + setOfNum2);
	}
	

	public static void main(String[] args) {
		Assignment39E a39 = new Assignment39E();
		Integer[] input = { 10, 10, 13, 12, 12, 10, 55, 66, 55, 11 };
		a39.getDuplicateNumber(input);
		a39.getDuplicateNumberUsingLHS(input);
	}
}

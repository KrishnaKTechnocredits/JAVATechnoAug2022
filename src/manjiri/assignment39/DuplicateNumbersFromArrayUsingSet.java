/*Program 6 : Remove duplicates from array containing numbers using Set.
input : {10,10,13,12,12,10,55,66,55,11,11}
output : [10,12,55,11]*/


package manjiri.assignment39;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateNumbersFromArrayUsingSet {
	
	Set<Integer> getDuplicateNumbers(Integer[] numArr){
		System.out.println(Arrays.toString(numArr));
		System.out.println("-----------------------------------------------");
		
		Set<Integer> setNumbers = new LinkedHashSet<Integer>();
		Set<Integer> outputSet = new LinkedHashSet<Integer>();
		
		boolean flag = true;
		for (Integer num : numArr) {
			flag = setNumbers.add(num);
			if(!flag) {
				outputSet.add(num);
			}
		}
		return outputSet;
	}
	
	public static void main(String[] args) {
		Integer numArr[] = {10,10,13,12,12,10,55,66,55,11,11};
		Set<Integer> newSetNumbers = new DuplicateNumbersFromArrayUsingSet().getDuplicateNumbers(numArr);
		System.out.println(newSetNumbers);
	}
}

/*Program 4 : Remove duplicates from array containing numbers [insertion order].

input : {10,10,13,12,12,10,55,66,55,11}
output : [10,13,12,55,66,11]
 */

package sagarY.Assignment_39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class PrintDuplicateNumbersUsingSet {

	void printUniqueNumbersUsingSet(Integer[] num) {
		List<Integer> arr = Arrays.asList(num);
		
		LinkedHashSet<Integer> output = new LinkedHashSet<Integer>(arr);
		
		System.out.println("Output after removing duplicate number \nin insertion order is: \n"+output);
	}
	
	public static void main(String[] args) {
		System.out.println("Program 4 : Remove duplicates from array containing \nnumbers [insertion order].");
		System.out.println("===================================================");
		Integer[] input = {10,10,13,12,12,10,55,66,55,11};
		System.out.println("Input is: "+Arrays.toString(input)+"\n");
		PrintDuplicateNumbersUsingSet print =  new PrintDuplicateNumbersUsingSet();
		print.printUniqueNumbersUsingSet(input);
	}
	
}

/*Program 6 : Remove duplicates from array containing numbers using Set.

input : {10,10,13,12,12,10,55,66,55,11,11}
output : [10,12,55,11]
 */

package sagarY.Assignment_39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class PrintDuplicateNumbersUsingHashSet {

	void printDuplicateNumbersUsingHashSet(Integer[] input) {
		List<Integer> arr = Arrays.asList(input);
		
		HashSet<Integer> output = new HashSet<Integer>();
		LinkedHashSet<Integer> result = new LinkedHashSet<Integer>();
		
		for(int num: arr) {
			if(!output.add(num))
				result.add(num);				
		}
		
		System.out.println("Output after removing duplicate number in Natural order is: \n"+result);
	}
	
	public static void main(String[] args) {
		System.out.println("Program 6 : Remove duplicates from array containing \nnumbers using Set.");
		System.out.println("===================================================");
		Integer[] input = {10,10,13,12,12,10,55,66,55,11,11};
		System.out.println("Input is: "+Arrays.toString(input)+"\n");
		PrintDuplicateNumbersUsingHashSet print =  new PrintDuplicateNumbersUsingHashSet();
		print.printDuplicateNumbersUsingHashSet(input);
	}
	
}

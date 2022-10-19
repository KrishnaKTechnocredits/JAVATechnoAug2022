/*Program 5 : Remove duplicates from array containing numbers [natural order].

input : {10,10,13,12,12,10,55,66,55,11}
output : [10,11,12,13,55,66]
 */

package sagarY.Assignment_39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

public class PrintDuplicateNumbersInNaturalOrder {

	void printDuplicateNumbersInNaturalOrder(Integer[] num) {
		List<Integer> arr = Arrays.asList(num);
		
		TreeSet<Integer> output = new TreeSet<Integer>(arr);
		
		System.out.println("Output after removing duplicate number \nin Natural order is: \n"+output);
	}
	
	public static void main(String[] args) {
		System.out.println("Program 5 : Remove duplicates from array containing\n numbers [natural order].");
		System.out.println("===================================================");
		Integer[] input = {10,10,13,12,12,10,55,66,55,11,11};
		System.out.println("Input is: "+Arrays.toString(input)+"\n");
		PrintDuplicateNumbersInNaturalOrder print =  new PrintDuplicateNumbersInNaturalOrder();
		print.printDuplicateNumbersInNaturalOrder(input);
	}
	
}

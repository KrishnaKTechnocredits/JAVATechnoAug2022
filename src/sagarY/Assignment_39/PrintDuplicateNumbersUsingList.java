/*Program 7 : Return duplicates from array containing numbers using List.

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

public class PrintDuplicateNumbersUsingList {

	void printDuplicateNumbersUsingHashSet(Integer[] input) {
		List<Integer> arr = Arrays.asList(input);
		
		ArrayList<Integer> output = new ArrayList<Integer>(arr);
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		for(int num: output) {
			if(!(output.indexOf(num)==output.lastIndexOf(num)) && result.contains(num)==false){
					result.add(num);
				}
		}
		
		System.out.println("Output after printing duplicate number \nusing List is: "+result);
	}
	
	public static void main(String[] args) {
		System.out.println("Program 7 : Return duplicates from array \ncontaining numbers using List");
		System.out.println("========================================================");
		Integer[] input = {10,10,13,12,12,10,55,66,55,11,11};
		System.out.println("Input is: "+Arrays.toString(input)+"\n");
		PrintDuplicateNumbersUsingList print =  new PrintDuplicateNumbersUsingList();
		print.printDuplicateNumbersUsingHashSet(input);
	}
	
}

/*Program 5 : Remove duplicates from array containing numbers [natural order].

input : {10,10,13,12,12,10,55,66,55,11}
output : [10,11,12,13,55,66]*/
package adittyThakare.collections;


import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Assignment39_Program5 {

	Set<Integer> returnUniqueNumberFromArrayNaturalOrder(int[] inputArray) {

		Set<Integer> outputHashSet = new TreeSet<Integer>();

		for (int num : inputArray) {
			outputHashSet.add(num);
		}

		return outputHashSet;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment39_Program5 assignment39_Program5 = new Assignment39_Program5();
		int[] arr = {10,10,13,12,12,10,55,66,55,11};
		System.out.println("Remove duplicates from array containing numbers [natural order]");
		System.out.println("\nInput array: "+Arrays.toString(arr));
		System.out.println("Output: "+assignment39_Program5.returnUniqueNumberFromArrayNaturalOrder(arr));
	}

}

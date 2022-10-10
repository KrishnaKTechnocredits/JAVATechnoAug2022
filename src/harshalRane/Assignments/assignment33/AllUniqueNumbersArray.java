/*
 * Program 6 : print unique numbers from given array (all content uniquely). 
input : {10,20,10,44,33,55,33};
output : 10 
         20
         44
		 33 
		 55
 */
package harshalRane.Assignments.assignment33;

import java.util.Arrays;

public class AllUniqueNumbersArray {
	void getAllUniqueNumbersFromArray(int[] input) {
		System.out.println("All unique numbers from given array are: ");
		for(int index=0;index<input.length;index++) {
			int count=0;
			for(int innerIndex=index+1;innerIndex<input.length;innerIndex++) {
				if(input[index]==input[innerIndex]) {
					count++;
					input[innerIndex] = 0;
				}
			}
			if(count>=0 && input[index]!=0) {
				System.out.println(input[index]);
			}
		}
	}
	
	public static void main(String[] args) {
		AllUniqueNumbersArray a = new AllUniqueNumbersArray();
		int[] input = {10,20,10,44,33,55,33};
		System.out.println("Input Array "+ Arrays.toString(input));
		a.getAllUniqueNumbersFromArray(input);
	}
}

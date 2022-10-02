/*
 * print unique numbers from given array (having freq 1). 
input : {10,20,10,44,33,55,33};
output : 20
         44
		 55
 */
package harshalRane.Assignments.assignment33;

import java.util.Arrays;

public class UniqueNumberArray {
	void printUniqueNumbersFromArray(int[] numbers) {
		System.out.println("Unique numbers from given array are: ");
		for(int index=0;index<numbers.length;index++) {
			boolean flag = true;
			for(int innerIndex=index+1;innerIndex<numbers.length;innerIndex++) {
				if(numbers[index]==numbers[innerIndex] && index!=innerIndex) {
					numbers[innerIndex] = 0;
					flag = false;
				}
			}
			if(flag && numbers[index]!=0)
				System.out.println(numbers[index]);
		}
	}
	
	public static void main(String[] args) {
		UniqueNumberArray u = new UniqueNumberArray();
		int[] input = {10,20,10,44,33,55,33};
		System.out.println("Input Array: "+ Arrays.toString(input));
		u.printUniqueNumbersFromArray(input);
	}
}

/*
 * program 3 : print missing numbers from given array from range 1 to 10. 
input : {1,3,9,5,6,10}
output : 2
		 4
		 7
		 8
 */
package harshalRane.Assignments.assignment33;

import java.util.Arrays;

public class MissingNumbersArray {
	void getMissingNumbersFromArray(int[] input) {
		System.out.println("Missing numbers from given array are: ");
		for(int num=1;num<=10;num++) {
			boolean flag=true;
			for(int innerIndex=0;innerIndex<input.length;innerIndex++) {
				if(num==input[innerIndex]) {
					flag=false;
				}
			}
			if(flag) {
				System.out.println(num);
			}
		}
	}
	
	public static void main(String[] args) {
		MissingNumbersArray m = new MissingNumbersArray();
		int[] input =  {1,3,9,5,6,10};
		System.out.println("Input Array: "+ Arrays.toString(input));
		m.getMissingNumbersFromArray(input);
	}
}

/*

Assignment - 33 : 10th Oct'2022

Program 1: print duplicate numbers from given array. 

input  {10,20,10,44,33,55,33};
output : 10
		 33
 */
package pranjaliV.assignment33;
import java.util.Arrays;

public class DuplicateNums {
	
	void printDuplicateNum(int[] input) {
		for(int index=0; index<input.length; index++) {
			for(int innerIndex=0; innerIndex<input.length; innerIndex++) {
				if(input[index]==input[innerIndex] && index!=innerIndex) {
					System.out.println(input[index]);
					input[index] = 0;// to avoid repeating the already printed duplicate numbers in future iteration
					break;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		DuplicateNums ex33 = new DuplicateNums();
		System.out.println("------------------------------");
		System.out.println("Program 1: print duplicate numbers from given array.");
		int[] input1 =  {10,20,10,44,33,55,33};
		System.out.println("Input = "+Arrays.toString(input1));
		System.out.println("Output:");
		ex33.printDuplicateNum(input1);
		System.out.println("");

	}

}

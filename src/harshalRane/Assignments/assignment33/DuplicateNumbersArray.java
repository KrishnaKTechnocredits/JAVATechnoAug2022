/*
 * Program 1: print duplicate numbers from given array. 
input : {10,20,10,44,33,55,33};
output : 10
		 33
 */
package harshalRane.Assignments.assignment33;

import java.util.Arrays;

public class DuplicateNumbersArray {
	//Option1: method to print duplicate numbers in given array
	void printDuplicateNumbersFromArray(int[] numbers) {
		System.out.println("Duplicate Numbers in Input Array are: ");
		for(int index=0;index<numbers.length;index++) {
			for(int innerIndex=index+1;innerIndex<numbers.length;innerIndex++) {
				if(numbers[index]==numbers[innerIndex])
					System.out.println(numbers[innerIndex]);
			}
		}
	}
	
	//Option2: method to replace duplicate number with 0 and print duplicate numbers
	void printDuplicateNumFromArray(int[] numbers) {
		int replaceNum=0;
		System.out.println("Duplicate Numbers in Input Array are: ");
		for(int index=0;index<numbers.length;index++) {
			int count = 1;
			for(int innerIndex=index+1;innerIndex<numbers.length;innerIndex++) {
				if(numbers[index]==numbers[innerIndex] && numbers[index]!=replaceNum) {
					count++;
					numbers[innerIndex] = replaceNum;
				}
			}
			if(count>1) {
				System.out.println(numbers[index]);
			}
		}
	}
	
	public static void main(String[] args) {
		DuplicateNumbersArray a = new DuplicateNumbersArray();
		int[] input = {10,20,10,44,33,55,33};
		System.out.println("*** Option1 ***");
		System.out.println("Input Array " +Arrays.toString(input));
		a.printDuplicateNumbersFromArray(input);
		
		System.out.println("\n*** Option2 ***");
		int[] input1 = {10,20,10,44,33,55,33,10,33};
		System.out.println("Input Array " +Arrays.toString(input1));
		a.printDuplicateNumFromArray(input1);
	}
}

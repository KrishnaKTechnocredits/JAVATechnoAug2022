/*Assignment 40 : 16th Oct'2022
Program 2 : Find missing numbers from give array from 50 to 60.
input : {60,54,51,57}
output : [50,52,53,55,56,58,59]

Hint : removeAll*/
package adittyThakare.collections;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment40_Program2 {
	
	ArrayList<Integer> findMissingNumbersFromArray(Integer[] arr, int startIndex, int endIndex) {
		
		ArrayList<Integer> inputList = new ArrayList<>(Arrays.asList(arr));
		ArrayList<Integer> outputList = new ArrayList<>();
		
		for(int index=startIndex;index<endIndex;index++) {
			outputList.add(index);
		}
		outputList.removeAll(inputList);
		return outputList;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment40_Program2 assignment40_Program2 = new Assignment40_Program2();
		System.out.println("Find missing numbers from give array from 50 to 60");
		Integer[] input = {60,54,51,57};
		System.out.println("\nInput Array: "+Arrays.toString(input));
		System.out.println("\nMissing numbers from 50 to 60: "+assignment40_Program2.findMissingNumbersFromArray(input, 50, 60));
		
	}

}

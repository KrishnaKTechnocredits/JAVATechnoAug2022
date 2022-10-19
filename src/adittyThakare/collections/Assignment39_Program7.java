/*Program 7 : Remove duplicates from array containing numbers using List.

input : {10,10,13,12,12,10,55,66,55,11,11}
output : [10,12,55,11]*/
package adittyThakare.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Assignment39_Program7 {
	List<Integer> removeDuplicateNumbersFromArray(Integer[] arr){
		
		ArrayList<Integer> listOfNum = new ArrayList<>(Arrays.asList(arr));
		ArrayList<Integer> outputList = new ArrayList<Integer>();
		
		for(Integer num:listOfNum) {
			if(listOfNum.indexOf(num)!=listOfNum.lastIndexOf(num) && !outputList.contains(num)) {
				outputList.add(num);
			}
		}
		return outputList;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment39_Program7 assignment39_Program7 = new Assignment39_Program7();
		Integer[] input = {10,10,13,12,12,10,55,66,55,11,11};
		System.out.println("Remove duplicates from array containing numbers using List.");
		System.out.println("\nInput array: "+Arrays.toString(input));
		System.out.println("Output: "+assignment39_Program7.removeDuplicateNumbersFromArray(input));
	}
}

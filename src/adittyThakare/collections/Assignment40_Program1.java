/*Assignment 40 : 16th Oct'2022

Program 1 : Find frequency of each number using array and single while loop.
input : {3,5,33,3,55,3,11,11}
output : 3--->3
		5--->1
		33--->1
		55--->1
		11--->2*/
package adittyThakare.collections;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment40_Program1 {

	void findFrequencyOfNumber(Integer[] arr) {
		ArrayList<Integer> listOfNum = new ArrayList<Integer>(Arrays.asList(arr));
		ArrayList<Integer> tempList = new ArrayList<Integer>();
		int num = 0;
		int originalLength = 0;
		int newLength = 0;
		while (listOfNum.size() > 0) {
			num = listOfNum.get(0);
			originalLength = listOfNum.size();
			tempList.add(num);
			listOfNum.removeAll(tempList);
			newLength = listOfNum.size();
			System.out.println(num + " --> " + (originalLength - newLength));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment40_Program1 assignment40_Program1 = new Assignment40_Program1();
		System.out.println("Find frequency of each number using array and single while loop.");
		Integer[] input = { 3, 5, 33, 3, 55, 3, 11, 11 };
		System.out.println("\nInput Array: "+Arrays.toString(input));
		System.out.println("\nOutput: ");
		assignment40_Program1.findFrequencyOfNumber(input);
	}

}

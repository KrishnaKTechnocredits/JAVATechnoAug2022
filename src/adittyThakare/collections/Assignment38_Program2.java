/*Assignment - 38 : 14th Oct'2022
Program 2: 
Increase student marks by 10 if marks is less than 35.

input : [23,55,34,88,58,81]
output : [33,55,44,88,58,81]*/
package adittyThakare.collections;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment38_Program2 {

	ArrayList<Integer> increaseStudentMarks(ArrayList<Integer> listOfNum) {
		for (int index = 0; index < listOfNum.size(); index++) {
			if (listOfNum.get(index) < 35) {
				listOfNum.set(index, listOfNum.get(index) + 10);
			}
		}
		return listOfNum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment38_Program2 assignment38_Program2 = new Assignment38_Program2();
		Integer[] arr = { 23, 55, 34, 88, 58, 81 };
		ArrayList<Integer> listOfNum = new ArrayList<Integer>(Arrays.asList(arr));
		System.out.println("Program to increase marks by 10 if marks are less than 35!");
		System.out.println("\nInput list: " + listOfNum);
		System.out.println("\nOutput list: " + assignment38_Program2.increaseStudentMarks(listOfNum));
	}

}

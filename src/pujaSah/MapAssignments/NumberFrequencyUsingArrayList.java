/*Assignment 40 : 16th Oct'2022

Program 1 : Find frequency of each number using array and single while loop.
input : {3,5,33,3,55,3,11,11}
output : 3--->3
		5--->1
		33--->1
		55--->1
		11--->2

Program 2 : Find missing numbers from give array from 50 to 60.
input : {60,54,51,57}
output : [50,52,53,55,56,58,59]*/

package pujaSah.MapAssignments;

import java.util.ArrayList;
import java.util.Arrays;

class NumberFrequencyUsingArrayList {

	// method to print frequency of each number using arrayList and single while loop
	void displayNumberFrequencyUsingArrayList(Integer[] numArr) {
		ArrayList<Integer> listOfNum = new ArrayList<Integer>(Arrays.asList(numArr));
		ArrayList<Integer> tempList = new ArrayList<Integer>();

		System.out.println("Input list of numbers: " + listOfNum);
		System.out.println("Frequency Of each number are: ");
		int afterSize = 0;
		int beforeSize = 0;
		int num = 0;
		int size = 0;

		while (listOfNum.size() > 0) {
			num = listOfNum.get(0);
			beforeSize = listOfNum.size();
			tempList.add(num);
			listOfNum.removeAll(tempList);
			afterSize = listOfNum.size();
			size = beforeSize - afterSize;
			System.out.println(num + "-->" + size);
		}
	}

	public static void main(String[] args) {
		Integer[] numArr = { 3, 5, 33, 3, 55, 3, 11, 11 };
		new NumberFrequencyUsingArrayList().displayNumberFrequencyUsingArrayList(numArr);
	}
}
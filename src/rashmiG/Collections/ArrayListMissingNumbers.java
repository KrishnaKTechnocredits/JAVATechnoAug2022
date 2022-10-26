/*Assignment 40 : 16th Oct'2022

Program 2 : Find missing numbers from give array from 50 to 60.
input : {60,54,51,57}
output : [50,52,53,55,56,58,59]

Hint : removeAll*/

package rashmiG.Collections;

import java.util.Arrays;
import java.util.ArrayList;

public class ArrayListMissingNumbers {

	void displayMissingNumbers(Integer[] input, int startRange, int endRange) {
		ArrayList<Integer> originalList = new ArrayList<Integer>(Arrays.asList(input));
		ArrayList<Integer> missingNumbersList = new ArrayList<Integer>();
		for (int index = startRange; index <= endRange; index++) {
			missingNumbersList.add(index);
		}
		missingNumbersList.removeAll(originalList);
		System.out.println(missingNumbersList);
	}

	void displayMissingNumbers1(Integer[] input, int startRange, int endRange) {
		ArrayList<Integer> originalList = new ArrayList<Integer>(Arrays.asList(input));
		ArrayList<Integer> missingNumbersList = new ArrayList<Integer>();
		for (int index = startRange; index <= endRange; index++) {
			if (!originalList.contains(index)) {
				missingNumbersList.add(index);
			}
		}
		System.out.println(missingNumbersList);
	}

	public static void main(String[] args) {
		Integer[] input = { 60, 54, 51, 54, 57, 54 };
		System.out.println("InputArray:" + Arrays.toString(input));
		System.out.print("Missing Numbers List:: Approach 1");
		new ArrayListMissingNumbers().displayMissingNumbers(input, 50, 60);
		System.out.print("Missing Numbers List:: Approach 2");
		new ArrayListMissingNumbers().displayMissingNumbers1(input, 50, 60);
	}
}
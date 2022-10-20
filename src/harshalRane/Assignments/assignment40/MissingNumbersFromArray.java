/*
 * Assignment 40
 * Program 2 : Find missing numbers from give array from 50 to 60.
input : {60,54,51,57}
output : [50,52,53,55,56,58,59]
 */
package harshalRane.Assignments.assignment40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingNumbersFromArray {
	void getMissingNumbers(Integer[] input) {
		List<Integer> listOfNumbers = new ArrayList<Integer>(Arrays.asList(input));
		List<Integer> output = new ArrayList<Integer>();

		for (int num = 50; num <= 60; num++) {
			output.add(num);
		}
		output.removeAll(listOfNumbers);
		System.out.println("Output --> " + output);
	}

	public static void main(String[] args) {
		MissingNumbersFromArray missingNumbersFromArray = new MissingNumbersFromArray();
		Integer[] input = { 60, 54, 51, 57 };
		System.out.println("Missing numbers from given array between 50 to 60");
		System.out.println("Input -->" + Arrays.toString(input));
		missingNumbersFromArray.getMissingNumbers(input);
	}
}

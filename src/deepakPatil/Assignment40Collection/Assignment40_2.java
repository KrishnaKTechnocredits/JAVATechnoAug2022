/*Assignment 40 : 16th Oct'2022
Program 2 : Find missing numbers from give array from 50 to 60.
input : {60,54,51,57}
output : [50,52,53,55,56,58,59]
*/
package deepakPatil.Assignment40Collection;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment40_2 {

	ArrayList<Integer> getMissingNumbers(Integer[] numArray, int startIndex, int endIndex) {
		ArrayList<Integer> numList1 = new ArrayList<Integer>(Arrays.asList(numArray));
		ArrayList<Integer> numList2 = new ArrayList<Integer>();

		for (int index = startIndex; index <= endIndex; index++) {
			numList2.add(index);
		}
		numList2.removeAll(numList1);
		return numList2;
	}

	public static void main(String[] args) {
		Integer[] numArray = { 60, 54, 51, 57 };
		int startIndex = 50;
		int endIndex = 60;
		System.out.println("Given array is: " + Arrays.toString(numArray));
		System.out.println("Missing number from given array is:");
		System.out.println(new Assignment40_2().getMissingNumbers(numArray, startIndex, endIndex));
	}

}

/*
 Program 2 : Find missing numbers from give array from 50 to 60.
input : {60,54,51,57}
output : [50,52,53,55,56,58,59]

 */
package swapnilMaheshwari.collection.MAPprograms;

import java.util.ArrayList;
import java.util.Arrays;

public class MissingNumberInList {

	ArrayList<Integer> getMissingNumberInList(Integer[] arrList, int startNum, int endNum) {
		ArrayList<Integer> listOfNumber = new ArrayList(Arrays.asList(arrList));
		ArrayList<Integer> outputList = new ArrayList();
		for (int i = startNum; i <= endNum; i++) {
			outputList.add(i);
		}
		outputList.removeAll(listOfNumber);
		return outputList;

	}

	public static void main(String[] args) {
		Integer[] input = { 60, 54, 51, 57 };
		int starRange = 50;
		int endRange = 60;
		ArrayList<Integer> missingNumList = new ArrayList<Integer>();
		MissingNumberInList missingNumberInList = new MissingNumberInList();
		missingNumList = missingNumberInList.getMissingNumberInList(input, starRange, endRange);
		System.out.println(missingNumList);
	}
}

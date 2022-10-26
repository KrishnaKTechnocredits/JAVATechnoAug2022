/*
 Program 1 : Find frequency of each number using array and single while loop.
input : {3,5,33,3,55,3,11,11}
output : 3--->3
		5--->1
		33--->1
		55--->1
		11--->2
 */
package swapnilMaheshwari.collection.MAPprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FreqOfEachNumberUsingArrayList {

	void getFrequencyOfEachNumber(Integer[] listOfArray) {
		List<Integer> listOfNum = new ArrayList<Integer>(Arrays.asList(listOfArray));
		ArrayList<Integer> outputList = new ArrayList<Integer>();
		int beforeSize = 0, afterSize = 0;
		while (listOfNum.size() > 0) {
			int num = listOfNum.get(0);
			beforeSize = listOfNum.size();
			outputList.add(num);
			listOfNum.removeAll(outputList);
			afterSize = listOfNum.size();
			System.out.println(num + "-->" + (beforeSize - afterSize));
			outputList.clear();
		}

	}

	public static void main(String[] args) {
		Integer[] intArr = { 3, 5, 33, 3, 55, 3, 11, 11 };
		new FreqOfEachNumberUsingArrayList().getFrequencyOfEachNumber(intArr);
	}
}

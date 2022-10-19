/*Program 2 : Find missing numbers from give array from 50 to 60.
input : {60,54,51,57}
output : [50,52,53,55,56,58,59]

Hint : removeAll*/
package gauravSahu;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment40B {

	void getMissingNum(ArrayList<Integer> listOfNum) {
		ArrayList<Integer> outputList = new ArrayList<Integer>();
		for (int index = 50; index <= 60; index++) {
			if (!listOfNum.contains(index)) {
				outputList.add(index);
			}
		}
		System.out.println("Output using ifcondition : "+ outputList);

	}

	void getMissingNumUsingRemoveAll(ArrayList<Integer> input) {
		ArrayList<Integer> outputList = new ArrayList<Integer>();
		for (int index = 50; index <= 60; index++) {
			if (!outputList.contains(index)) {
				outputList.add(index);
				outputList.removeAll(input);
			}
		}System.out.println("Output using removeall : "+outputList);
		
	}

	public static void main(String[] args) {
		Assignment40B a40 = new Assignment40B();
		Integer[] input = { 60, 54, 51, 57 };
		System.out.println("Input array list : " + Arrays.toString(input));
		ArrayList<Integer> listOfNum = new ArrayList<Integer>();
		for (Integer num : input) {
			listOfNum.add(num);
		}
		a40.getMissingNum(listOfNum);
		a40.getMissingNumUsingRemoveAll(listOfNum);

	}
}

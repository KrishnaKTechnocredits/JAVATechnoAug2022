/*Assignment 40 : 16th Oct'2022

Program 1 : Find frequency of each number using array and single while loop.
input : {3,5,33,3,55,3,11,11}
output : 3--->3
		5--->1
		33--->1
		55--->1
		11--->2*/

package rashmiG.Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListFrequencyOfNumberUsingArrayAndWhileloop {

	void printFrequencyOfNumber(Integer[] input) {
		ArrayList<Integer> freqOfNum = new ArrayList<Integer>(Arrays.asList(input));
		int beforeLength = 0;
		int num = 0;
		int afterLength = 0;
		ArrayList<Integer> removeList = new ArrayList<Integer>();
		while (freqOfNum.size() > 0) {
			num = freqOfNum.get(0);
			beforeLength = freqOfNum.size();
			removeList.add(num);
			freqOfNum.removeAll(removeList);
			afterLength = freqOfNum.size();
			System.out.println(num + "-->" + (beforeLength - afterLength));
			removeList.clear();
		}
	}

	public static void main(String[] args) {
		Integer[] input = { 3, 5, 33, 3, 55, 3, 11, 11 };
		System.out.println("InputArray :" + Arrays.toString(input));
		new ArrayListFrequencyOfNumberUsingArrayAndWhileloop().printFrequencyOfNumber(input);
	}
}
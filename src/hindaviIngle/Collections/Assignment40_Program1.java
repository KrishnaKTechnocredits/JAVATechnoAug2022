/*
 * Program 1 : Find frequency of each number using array and single while loop.
input : {3,5,33,3,55,3,11,11}
output : 3--->3
		5--->1
		33--->1
		55--->1
		11--->2
 */
package hindaviIngle.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Assignment40_Program1 {
	void getFreqOfNum(Integer[] input) {
		List<Integer> listOfNumbers = new ArrayList<Integer>(Arrays.asList(input));
		List<Integer> output = new ArrayList<Integer>();
		int num = 0, originalSize = 0, aftersize = 0;
		while (listOfNumbers.size() > 0) {
			num = listOfNumbers.get(0);
			originalSize = listOfNumbers.size();
			output.add(num);
			listOfNumbers.removeAll(output);
			aftersize = listOfNumbers.size();
			System.out.println(num + "-->" + (originalSize - aftersize));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment40_Program1 findFreqOfNum = new Assignment40_Program1();
		Integer[] input = { 3, 5, 33, 3, 55, 3, 11, 11 };
		System.out.println("Frequency of each number using array and single while loop");
		System.out.println("Input --> " + Arrays.toString(input));
		findFreqOfNum.getFreqOfNum(input);
	}

}

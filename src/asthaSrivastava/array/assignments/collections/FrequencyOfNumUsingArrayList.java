/*Program 1 : Find frequency of each number using array and single while loop.
input : {3,5,33,3,55,3,11,11}
output : 3--->3
		5--->1
		33--->1
		55--->1
		11--->2*/

package asthaSrivastava.array.assignments.collections;

import java.util.*;

public class FrequencyOfNumUsingArrayList {
	// method to find frequency of number from array list
	void printFrequencyOfNum(ArrayList<Integer> listOfNum) {
		System.out.println("Input array is " + listOfNum);
		System.out.println("\nFrequency of each number is :");
		int num = 0;
		int originalSize = 0, newSize = 0;
		ArrayList<Integer> removeNumList = new ArrayList<Integer>();
		while (listOfNum.size() > 0) {
			num = listOfNum.get(0);
			originalSize = listOfNum.size();
			removeNumList.add(num);
			listOfNum.removeAll(removeNumList);
			newSize = listOfNum.size();
			System.out.println(+num + "--> " + (originalSize - newSize));
			removeNumList.clear();
		}
	}

	public static void main(String[] args) {
		ArrayList<Integer> listOfNum = new ArrayList<Integer>(Arrays.asList(3, 5, 33, 3, 55, 3, 11, 11));
		new FrequencyOfNumUsingArrayList().printFrequencyOfNum(listOfNum);
	}
}
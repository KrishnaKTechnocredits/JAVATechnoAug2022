/* Assignment 40 : 16th Oct'2022
 Program 7 : WAP to find frequence of each word in a given String using Map.
input : {10,2,5,2,3,3,3,10,11,8,8,8};
output : 2 -> 2
         3 -> 3
         5 -> 1
         8 -> 3
         10 -> 2
         11 -> 1 */

package pujaSah.MapAssignments;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class NumberFrequencyUsingMap {

	// method to print frequency of each number using Map
	void displayNumberFrequencyUsingMap(Integer[] numArr) {
		System.out.println("Original list of numbers : " + Arrays.toString(numArr));
		Map<Integer, Integer> numberMap = new HashMap<Integer, Integer>();
		int num = 0;

		System.out.println("Frequency Of each number in the list : ");
		for (int index = 0; index < numArr.length; index++) {
			num = numArr[index];
			if (numberMap.containsKey(num)) {
				numberMap.put(num, numberMap.get(num) + 1);
			} else {
				numberMap.put(num, 1);
			}
		}
		
		Set<Integer> setOfKeys = numberMap.keySet();
		for (int curKey : setOfKeys) {
			System.out.println(curKey + "--> " + numberMap.get(curKey));
		}
	}

	public static void main(String[] args) {
		Integer[] numArr = { 10, 2, 5, 2, 3, 3, 3, 10, 11, 8, 8, 8 };
		new NumberFrequencyUsingMap().displayNumberFrequencyUsingMap(numArr);
	}
}
/*Assignment 40 : 16th Oct'2022

Program 7 : WAP to find frequence of each number in a given array using Map.
input : {10,2,5,2,3,3,3,10,11,8,8,8};
output : 2 -> 2
         3 -> 3
         5 -> 1
         8 -> 3
         10 -> 2
         11 -> 1 */

package rashmiG.Collections;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapNumberFrequencyInArray {

	void printFreqOfNumber(int[] input) {
		int num = 0;
		Map<Integer, Integer> numberFreqMap = new TreeMap<Integer, Integer>();
		for (int index = 0; index < input.length; index++) {
			num = input[index];
			if (numberFreqMap.containsKey(num)) {
				numberFreqMap.put(num, numberFreqMap.get(num) + 1);
			} else {
				numberFreqMap.put(num, 1);
			}
		}
		Set<Integer> keys = numberFreqMap.keySet();
		for (int currentKey : keys) {
			System.out.println(currentKey + " -> " + numberFreqMap.get(currentKey));
		}
	}

	public static void main(String[] args) {
		int[] input = { 10, 2, 5, 2, 3, 3, 3, 10, 11, 8, 8, 8 };
		System.out.println("InputArray: " + Arrays.toString(input));
		System.out.println("Frequency of each number: ");
		new MapNumberFrequencyInArray().printFreqOfNumber(input);
	}
}
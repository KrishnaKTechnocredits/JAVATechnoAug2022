
/*
 * Program 7 :  Write a program to find frequency of each word in a given String using Map.
input : {10,2,5,2,3,3,3,10,11,8,8,8};
output : 2 -> 2
         3 -> 3
         5 -> 1
         8 -> 3
         10 -> 2
         11 -> 1  
 */

package mohiniA.ArrayMap.Assignment40;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapFreqOfEachNum {

	void getFrequencyOfNumUsingMap(Integer[] input) {
		Map<Integer, Integer> freq = new TreeMap<Integer, Integer>();
		for (Integer num : input) {
			if (freq.containsKey(num)) {
				freq.put(num, freq.get(num) + 1);
			} else {
				freq.put(num, 1);
			}
		}
		Set<Integer> key = freq.keySet();
		for (Integer currentKey : key) {
			System.out.println(currentKey + " --> " + freq.get(currentKey));
		}
	}

	public static void main(String[] args) {
		MapFreqOfEachNum obj40 = new MapFreqOfEachNum();
		Integer[] input = { 10, 2, 5, 2, 3, 3, 3, 10, 11, 8, 8, 8 };
		System.out.println("Frequency of each number using Map");
		System.out.println("Input: " + Arrays.toString(input));
		obj40.getFrequencyOfNumUsingMap(input);
	}

}

/*Program 7 : WAP to find frequence of each word in a given String using Map.
input : {10,2,5,2,3,3,3,10,11,8,8,8};
output : 2 -> 2
         3 -> 3
         5 -> 1
         8 -> 3
         10 -> 2
         11 -> 1 */
package asthaSrivastava.array.assignments.collections;

import java.util.TreeMap;
import java.util.Map;

public class NumFreqUsingMap {
	// method to get Frequency of number using Map
	void getFrequencyOfNum(int[] num) {
		Map<Integer, Integer> numMapFreq = new TreeMap<Integer, Integer>();
		for (int i = 0; i < num.length; i++) {
			if (numMapFreq.containsKey(num[i])) {
				int count = numMapFreq.get(num[i]);
				numMapFreq.put(num[i], count + 1);
			} else
				numMapFreq.put(num[i], 1);
		}
		System.out.println("Frequency of number is : " + numMapFreq);
	}

	public static void main(String[] args) {
		int[] num = { 10, 2, 5, 2, 3, 3, 3, 10, 11, 8, 8, 8 };
		new NumFreqUsingMap().getFrequencyOfNum(num);
	}
}
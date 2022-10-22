/*Program 7 : WAP to find frequence of each word in a given String using Map.
input : {10,2,5,2,3,3,3,10,11,8,8,8};
output : 2 -> 2
         3 -> 3
         5 -> 1
         8 -> 3
         10 -> 2
         11 -> 1 */
package adittyThakare.collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Assignment40_Program7 {
	Map<Integer, Integer> getFrequencyOfNumbers(int[] numArr) {

		Map<Integer, Integer> frequencyOfNumbers = new TreeMap<Integer, Integer>();

		for (int num : numArr) {
			if (!frequencyOfNumbers.containsKey(num)) {
				frequencyOfNumbers.put(num, 1);
			} else {
				frequencyOfNumbers.put(num, frequencyOfNumbers.get(num) + 1);
			}
		}
		return frequencyOfNumbers;
	}

	void displayMap(Map<Integer, Integer> inputMap) {
		Set<Integer> setOfKeys = inputMap.keySet();
		Iterator<Integer> itr1 = setOfKeys.iterator();
		while (itr1.hasNext()) {
			int num = itr1.next();
			System.out.println(num + "-->" + inputMap.get(num));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] inputArr = { 10, 2, 5, 2, 3, 3, 3, 10, 11, 8, 8, 8 };
		Assignment40_Program7 assignment40_Program7 = new Assignment40_Program7();
		System.out.println("WAP to find frequence of each word in a given String using Map.");
		System.out.println("\nInput Array: "+Arrays.toString(inputArr));
		Map<Integer, Integer> numFreqMap = assignment40_Program7.getFrequencyOfNumbers(inputArr);
		System.out.println("\nOutput: ");
		assignment40_Program7.displayMap(numFreqMap);
	}

}

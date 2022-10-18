/*Program 7 : WAP to find frequence of each word in a given String using Map.
input : {10,2,5,2,3,3,3,10,11,8,8,8};
output : 2 -> 2
         3 -> 3
         5 -> 1
         8 -> 3
         10 -> 2
         11 -> 1  */

package manjiri.assignment40;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class FrequencyOfNumbers {

	Map<Integer, Integer> getFrequencyOfNumbers(int[] numArr) {

		Map<Integer, Integer> freqOfNum = new TreeMap<Integer, Integer>();

		for (int num : numArr) {
			if (!freqOfNum.containsKey(num)) {
				freqOfNum.put(num, 1);
			} else {
				freqOfNum.put(num, freqOfNum.get(num) + 1);
			}
		}
		return freqOfNum;
	}

	void display(Map<Integer, Integer> numFreqMap) {
		Set<Integer> setOfKeys = numFreqMap.keySet();
		Iterator<Integer> itr1 = setOfKeys.iterator();
		while (itr1.hasNext()) {
			int num = itr1.next();
			System.out.println(num + "-->" + numFreqMap.get(num));
		}
	}

	public static void main(String[] args) {
		int[] numArr = { 10, 2, 5, 2, 3, 3, 3, 10, 11, 8, 8, 8 };
		FrequencyOfNumbers frequencyOfNumbers = new FrequencyOfNumbers();
		Map<Integer, Integer> numFreqMap = frequencyOfNumbers.getFrequencyOfNumbers(numArr);
		frequencyOfNumbers.display(numFreqMap);
	}
}

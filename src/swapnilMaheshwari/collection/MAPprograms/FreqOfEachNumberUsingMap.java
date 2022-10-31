/*
 Program 7 : WAP to find frequence of each word in a given String using Map.
input : {10,2,5,2,3,3,3,10,11,8,8,8};
output : 2 -> 2
         3 -> 3
         5 -> 1
         8 -> 3
         10 -> 2
         11 -> 1

 */
package swapnilMaheshwari.Collection.MAPprograms;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class FreqOfEachNumberUsingMap {
	TreeMap<Integer, Integer> listOfNumber = new TreeMap<Integer, Integer>();

	TreeMap<Integer, Integer> getFreqOfNumberUsingMap(int[] intArr) {
		for (int index = 0; index < intArr.length; index++) {
			if (!listOfNumber.containsKey(intArr[index])) {
				listOfNumber.put(intArr[index], 1);
			} else {
				listOfNumber.put(intArr[index], listOfNumber.get(intArr[index]) + 1);
			}
		}
		return listOfNumber;
	}

	void printFreqOfNum(TreeMap<Integer, Integer> listOfNum) {
		Set<Integer> keys = listOfNum.keySet();
		for (Integer num : keys) {
			System.out.println(num + "-->" + listOfNum.get(num));
		}
	}

	public static void main(String[] args) {
		int[] input = { 10, 2, 5, 2, 3, 3, 3, 10, 11, 8, 8, 8 };
		TreeMap<Integer, Integer> numOfTreeMap = new TreeMap<Integer, Integer>();
		numOfTreeMap = new FreqOfEachNumberUsingMap().getFreqOfNumberUsingMap(input);
		new FreqOfEachNumberUsingMap().printFreqOfNum(numOfTreeMap);
	}
}

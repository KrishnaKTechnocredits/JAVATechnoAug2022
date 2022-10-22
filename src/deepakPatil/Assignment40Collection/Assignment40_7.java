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

package deepakPatil.Assignment40Collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Assignment40_7 {
	
		Map<Integer, Integer> getFrequencyOfNumber(int[] numArray){
		
		Map<Integer,Integer> map=new TreeMap<Integer,Integer>();
		for(int num:numArray) {
			
			if(map.containsKey(num))
				map.put(num, map.get(num)+1);
			else
				map.put(num, 1);
		}
		
		return map;
	}
	
	void displayMap(Map<Integer, Integer> wordFreqMap) {
		
		Set<Integer> setOfKeys = wordFreqMap.keySet();
		Iterator<Integer> itr1 = setOfKeys.iterator();
		while (itr1.hasNext()) {
			Integer str1 = itr1.next();
			System.out.println(str1 + "-->" + wordFreqMap.get(str1));
		}
	}
	
	public static void main(String[] args) {
		int[] numArray = {10,2,5,2,3,3,3,10,11,8,8,8};
		System.out.println("Frequency of each number from Array: "+Arrays.toString(numArray));
		Assignment40_7 assignment40_7 = new Assignment40_7();
		Map<Integer, Integer> wordFreqMap = assignment40_7.getFrequencyOfNumber(numArray);
		assignment40_7.displayMap(wordFreqMap);
	}

}

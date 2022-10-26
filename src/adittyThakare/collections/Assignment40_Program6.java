/*Program 6 : WAP to find frequence of each word in a given String using Map.
input : "Hi Hello Techno Techno Hi"
output : Hi -> 2
         Hello -> 1
		 Techno -> 2*/
package adittyThakare.collections;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Assignment40_Program6 {
	
	Map<String, Integer> getFrequencyOfWordsFromString(String input) {

		String[] nameArr = input.split(" ");
		Map<String, Integer> frequencyOfWord = new LinkedHashMap<String, Integer>();

		for (String name : nameArr) {
			if (!frequencyOfWord.containsKey(name)) {
				frequencyOfWord.put(name, 1);
			} else {
				frequencyOfWord.put(name, frequencyOfWord.get(name) + 1);
			}
		}
		return frequencyOfWord;
	}

	void displayMap(Map<String, Integer> wordFreqMap) {
		Set<String> setOfKeys = wordFreqMap.keySet();
		Iterator<String> itr1 = setOfKeys.iterator();
		System.out.println("\nOutput: ");
		while (itr1.hasNext()) {
			String str1 = itr1.next();
			System.out.println(str1 + "-->" + wordFreqMap.get(str1));
		}
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Hi Hello Techno Techno Hi";
		Assignment40_Program6 assignment40_Program6 = new Assignment40_Program6();
		System.out.println("WAP to find frequence of each word in a given String using Map.");
		System.out.println("\nInput String: "+input);
		Map<String, Integer> outputMap = assignment40_Program6.getFrequencyOfWordsFromString(input);
		assignment40_Program6.displayMap(outputMap);
	}

}

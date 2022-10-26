/*Assignment 40 : 16th Oct'2022

Program 6 : WAP to find frequence of each word in a given String using Map.
input : "Hi Hello Techno Techno Hi"
output : Hi -> 2
         Hello -> 1
		 Techno -> 2*/

package rashmiG.Collections;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapFrequencyOfEachWordInString {

	Map<String, Integer> getFreqOfWord(String input) {
		Map<String, Integer> wordFrequencyMap = new LinkedHashMap<String, Integer>();
		String[] arr = input.split(" ");
		int count = 0;
		for (String name : arr) {
			if (wordFrequencyMap.containsKey(name)) {
				count = wordFrequencyMap.get(name);
				wordFrequencyMap.put(name, count + 1);
			} else {
				wordFrequencyMap.put(name, 1);
			}
		}
		return wordFrequencyMap;
	}

	void printFreqOfWord(String input) {
		Map<String, Integer> wordFrequencyMap = getFreqOfWord(input);
		Set<String> keys = wordFrequencyMap.keySet();
		Iterator<String> itr = keys.iterator();
		while (itr.hasNext()) {
			String currentKey = itr.next();
			System.out.println(currentKey + " -> " + wordFrequencyMap.get(currentKey));
		}
	}

	public static void main(String[] args) {
		String input = "Hi Hello Techno Techno Hi";
		System.out.println("Input: " + input);
		System.out.println("Frequench of each word: ");
		new MapFrequencyOfEachWordInString().printFreqOfWord(input);
	}
}
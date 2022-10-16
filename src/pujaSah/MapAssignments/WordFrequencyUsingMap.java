/*Assignment 40 : 16th Oct'2022
Program 6 : WAP to find frequence of each word in a given String using Map.
input : "Hi Hello Techno Techno Hi"
output : Hi -> 2
         Hello -> 1
		 Techno -> 2 */
package pujaSah.MapAssignments;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class WordFrequencyUsingMap {

	// method to print frequency of each word using Map
	void displayWordFrequencyUsingMap(String str) {
		System.out.println("Original String : " + str);
		String[] strArr = str.split(" ");
		Map<String, Integer> wordMap = new HashMap<String, Integer>();
		String name = " ";

		System.out.println("Frequency Of each word in the given string are: ");
		for (int index = 0; index < strArr.length; index++) {
			name = strArr[index];
			if (wordMap.containsKey(name)) {
				wordMap.put(name, wordMap.get(name) + 1);
			} else {
				wordMap.put(name, 1);
			}
		}

		Set<String> setOfKeys = wordMap.keySet();
		for (String curKey : setOfKeys) {
			System.out.println(curKey + "--> " + wordMap.get(curKey));
		}
	}

	public static void main(String[] args) {
		String str = "Hi Hello Techno Techno Hi";
		new WordFrequencyUsingMap().displayWordFrequencyUsingMap(str);
	}
}
/*Program 6 : WAP to find frequence of each word in a given String using Map.
input : "Hi Hello Techno Techno Hi"
output : Hi -> 2
         Hello -> 1
		 Techno -> 2*/
package ankitaBarwad;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class A40_FrequencyOfWords {
	Map<String, Integer> getFrequencyOfWords(String name) {

		String[] nameArr = name.split(" ");
		Map<String, Integer> freqOfWord = new LinkedHashMap<String, Integer>();

		for (String name1 : nameArr) {
			if (!freqOfWord.containsKey(name1)) {
				freqOfWord.put(name1, 1);
			} else {
				freqOfWord.put(name1, freqOfWord.get(name1) + 1);
			}
		}
		return freqOfWord;
	}

	void display(Map<String, Integer> wordFreqMap) {
		Set<String> setOfKeys = wordFreqMap.keySet();
		Iterator<String> itr1 = setOfKeys.iterator();
		while (itr1.hasNext()) {
			String str1 = itr1.next();
			System.out.println(str1 + "-->" + wordFreqMap.get(str1));
		}
	}

	public static void main(String[] args) {
		System.out.println("Program 6 : WAP to find frequence of each word in a given String using Map");
		String name = "Hi Hello Techno Techno Hi";
		A40_FrequencyOfWords frequencyOfWords = new A40_FrequencyOfWords();
		Map<String, Integer> wordFreqMap = frequencyOfWords.getFrequencyOfWords(name);
		frequencyOfWords.display(wordFreqMap);
	}
}

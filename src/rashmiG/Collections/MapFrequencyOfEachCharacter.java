/*Assignment 40 : 16th Oct'2022

Program 5 : WAP to find frequence of each character using Map.
input : technocredits
output : {r=1, c=2, s=1, t=2, d=1, e=2, h=1, i=1, n=1, o=1}
          r --> 1
		  c --> 2
          s --> 1
          t --> 2
          ..... so on*/

package rashmiG.Collections;

import java.util.HashMap;
import java.util.Set;

public class MapFrequencyOfEachCharacter {

	HashMap<Character, Integer> getFrequencyOfChar(String input) {
		HashMap<Character, Integer> freqOfChar = new HashMap<Character, Integer>();
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (freqOfChar.containsKey(ch)) {
				freqOfChar.put(ch, freqOfChar.get(ch) + 1);
			} else {
				freqOfChar.put(ch, 1);
			}
		}
		return freqOfChar;
	}

	void printFreqOfChar(String input) {
		HashMap<Character, Integer> freqOfChar = getFrequencyOfChar(input);
		System.out.println(freqOfChar);
		Set<Character> keys = freqOfChar.keySet();
		for (char ch : keys) {
			System.out.println(ch + " --> " + freqOfChar.get(ch));
		}
	}

	public static void main(String[] args) {
		String input = "technocredits";
		System.out.println("input: " + input);
		System.out.println("Frequency of each character::");
		new MapFrequencyOfEachCharacter().printFreqOfChar(input);
	}
}
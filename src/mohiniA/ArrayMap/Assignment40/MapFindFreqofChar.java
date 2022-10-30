/*
 * Assignment 40
 * Program 5 :  Write a program to find frequency of each character using Map.
input : technocredits
output : {r=1, c=2, s=1, t=2, d=1, e=2, h=1, i=1, n=1, o=1}
          r --> 1
		  c --> 2
          s --> 1
          t --> 2
          ..... so on
 */

package mohiniA.ArrayMap.Assignment40;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapFindFreqofChar {
	
	void getFrequencyUsingMap(String input) {
		Map<Character, Integer> freq = new HashMap<Character, Integer>();
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (freq.containsKey(ch)) {
				freq.put(ch, freq.get(ch) + 1);
			} else {
				freq.put(ch, 1);
			}
		}
		Set<Character> key = freq.keySet();
		for (Character currentKey : key) {
			System.out.println(currentKey + " --> " + freq.get(currentKey));
		}
	}

	public static void main(String[] args) {
		MapFindFreqofChar obj40 = new MapFindFreqofChar();
		String input = "technocredits";
		System.out.println("Frequency of each character using Map");
		System.out.println("Input: " + input);
		obj40.getFrequencyUsingMap(input);
	}

}

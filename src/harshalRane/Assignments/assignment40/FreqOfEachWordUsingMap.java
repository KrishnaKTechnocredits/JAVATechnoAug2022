/*
 * Assignment 40
 * Program 6 : WAP to find frequence of each word in a given String using Map.
input : "Hi Hello Techno Techno Hi"
output : Hi -> 2
         Hello -> 1
		 Techno -> 2
 */
package harshalRane.Assignments.assignment40;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class FreqOfEachWordUsingMap {
	void getFrequencyOfEachWordUsingMap(String input1) {
		String[] arr = input1.split(" ");
		Map<String, Integer> freq = new LinkedHashMap<String, Integer>();
		for (String input : arr) {
			if (freq.containsKey(input)) {
				freq.put(input, freq.get(input) + 1);
			} else {
				freq.put(input, 1);
			}
		}
		Set<String> key = freq.keySet();
		for (String currentKey : key) {
			System.out.println(currentKey + " --> " + freq.get(currentKey));
		}
	}

	public static void main(String[] args) {
		FreqOfEachWordUsingMap findFreqUsingMap = new FreqOfEachWordUsingMap();
		String input = "Hi Hello Techno Techno Hi";
		System.out.println("Frequency of each word using Map");
		System.out.println("Input: " + input);
		findFreqUsingMap.getFrequencyOfEachWordUsingMap(input);
	}
}

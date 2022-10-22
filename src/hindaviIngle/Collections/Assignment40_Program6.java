/*
 * 
Program 6 : WAP to find frequence of each word in a given String using Map.
input : "Hi Hello Techno Techno Hi"
output : Hi -> 2
         Hello -> 1
		 Techno -> 2

 */
package hindaviIngle.Collections;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Assignment40_Program6 {
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
		// TODO Auto-generated method stub

		Assignment40_Program6 p6 = new Assignment40_Program6();
		String input = "Hi Hello Techno Techno Hi";
		System.out.println("Frequency of each word using Map");
		System.out.println("Input: " + input);
		p6.getFrequencyOfEachWordUsingMap(input);
	}

}

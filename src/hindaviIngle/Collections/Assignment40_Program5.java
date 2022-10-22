/*
 * Program 5 : WAP to find frequence of each character using Map.
input : technocredits
output : {r=1, c=2, s=1, t=2, d=1, e=2, h=1, i=1, n=1, o=1}
          r --> 1
		  c --> 2
          s --> 1
          t --> 2
          ..... so on
 */
package hindaviIngle.Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Assignment40_Program5 {
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
		// TODO Auto-generated method stub
		Assignment40_Program5 p5 = new Assignment40_Program5();
		String input = "technocredits";
		System.out.println("Frequency of each character using Map");
		System.out.println("Input: " + input);
		p5.getFrequencyUsingMap(input);
	}

}

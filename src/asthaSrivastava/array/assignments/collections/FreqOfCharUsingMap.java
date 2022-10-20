/*Program 5 : WAP to find frequence of each character using Map.
input : technocredits
output : {r=1, c=2, s=1, t=2, d=1, e=2, h=1, i=1, n=1, o=1}
          r --> 1
		  c --> 2
          s --> 1
          t --> 2
          ..... so on	*/
package asthaSrivastava.array.assignments.collections;

import java.util.*;

public class FreqOfCharUsingMap {

	void getFrequencyOfChar(String str) {
		HashMap<Character, Integer> charMapFreq = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (charMapFreq.containsKey(ch)) {
				int count = charMapFreq.get(ch);
				charMapFreq.put(ch, count + 1);
			} else
				charMapFreq.put(ch, 1);
		}
		System.out.println(charMapFreq);
	}

	public static void main(String[] args) {
		String str = "technocredits";
		new FreqOfCharUsingMap().getFrequencyOfChar(str);
	}
}
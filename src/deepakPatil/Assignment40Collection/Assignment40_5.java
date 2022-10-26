/*
Program 5 : WAP to find frequence of each character using Map.
input : technocredits
output : {r=1, c=2, s=1, t=2, d=1, e=2, h=1, i=1, n=1, o=1}
          r --> 1
		  c --> 2
          s --> 1
          t --> 2
 */

package deepakPatil.Assignment40Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Assignment40_5 {

	void printFrequencyOfChar(String input) {

		char[] charArray = input.toCharArray();
		Map<Character, Integer> map1 = new HashMap<>();

		for (char ch : charArray) {

			if (map1.containsKey(ch))
				map1.put(ch, map1.get(ch) + 1);
			else
				map1.put(ch, 1);
		}

		Set<Character> charSet = map1.keySet();
		for (char ch : charSet) {

			System.out.println(ch + "-->" + map1.get(ch));
		}
	}

	public static void main(String[] args) {
		
		String input="technocredits";
		System.out.println("Frequency of each character from String '"+input+"':");
		new Assignment40_5().printFrequencyOfChar(input);
	}
}

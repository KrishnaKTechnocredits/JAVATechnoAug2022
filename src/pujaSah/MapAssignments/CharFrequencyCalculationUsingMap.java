/*Assignment 40 : 16th Oct'2022
 Program 5 : WAP to find frequence of each character using Map.
input : technocredits
output : {r=1, c=2, s=1, t=2, d=1, e=2, h=1, i=1, n=1, o=1}
          r --> 1
		  c --> 2
          s --> 1
          t --> 2
          ..... so on	
*/
package pujaSah.MapAssignments;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class CharFrequencyCalculationUsingMap {

	// method to print frequency of each character in String using Map
	void displayFrequencyUsingMap(String str) {
		System.out.println("Input String: " + str);
		char ch = ' ';
		Map<Character, Integer> mapOfChar = new HashMap<Character, Integer>();
		for (int index = 0; index < str.length(); index++) {
			ch = str.charAt(index);
			if (mapOfChar.containsKey(ch)) {
				mapOfChar.put(ch, mapOfChar.get(ch) + 1);
			} else {
				mapOfChar.put(ch, 1);
			}
		}
		Set<Character> keys = mapOfChar.keySet();
		System.out.println("Frequency of ech character in the string using Map: ");
		for (char curKey : keys) {
			System.out.println(curKey + "-->" + mapOfChar.get(curKey));
		}
	}

	public static void main(String[] args) {
		String str = "technocredits";
		new CharFrequencyCalculationUsingMap().displayFrequencyUsingMap(str);
	}
}
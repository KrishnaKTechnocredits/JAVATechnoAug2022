/*Program 5 : WAP to find frequence of each character using Map.
		input : technocredits
		output : {r=1, c=2, s=1, t=2, d=1, e=2, h=1, i=1, n=1, o=1}
		          r --> 1
				  c --> 2
		          s --> 1
		          t --> 2
		          ..... so on	*/
package gauravSahu;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Assignment40E {

	void getFreqOfCharUsingMap(ArrayList<Character> listOfChar) {
		Map<Character, Integer> listOfFrequency = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < listOfChar.size(); i++) {
			char ch = listOfChar.get(i);
			if (listOfFrequency.containsKey(ch)) {
				int count = listOfFrequency.get(ch);
				listOfFrequency.put(ch, count + 1);
			} else {
				listOfFrequency.put(ch, 1);
			}
		}System.out.println(listOfFrequency);
		Set<Character> keys = listOfFrequency.keySet();
		for (Character currentKey : keys) {
			System.out.println(currentKey + "-->" + listOfFrequency.get(currentKey));
		}
		
	}

	public static void main(String[] args) {
		Assignment40E a40 = new Assignment40E();
		String input = "technocredits";
		char[] ch = input.toCharArray();
		ArrayList<Character> listOfChar = new ArrayList<>();
		for (Character ch1 : ch) {
			listOfChar.add(ch1);
		}
		a40.getFreqOfCharUsingMap(listOfChar);

	}
}

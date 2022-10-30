package shubhamG.Assignment31to40;

import java.util.HashMap;

/*Program 5 : WAP to find frequence of each character using Map.
input : technocredits
output : {r=1, c=2, s=1, t=2, d=1, e=2, h=1, i=1, n=1, o=1}
          r --> 1
		  c --> 2
          s --> 1
          t --> 2
*/

public class Assignment40Program5 {

	void getFrequencyOfEachCharacter(String str) {

		char[] chArray = str.toCharArray();
		HashMap<Character, Integer> frequency = new HashMap<Character, Integer>();
		for (int i = 0; i < chArray.length; i++) {
			if (frequency.containsKey(chArray[i])) {
				frequency.put(chArray[i], frequency.get(chArray[i]) + 1);
			} else {
				frequency.put(chArray[i], 1);
			}
		}
		System.out.println(frequency);
		for (Character currentKey : frequency.keySet()) {
			System.out.println(currentKey + " ---> " + frequency.get(currentKey));
		}
	}

	public static void main(String[] args) {
		String input = "technocredits";
		System.out.println("Input String is: " + input);
		new Assignment40Program5().getFrequencyOfEachCharacter(input);
	}
}

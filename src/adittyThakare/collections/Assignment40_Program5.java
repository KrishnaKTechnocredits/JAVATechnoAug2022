/*Program 5 : WAP to find frequence of each character using Map.
input : technocredits
output : {r=1, c=2, s=1, t=2, d=1, e=2, h=1, i=1, n=1, o=1}
          r --> 1
		  c --> 2
          s --> 1
          t --> 2
          ..... so on*/
package adittyThakare.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Assignment40_Program5 {

	void getFrequencyOfEachCharacter(String input) {
		char[] charArr = input.toCharArray();
		Map<Character, Integer> map1 = new HashMap<>();
		for (char ch : charArr) {
			if (map1.containsKey(ch)) {
				map1.put(ch, map1.get(ch) + 1);
			} else {
				map1.put(ch, 1);
			}
		}
		Set<Character> set1 = map1.keySet();
		for (Character char1 : set1) {
			System.out.println(char1 + " --> " + map1.get(char1));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment40_Program5 assignment40_Program5 = new Assignment40_Program5();
		System.out.println("WAP to find frequence of each character using Map.");
		String str = "technocredits";
		System.out.println("\nInput String: "+str);
		System.out.println("\nOutput:");
		assignment40_Program5.getFrequencyOfEachCharacter(str);
	}

}

/*
Program 5 : WAP to find frequence of each character using Map.
input : technocredits
output : {r=1, c=2, s=1, t=2, d=1, e=2, h=1, i=1, n=1, o=1}
          r --> 1
		  c --> 2
          s --> 1
          t --> 2
          ..... so on		   
 */
package swapnilMaheshwari.collection.MAPprograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class FreqOfEachCharUsingMap {
	HashMap<Character, Integer> mapOfCharacter = new HashMap<Character, Integer>();

	HashMap<Character, Integer> getFreqOfEachCharUsingMap(String name) {
		int count = 0;
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			if (mapOfCharacter.containsKey(ch)) {
				count = mapOfCharacter.get(ch);
				mapOfCharacter.put(ch, 1);
			} else {
				mapOfCharacter.put(ch, count + 1);
			}
		}
		return mapOfCharacter;

	}

	static void mapPrint(HashMap<Character, Integer> freqOfChar) {
		Set<Character> keys = freqOfChar.keySet();
		Iterator<Character> itr = keys.iterator();
		while (itr.hasNext()) {
			char ch = itr.next();
			System.out.println(ch + "-->" + freqOfChar.get(ch));
		}
	}

	public static void main(String[] args) {
		HashMap<Character, Integer> listOfMap = new HashMap<Character, Integer>();
		String str = "technocredits";
		System.out.println("Input :" + str);
		listOfMap = new FreqOfEachCharUsingMap().getFreqOfEachCharUsingMap(str);
		mapPrint(listOfMap);
	}

}

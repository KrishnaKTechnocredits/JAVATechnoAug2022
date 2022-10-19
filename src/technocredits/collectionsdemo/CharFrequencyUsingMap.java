package technocredits.collectionsdemo;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CharFrequencyUsingMap {

	static void printCharFreq(String str) {
		Map<Character,Integer> charFreqMap = new HashMap<Character,Integer>();
			
		for(int index=0;index<str.length();index++) {
			char ch = str.charAt(index);
			
			if(charFreqMap.containsKey(ch)) {
				int count = charFreqMap.get(ch);
				charFreqMap.put(ch, count+1);
			}else {
				charFreqMap.put(ch, 1);
			}
		}
		System.out.println(charFreqMap);
	}
	
	
	public static void main(String[] args) {
		String str = "technocredits";
		printCharFreq(str);
	}
}

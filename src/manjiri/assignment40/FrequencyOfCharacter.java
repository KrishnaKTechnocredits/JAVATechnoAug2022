/*Program 5 : WAP to find frequence of each character using Map.
input : technocredits
output : {r=1, c=2, s=1, t=2, d=1, e=2, h=1, i=1, n=1, o=1}
          r --> 1
		  c --> 2
          s --> 1
          t --> 2
          ..... so on*/

package manjiri.assignment40;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class FrequencyOfCharacter {
	
	Map<Character, Integer> getFrequencyOfCharacter(String name){
		
		char[] charArr = name.toCharArray();
		Map<Character, Integer> freqOfChar = new HashMap<Character, Integer>();
		
		for(char ch : charArr) {
			if(!freqOfChar.containsKey(ch)) {
				freqOfChar.put(ch, 1);
			}
			else {
				freqOfChar.put(ch, freqOfChar.get(ch)+1);
			}
		}
		return freqOfChar;
	}
	
	void display(Map<Character, Integer> charFreqMap) {
		Set<Character> setOfKeys = charFreqMap.keySet();
		Iterator<Character> itr1 = setOfKeys.iterator();
		while(itr1.hasNext()) {
			char ch1 = itr1.next();
			System.out.println(ch1 + "-->" + charFreqMap.get(ch1));
		}
	}

	public static void main(String[] args) {
		String name = "technocredits";
		FrequencyOfCharacter frequencyOfCharcater = new FrequencyOfCharacter();
		Map<Character, Integer> charFreqMap = frequencyOfCharcater.getFrequencyOfCharacter(name);
		frequencyOfCharcater.display(charFreqMap);	
	}
}

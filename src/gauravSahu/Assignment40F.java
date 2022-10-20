/*Program 6 : WAP to find frequence of each word in a given String using Map.
input : "Hi Hello Techno Techno Hi"
output : Hi -> 2
         Hello -> 1
		 Techno -> 2*/

package gauravSahu;

import java.util.LinkedHashMap;
import java.util.Set;

public class Assignment40F {
	
	
	void getFreqOfWord(String[] input) {
		LinkedHashMap<String,Integer> listOfFreq = new LinkedHashMap<String, Integer>();
		for(String word : input) {
			if(listOfFreq.containsKey(word)) {
				int count = listOfFreq.get(word);
				listOfFreq.put(word,count + 1);
			}else {
				listOfFreq.put(word, 1);
			}
		}System.out.println(listOfFreq);
		Set<String> key = listOfFreq.keySet();
		for(String name : key) {
			System.out.println(name + " --> " + listOfFreq.get(name));
		}
	}
	public static void main(String[] args) {
		Assignment40F a40 = new Assignment40F();
		String input = "Hi Hello Techno Techno Hi" ;
		String[] inputSplit = input.split(" ");
		a40.getFreqOfWord(inputSplit);
		
	}

}

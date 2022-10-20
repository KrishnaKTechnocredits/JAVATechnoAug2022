/*Program 6 : WAP to find frequence of each word in a given String using Map.
input : "Hi Hello Techno Techno Hi"
output : Hi -> 2
         Hello -> 1
		 Techno -> 2*/
package asthaSrivastava.array.assignments.collections;

import java.util.Map;
import java.util.TreeMap;

public class StringFreqUsingMap {

	void getStringFreqUsingMap(String str) {
		String name[] = str.split(" ");
		Map<String, Integer> strMapFreq = new TreeMap<String, Integer>();
		for (int i = 0; i < name.length; i++) {

			if (strMapFreq.containsKey(name[i])) {
				int count = strMapFreq.get(name[i]);
				strMapFreq.put(name[i], count + 1);
			} else
				strMapFreq.put(name[i], 1);
		}
		System.out.println("Frequency of each element from given array is : " + strMapFreq);
	}

	public static void main(String[] args) {
		String str = "Hi Hello Techno Techno Hi";
		new StringFreqUsingMap().getStringFreqUsingMap(str);
	}
}

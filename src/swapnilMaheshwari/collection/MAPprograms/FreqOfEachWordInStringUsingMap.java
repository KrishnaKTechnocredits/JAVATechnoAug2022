/*
 Program 6 : WAP to find frequence of each word in a given String using Map.
input : "Hi Hello Techno Techno Hi"
output : Hi -> 2
         Hello -> 1
		 Techno -> 2
 */
package swapnilMaheshwari.Collection.MAPprograms;

import java.util.LinkedHashMap;
import java.util.Set;

public class FreqOfEachWordInStringUsingMap {
	LinkedHashMap<String, Integer> listOfName = new LinkedHashMap<String, Integer>();

	void getFreqOfEachWordInStringUsingMap(String[] strArr) {

		for (int index = 0; index < strArr.length; index++) {
			String str = strArr[index];
			if (!listOfName.containsKey(str)) {
				listOfName.put(str, 1);
			} else {
				int count = listOfName.get(str);
				listOfName.put(strArr[index], count + 1);
			}
		}
		Set<String> keys = listOfName.keySet();
		for (String key : keys) {
			System.out.println(key + " -->" + listOfName.get(key));
		}
	}

	public static void main(String[] args) {
		String input = "Hi Hello Techno Techno Hi";
		String[] str = input.split(" ");
		new FreqOfEachWordInStringUsingMap().getFreqOfEachWordInStringUsingMap(str);
	}
}

package shubhamG.Assignment31to40;

import java.util.LinkedHashMap;

/*
Program 6 : WAP to find frequence of each word in a given String using Map.
input : "Hi Hello Techno Techno Hi"
output : Hi -> 2
         Hello -> 1
		 Techno -> 2
*/
public class Assignment40Program6 {

	void getFrequencyOfEachString(String str) {
		String[] arr = str.split(" ");
		LinkedHashMap<String, Integer> frequency = new LinkedHashMap<String, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (frequency.containsKey(arr[i])) {
				frequency.put(arr[i], frequency.get(arr[i]) + 1);
			} else {
				frequency.put(arr[i], 1);
			}
		}
		for (String currentKey : frequency.keySet()) {
			System.out.println(currentKey + " ---> " + frequency.get(currentKey));
		}
	}

	public static void main(String[] args) {
		String input = "Hi Hello Techno Techno Hi";
		System.out.println("Input String is: " + input);
		new Assignment40Program6().getFrequencyOfEachString(input);
	}

}

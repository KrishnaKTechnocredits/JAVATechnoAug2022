/*Assignment 40 : 
Program 1 : Find frequency of each number using array and single while loop.
input : {3,5,33,3,55,3,11,11}
output : 3--->3
		5--->1
		33--->1
		55--->1
		11--->2

Program 2 : Find missing numbers from given array from 50 to 60.
input : {60,54,51,57}
output : [50,52,53,55,56,58,59]

Hint : removeAll

Program 3 : Return a reverse String [Method : inplace reverse].

Program 4 : Return a reverse String [Use : StringBuilder].

Program 5 : WAP to find frequence of each character using Map.
input : technocredits
output : {r=1, c=2, s=1, t=2, d=1, e=2, h=1, i=1, n=1, o=1}
          r --> 1
		  c --> 2
          s --> 1
          t --> 2
          ..... so on		  

Program 6 : WAP to find frequence of each word in a given String using Map.
input : "Hi Hello Techno Techno Hi"
output : Hi -> 2
         Hello -> 1
		 Techno -> 2

Program 7 : WAP to find frequence of each number in a given aaray using Map.
input : {10,2,5,2,3,3,3,10,11,8,8,8};
output : 2 -> 2
         3 -> 3
         5 -> 1
         8 -> 3
         10 -> 2
         11 -> 1  
*/

package apurvaBabel.Assignment31to40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Assignment40 {

	// Program 1 : Method to find frequency of each number using array and single
	// while loop
	void printFrequencyOfEachNumber(Integer[] input) {
		System.out.println("Frequency of each number from given input : ");
		System.out.println("Input : " + Arrays.toString(input));
		List<Integer> listOfOriginalNum = new ArrayList<Integer>(Arrays.asList(input));
		List<Integer> listOfRemovedNum = new ArrayList<Integer>();
		int num = 0, beforeSize = 0, afterSize = 0;

		while (listOfOriginalNum.size() > 0) {
			num = listOfOriginalNum.get(0);
			beforeSize = listOfOriginalNum.size();
			listOfRemovedNum.add(num);
			listOfOriginalNum.removeAll(listOfRemovedNum);
			afterSize = listOfOriginalNum.size();

			System.out.println(num + " --> " + (beforeSize - afterSize));
		}
	}

	// Program 2 : Method to find missing numbers from given array from 50 to 60
	void printMissingNumbersFromGivenRange(int startNum, int endNum, Integer[] input) {
		System.out.println("\nRange : " + startNum + " to " + endNum);
		System.out.println("Input : " + Arrays.toString(input));
		List<Integer> listOfInputNum = new ArrayList<Integer>(Arrays.asList(input));
		List<Integer> listOfOutputNum = new ArrayList<Integer>();

		for (int index = startNum; index <= endNum; index++) {
			listOfOutputNum.add(index);
		}
		listOfOutputNum.removeAll(listOfInputNum);
		System.out.println("Missing numbers from given range : " + listOfOutputNum);
	}

	// Program 3 : Method to return a reverse String [Method : inplace reverse]
	String getReverseStringByInplaceReversal(String name) {
		System.out.println("\nOriginal string : " + name);
		for (int i = 0, j = name.length() - 1; i < j; i++, j--) {
			char ch1 = name.charAt(i);
			char ch2 = name.charAt(j);

			if (i == 0) {
				name = ch2 + name.substring(i + 1, j) + ch1;
			} else {
				name = name.substring(0, i) + ch2 + name.substring(i + 1, j) + ch1 + name.substring(j + 1);
			}
		}
		return name;
	}

	// Program 4 : Method to return a reverse String [Use : StringBuilder]
	StringBuilder getReverseStringByStringBuilder(String name) {
		StringBuilder stringBuilder = new StringBuilder(name);
		System.out.println("\nOriginal string : " + name);
		stringBuilder.reverse();
		return stringBuilder;
	}

	// Program 5 : Method to find frequence of each character using Map
	void printFrequencyOfEachCharacter(String name) {
		System.out.println("\nFrequency of each character from given string : ");
		System.out.println("Input : " + name);
		Map<Character, Integer> frequencyOfChar = new HashMap<Character, Integer>();
		for (int index = 0; index < name.length(); index++) {
			Character ch = name.charAt(index);
			if (frequencyOfChar.containsKey(ch)) {
				frequencyOfChar.put(ch, frequencyOfChar.get(ch) + 1);
			} else {
				frequencyOfChar.put(ch, 1);
			}
		}
		Set<Character> key = frequencyOfChar.keySet();
		for (Character currentKey : key) {
			System.out.println(currentKey + " --> " + frequencyOfChar.get(currentKey));
		}
	}

	// Program 6 : Method to find frequence of each word in a given String using Map
	void printFrequencyOfEachString(String input) {
		System.out.println("\nFrequency of each string from given string : ");
		System.out.println("Input : " + input);
		String[] array = input.split(" ");
		Map<String, Integer> frequencyOfString = new LinkedHashMap<String, Integer>();
		for (String name : array) {
			if (frequencyOfString.containsKey(name)) {
				frequencyOfString.put(name, frequencyOfString.get(name) + 1);
			} else {
				frequencyOfString.put(name, 1);
			}
		}
		Set<String> key = frequencyOfString.keySet();
		for (String currentKey : key) {
			System.out.println(currentKey + " --> " + frequencyOfString.get(currentKey));
		}
	}

	// Program 7 : Method to find frequence of each number in a given array using
	// Map
	void printFrequencyOfEachNumberUsingMap(Integer[] input) {
		System.out.println("\nFrequency of each number from given array : ");
		System.out.println("Input : " + Arrays.toString(input));
		Map<Integer, Integer> frequencyOfNumber = new TreeMap<Integer, Integer>();
		for (Integer num : input) {
			if (frequencyOfNumber.containsKey(num)) {
				frequencyOfNumber.put(num, frequencyOfNumber.get(num) + 1);
			} else {
				frequencyOfNumber.put(num, 1);
			}
		}
		Set<Integer> key = frequencyOfNumber.keySet();
		for (Integer currentKey : key) {
			System.out.println(currentKey + " --> " + frequencyOfNumber.get(currentKey));
		}
	}

	public static void main(String[] args) {
		Assignment40 assignment40 = new Assignment40();
		Integer[] input1 = { 3, 5, 33, 3, 55, 3, 11, 11 };
		assignment40.printFrequencyOfEachNumber(input1);

		Integer[] input2 = { 60, 54, 51, 57 };
		assignment40.printMissingNumbersFromGivenRange(50, 60, input2);

		String name = "technocredits";
		System.out.println("Reverse string using inplace replacement method : "
				+ assignment40.getReverseStringByInplaceReversal(name));
		System.out
				.println("Reverse string using StringBuilder : " + assignment40.getReverseStringByStringBuilder(name));
		assignment40.printFrequencyOfEachCharacter(name);

		String input3 = "Hi Hello Techno Techno Hi";
		assignment40.printFrequencyOfEachString(input3);

		Integer[] input4 = { 10, 2, 5, 2, 3, 3, 3, 10, 11, 8, 8, 8 };
		assignment40.printFrequencyOfEachNumberUsingMap(input4);
	}
}

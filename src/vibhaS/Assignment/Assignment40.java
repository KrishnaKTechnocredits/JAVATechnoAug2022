package vibhaS.Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Assignment40 {

	// Method to find Frequency Of each number using array and single while loop
	void printFrequencyOFEachNumber(Integer[] input) {
		System.out.println("Frequency of each number from given input :");
		System.out.println("Input:" + Arrays.toString(input));
		List<Integer> listOfOriginalNum = new ArrayList<Integer>(Arrays.asList(input));
		List<Integer> listOfRemoveNum = new ArrayList<Integer>();
		int num = 0, beforSize = 0, afterSize = 0;
		while (listOfOriginalNum.size() > 0) {
			num = listOfOriginalNum.get(0);
			beforSize = listOfOriginalNum.size();
			listOfRemoveNum.add(num);
			listOfOriginalNum.removeAll(listOfRemoveNum);
			afterSize = listOfOriginalNum.size();
			System.out.println(num + "-->" + (beforSize - afterSize));
		}
	}

	// Method to find missing number from given array from 50 to 60
	void printMissingNumberFromGivenRange(int startNum, int endNum, Integer[] input) {
		System.out.println("\nRange : " + startNum + " to " + endNum);
		System.out.println("Input : " + Arrays.toString(input));
		List<Integer> listOfInputNum = new ArrayList<Integer>(Arrays.asList(input));
		List<Integer> listOfOutputNum = new ArrayList<Integer>();
		for (int index = startNum; index <= endNum; index++) {
			listOfOutputNum.add(index);
		}
		listOfOutputNum.removeAll(listOfInputNum);
		System.out.println("Missing number From given range :" + listOfOutputNum);
	}

	// Method to return a reverse String [Method :inplace reverse]
	String getReverseStringByInplaceReversal(String name) {
		System.out.println("\nOriginal string : " + name);
		for (int index = 0, innerindex = name.length() - 1; index < innerindex; index++, innerindex--) {
			char ch1 = name.charAt(index);
			char ch2 = name.charAt(innerindex);
			name = name.substring(0, index) + ch2 + name.substring(index + 1, innerindex) + ch1
					+ name.substring(innerindex);
		}
		return name;
	}

	// Methdo to return a reverse String [use:StringBuilder]
	StringBuilder getReverseStringBuilder(String name) {
		StringBuilder stringBuilder = new StringBuilder(name);
		System.out.println("\nOriginal string : " + name);
		stringBuilder.reverse();
		return stringBuilder;
	}

	// Method to find frequency of each charcter using map
	void printFrequencyOfEachCharacter(String name) {
		System.out.println("\nFrequency of each character from given string :");
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
			System.out.println(currentKey + "-->" + frequencyOfChar.get(currentKey));
		}
	}

	// Method to find frequency of each word in a given String using Map
	void printFrequencyOfEachString(String input) {
		System.out.println("\nFrequency of each string from given string :");
		System.out.println("Input : " + input);
		String[] array = input.split(" ");
		Map<String, Integer> frequencyOfString = new HashMap<String, Integer>();
		for (String name : array) {
			if (frequencyOfString.containsKey(name)) {
				frequencyOfString.put(name, frequencyOfString.get(name) + 1);
			} else {
				frequencyOfString.put(name, 1);
			}
		}
		Set<String> key = frequencyOfString.keySet();
		for (String currentKey : key) {
			System.out.println(currentKey + "-->" + frequencyOfString.get(currentKey));
		}
	}

	// method to find frequency of each number in a given array using
	void printFrequencyOfEachNumberUsingMap(Integer[] input) {
		System.out.println("\nFrequency of each number from given arrsy :");
		System.out.println("Input : " + Arrays.toString(input));
		Map<Integer, Integer> frequencyOfNumber = new HashMap<Integer, Integer>();
		for (Integer num : input) {
			if (frequencyOfNumber.containsKey(num)) {
				frequencyOfNumber.put(num, frequencyOfNumber.get(num) + 1);
			} else {
				frequencyOfNumber.put(num, 1);
			}
		}

		Set<Integer> key = frequencyOfNumber.keySet();
		for (Integer currentKey : key) {
			System.out.println(currentKey + "-->" + frequencyOfNumber.get(currentKey));
		}
	}

	public static void main(String[] args) {
		Assignment40 assignment40 = new Assignment40();
		Integer[] input = { 3, 5, 33, 3, 55, 3, 11, 11 };
		assignment40.printFrequencyOFEachNumber(input);
		System.out.println("");

		Integer[] input1 = { 60, 54, 51, 57 };
		assignment40.printMissingNumberFromGivenRange(50, 60, input1);
		System.out.println("");

		String name = "technocredits";
		System.out.println("Reverse string using implace replacement method : "
				+ assignment40.getReverseStringByInplaceReversal(name));
		System.out.println("");

		System.out.println("Reverse string using StringBuilder  : " + assignment40.getReverseStringBuilder(name));

		assignment40.printFrequencyOfEachCharacter(name);

		String input3 = "Hi Hello Techno Techno Hi";
		assignment40.printFrequencyOfEachString(input3);

		Integer[] input4 = { 10, 2, 5, 2, 3, 3, 3, 10, 11, 8, 8, 8 };
		assignment40.printFrequencyOfEachNumberUsingMap(input4);
	}
}

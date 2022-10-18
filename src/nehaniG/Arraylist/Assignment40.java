package nehaniG.Arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Assignment40 {

	void getFreqOfNumbers(Integer[] arr) {
		ArrayList<Integer> inputArray = new ArrayList<Integer>(Arrays.asList(arr));
		ArrayList<Integer> removableNumberList = new ArrayList<Integer>();
		int num = 0;
		int inputArrayLength = 0;
		int newLength = 0;
		while (inputArray.size() > 0) {
			num = inputArray.get(0);
			inputArrayLength = inputArray.size();
			removableNumberList.add(num);
			inputArray.removeAll(removableNumberList);
			newLength = inputArray.size();

			System.out.println("Frequency of " + num + " is - " + (inputArrayLength - newLength));
		}
	}

	ArrayList<Integer> findMissingNumber(Integer[] arr) {

		ArrayList<Integer> listOfMissingNumber = new ArrayList<Integer>();
		for (int number = 50; number <= 60; number++) {
			if (!Arrays.asList(arr).contains(number)) {
				listOfMissingNumber.add(number);
			}
		}
		return listOfMissingNumber;

	}

	void reverseString(String str) {
		for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
			char ch1 = str.charAt(i);
			char ch2 = str.charAt(j);
			if (i == 0)
				str = ch2 + str.substring(i + 1, j) + ch1;
			else
				str = str.substring(0, i) + ch2 + str.substring(i + 1, j) + ch1 + str.substring(j + 1);
		}
		System.out.println("Reversed String : " + str);
	}

	void reverseStringUsingSB(String str) {
		StringBuilder sb = new StringBuilder();
		for (int i = str.length() - 1; i >= 0; i--) {
			sb.append(str.charAt(i));
		}
		System.out.println("using string builder append function - " + sb);
		StringBuilder sb1 = new StringBuilder(str);
		System.out.println("using string builder reverse function : " + sb1.reverse());
	}

	void getCharacterFrequency(String name) {

		HashMap<Character, Integer> characterFrequency = new HashMap<Character, Integer>();
		for (int index = 0; index < name.length(); index++) {
			char ch = name.charAt(index);
			if (characterFrequency.containsKey(ch)) {
				characterFrequency.put(ch, characterFrequency.get(ch) + 1);
			} else {
				characterFrequency.put(ch, 1);
			}
		}
		Set<Character> key = characterFrequency.keySet();
		for (Character currentkey : key) {
			System.out.println(currentkey + "-" + characterFrequency.get(currentkey));
		}
	}

	void getFrequencyOfWord(String input) {
		String[] arr = input.split(" ");
		Map<String, Integer> Frequencyofword = new HashMap<String, Integer>();
		for (String name : arr) {
			if (Frequencyofword.containsKey(name)) {
				Frequencyofword.put(name, Frequencyofword.get(name) + 1);
			} else {
				Frequencyofword.put(name, 1);
			}
		}
		Set<String> key = Frequencyofword.keySet();
		for (String currentkey : key) {
			System.out.println(currentkey + "-" + Frequencyofword.get(currentkey));
		}
	}

	void getFrequencyOfNumber(Integer[] input) {
		Map<Integer, Integer> FrequencyOfNumber = new TreeMap<Integer, Integer>();
		for (Integer num : input) {
			if (FrequencyOfNumber.containsKey(num)) {
				FrequencyOfNumber.put(num, FrequencyOfNumber.get(num) + 1);
			} else {
				FrequencyOfNumber.put(num, 1);
			}
		}
		Set<Integer> key = FrequencyOfNumber.keySet();
		for (Integer currentkey : key) {
			System.out.println(currentkey + "-" + FrequencyOfNumber.get(currentkey));
		}
	}

	public static void main(String[] args) {
		Assignment40 assignment40 = new Assignment40();

		System.out.println("Program 1");
		Integer[] input1 = { 3, 5, 33, 3, 55, 3, 11, 11 };
		assignment40.getFreqOfNumbers(input1);

		System.out.println("------------------------------------------------------------------");
		System.out.println("Program 2");
		Integer[] input2 = { 60, 54, 51, 57 };
		System.out.println("The missing numbers are" + assignment40.findMissingNumber(input2));

		System.out.println("------------------------------------------------------------------");
		System.out.println("Program 3");
		String input3 = "Nehani Gupta";
		System.out.println("given input is : " + input3);
		assignment40.reverseString(input3);

		System.out.println("------------------------------------------------------------------");
		System.out.println("Program 4");
		String input4 = "Nehani Gupta";
		System.out.println("given input is : " + input4);
		assignment40.reverseStringUsingSB(input3);

		System.out.println("------------------------------------------------------------------");
		System.out.println("Program 5");
		String input5 = "technocredits";
		System.out.println("given input is : " + input5);
		assignment40.getCharacterFrequency(input5);

		System.out.println("------------------------------------------------------------------");
		System.out.println("Program 6");
		String input6 = "Hi Hello Techno Techno Hi";
		System.out.println("given input is : " + input6);
		assignment40.getFrequencyOfWord(input6);

		System.out.println("------------------------------------------------------------------");
		System.out.println("Program 7");
		Integer[] input7 = { 10, 2, 5, 2, 3, 3, 3, 10, 11, 8, 8, 8 };
		assignment40.getFrequencyOfNumber(input7);

	}

}

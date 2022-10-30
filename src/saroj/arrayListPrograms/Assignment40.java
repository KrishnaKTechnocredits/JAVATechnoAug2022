package saroj.arrayListPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Assignment40 {

	void frequencyOfEachNumber(Integer[] numbers) {
		ArrayList<Integer> oldList = new ArrayList<Integer>(Arrays.asList(numbers));
		ArrayList<Integer> newList = new ArrayList<Integer>();
		int oldSize = 0;
		int newSize = 0;
		int num = 0;
		while (oldList.size() > 0) {
			num = oldList.get(0);
			oldSize = oldList.size();
			newList.add(num);
			oldList.removeAll(newList);
			newSize = oldList.size();
			System.out.println(num + " --> " + (oldSize - newSize));
			newList.clear();
		}
	}

	void getMissingNumber(Integer[] numbers, int startRange, int endRange) {
		ArrayList<Integer> oldList = new ArrayList<Integer>(Arrays.asList(numbers));
		ArrayList<Integer> newList = new ArrayList<>();
		for (int index = startRange; index <= endRange; index++) {
			if (!oldList.contains(index)) {
				newList.add(index);
			}
		}
		System.out.println("Missing numbers are: " + newList);
	}

	void getMissingNumber2(Integer[] numbers, int startRange, int endRange) {
		ArrayList<Integer> oldList = new ArrayList<Integer>(Arrays.asList(numbers));
		ArrayList<Integer> newList = new ArrayList<>();
		for (int index = startRange; index <= endRange; index++) {
			newList.add(index);
		}
		newList.removeAll(oldList);
		System.out.println("Missing numbers are: " + newList);
	}

	void frequencyOfCharacterUsingMap(String word) {
		Map<Character, Integer> name = new HashMap<Character, Integer>();
		for (int index = 0; index < word.length(); index++) {
			char ch = word.charAt(index);
			if (name.containsKey(ch)) {
				int value = name.get(ch) + 1;
				name.put(ch, value);
			} else {
				name.put(ch, 1);
			}
		}
		System.out.println(name);
		Set<Character> setKey = name.keySet();
		for (Character key1 : setKey) {
			System.out.println(key1 + "-->" + name.get(key1));
		}
	}

	void getFrequencyOfEachWord(String sentence) {
		String[] sentenceArray = sentence.split(" ");
		Map<String, Integer> frequencyOfWord = new HashMap<String, Integer>();
		for (int index = 0; index < sentenceArray.length; index++) {
			String word = sentenceArray[index];
			if (frequencyOfWord.containsKey(word)) {
				int value = frequencyOfWord.get(word) + 1;
				frequencyOfWord.put(word, value);
			} else {
				frequencyOfWord.put(word, 1);
			}
		}
		System.out.println(frequencyOfWord);
		Set<String> setKey = frequencyOfWord.keySet();
		for (String key1 : setKey) {
			System.out.println(key1 + "-->" + frequencyOfWord.get(key1));
		}
	}

	void getFrequencyOfEachNumber(Integer[] number) {
		ArrayList<Integer> arraylist = new ArrayList<>(Arrays.asList(number));
		Map<Integer, Integer> frequencyOfNumber = new TreeMap<Integer, Integer>();
		for (int index = 0; index < arraylist.size(); index++) {
			if (frequencyOfNumber.containsKey(arraylist.get(index))) {
				int value = frequencyOfNumber.get(arraylist.get(index)) + 1;
				frequencyOfNumber.put(arraylist.get(index), value);
			} else {
				frequencyOfNumber.put(arraylist.get(index), 1);
			}
		}
		System.out.println(frequencyOfNumber);
	}

	void reverseStringUsingStringBuilder(String word) {
		StringBuilder sb = new StringBuilder(word);
		sb.reverse();
		System.out.println("Reverse of :" + word + " is: " + sb);
	}

	void getInplaceReverseString(String word) {
		for (int index = 0, innerIndex = word.length() - 1; index < innerIndex; index++, innerIndex--) {
			char ch = word.charAt(index);
			char ch1 = word.charAt(innerIndex);
			if (index == 0) {
				word = ch1 + word.substring(index + 1, innerIndex) + ch;
			} else {
				word = word.substring(0, index) + ch1 + word.substring(index + 1, innerIndex) + ch
						+ word.substring(innerIndex + 1);
			}
		}
		System.out.println(word);
	}

	public static void main(String[] args) {
		Assignment40 assignment40 = new Assignment40();
		Integer[] num = { 3, 5, 33, 3, 55, 3, 11, 11 };
		System.out.println("Frequency of each number: ");
		assignment40.frequencyOfEachNumber(num);
		System.out.println("===========================================================");

		Integer[] num1 = { 60, 54, 51, 57 };
		int startRange = 50;
		int endRange = 60;
		assignment40.getMissingNumber(num1, startRange, endRange);
		System.out.println("===========================================================");

		Integer[] num2 = { 60, 54, 51, 57 };
		int startRange1 = 50;
		int endRange1 = 60;
		assignment40.getMissingNumber2(num2, startRange1, endRange1);
		System.out.println("===========================================================");

		String str = "technocredits";
		System.out.println("Frequency of each character: ");
		assignment40.frequencyOfCharacterUsingMap(str);
		System.out.println("===========================================================");

		String sentence = "Hi Hello Techno Techno Hi";
		System.out.println("Frequency of each word: ");
		assignment40.getFrequencyOfEachWord(sentence);
		System.out.println("===========================================================");

		Integer[] numbers = { 10, 2, 5, 2, 3, 3, 3, 10, 11, 8, 8, 8 };
		System.out.println("Frequency of each number: ");
		assignment40.getFrequencyOfEachNumber(numbers);
		System.out.println("===========================================================");

		String word = "technocredits";
		assignment40.reverseStringUsingStringBuilder(word);
		System.out.println("===========================================================");

		String word1 = "Apple";
		System.out.println("Given string is: " + word1);
		assignment40.getInplaceReverseString(word1);
	}
}

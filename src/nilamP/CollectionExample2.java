/*Assignment 40 : 16th Oct'2022

Program 1 : Find frequency of each number using array and single while loop.
input : {3,5,33,3,55,3,11,11}
output : 3--->3
		5--->1
		33--->1
		55--->1
		11--->2

Program 2 : Find missing numbers from give array from 50 to 60.
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

Program 7 : WAP to find frequence of each word in a given String using Map.
input : {10,2,5,2,3,3,3,10,11,8,8,8};
output : 2 -> 2
         3 -> 3
         5 -> 1
         8 -> 3
         10 -> 2
         11 -> 1  */

package nilamP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class CollectionExample2 {
	void printFrequencyOfEachNumber(Integer[] input) {
		List<Integer> OriginalNumList = new ArrayList<Integer>(Arrays.asList(input));
		List<Integer> NewNumList = new ArrayList<Integer>();
		int num = 0;
		int originalLenght = 0;
		int newLength = 0;
		while (OriginalNumList.size() > 0) {
			num = OriginalNumList.get(0);
			originalLenght = OriginalNumList.size();
			NewNumList.add(num);
			OriginalNumList.removeAll(NewNumList);
			newLength = OriginalNumList.size();

			System.out.println(num + "-->" + (originalLenght - newLength));
		}

	}

	void PrintMissingFromRange(int startNum, int endNum, Integer[] input) {
		List<Integer> inputList = new ArrayList<Integer>(Arrays.asList(input));
		List<Integer> outputList = new ArrayList<Integer>();
		for (int i = startNum; i <= endNum; i++) {
			outputList.add(i);
		}
		outputList.removeAll(inputList);
		System.out.println("Output : " + outputList);
	}

	String getReverseString(String input) {
		for (int i = 0, j = input.length() - 1; i < j; i++, j--) {
			char ch1 = input.charAt(i);
			char ch2 = input.charAt(j);
			if (i == 0) {
				input = ch2 + input.substring(i + 1, j) + ch1;
			} else {
				input = input.substring(0, i) + ch2 + input.substring(i + 1, j) + ch1 + input.substring(j + 1);
			}
		}
		return input;
	}

	void getReverseStringUsingStringBuilder(String name) {
		StringBuilder sb = new StringBuilder(name);
		sb.reverse();
		System.out.println("output: " + sb);
	}

	void getFrequencyUsingMap(String input) {
		Map<Character, Integer> FrequencyofChar = new HashMap<Character, Integer>();
		for (int i = 0; i < input.length(); i++) {
			Character ch = input.charAt(i);
			if (FrequencyofChar.containsKey(ch)) {
				FrequencyofChar.put(ch, FrequencyofChar.get(ch) + 1);
			} else {
				FrequencyofChar.put(ch, 1);
			}
		}
		Set<Character> key = FrequencyofChar.keySet();
		for (Character currentkey : key) {
			System.out.println(currentkey + "-->" + FrequencyofChar.get(currentkey));
		}
	}

	void getFrequencyOfWordFromString(String input) {
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
			System.out.println(currentkey + "-->" + Frequencyofword.get(currentkey));
		}
	}

	void getFrequencyOfNumUsingMap(Integer[] input) {
		Map<Integer, Integer> FrequencyOfNum = new TreeMap<Integer, Integer>();
		for (Integer num : input) {
			if (FrequencyOfNum.containsKey(num)) {
				FrequencyOfNum.put(num, FrequencyOfNum.get(num) + 1);
			} else {
				FrequencyOfNum.put(num, 1);
			}
		}
		Set<Integer> key = FrequencyOfNum.keySet();
		for (Integer currentkey : key) {
			System.out.println(currentkey + "-->" + FrequencyOfNum.get(currentkey));
		}
	}

	public static void main(String[] args) {
		CollectionExample2 ce = new CollectionExample2();
		Integer[] input = { 3, 5, 33, 3, 55, 3, 11, 11 };
		System.out.println(" ** program 1 output **");
		System.out.println("input : " + Arrays.toString(input));
		System.out.print("output : ");
		ce.printFrequencyOfEachNumber(input);

		System.out.println(" ** program 2 output **");
		Integer[] input2 = { 60, 54, 51, 57 };
		System.out.println("input : " + Arrays.toString(input2));
		ce.PrintMissingFromRange(50, 60, input2);
		System.out.println(" ** program 3 output **");
		String name = "technocredits";
		System.out.println("input : " + name);
		System.out.println("output : " + ce.getReverseString(name));
		System.out.println(" ** program 4 output **");
		System.out.println("input : " + name);
		ce.getReverseStringUsingStringBuilder(name);
		System.out.println(" ** program 5 output **");
		System.out.println("input : " + name);
		System.out.print("output : ");
		ce.getFrequencyUsingMap(name);
		System.out.println(" ** program 6 output **");
		String input3 = "Hi Hello Techno Techno Hi";
		System.out.println("input : " + input3);
		System.out.print("output : ");
		ce.getFrequencyOfWordFromString(input3);
		System.out.println(" ** program 7 output ** ");
		Integer[] input4 = { 10, 2, 5, 2, 3, 3, 3, 10, 11, 8, 8, 8 };
		System.out.println("input : " + Arrays.toString(input4));
		System.out.print("output : ");
		ce.getFrequencyOfNumUsingMap(input4);

	}
}

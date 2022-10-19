/*Assignment 39 : 15th Oct'2022

Program 1: Print all duplicate names from given Array.

input : {"Maulik", "Umesh", "Saroj", "Umesh"};
output : ["Umesh"] 

Program 2 : Return unique names from given Array.
String[] arr = {"Maulik", "Umesh", "Saroj", "Umesh","Umesh","Saroj"};
output : ["Maulik", "Umesh", "Saroj"]

Program 3 : Write a program to return unique characters from given name.

input : technocredits
output : [t,e,c,h,n,o,r,d,i,s]

Set<Character> getUniqueCharacter(String name){

}

Program 4 : Remove duplicates from array containing numbers [insertion order].

input : {10,10,13,12,12,10,55,66,55,11}
output : [10,13,12,55,66,11]

Program 5 : Remove duplicates from array containing numbers [natural order].

input : {10,10,13,12,12,10,55,66,55,11}
output : [10,11,12,13,55,66]

Program 6 : Remove duplicates from array containing numbers using Set.

input : {10,10,13,12,12,10,55,66,55,11,11}
output : [10,12,55,11]

Program 7 : Remove duplicates from array containing numbers using List.

input : {10,10,13,12,12,10,55,66,55,11,11}
output : [10,12,55,11]*/
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

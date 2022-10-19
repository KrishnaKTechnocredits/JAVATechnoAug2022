package nehaniG.Arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Assignment39 {
	void getDuplicateName(String[] input) {
		HashSet<String> inputList = new HashSet<String>();
		HashSet<String> outputList = new HashSet<String>();
		for (String name : input) {
			if (!inputList.add(name)) {
				outputList.add(name);
			}
		}
		System.out.println("output :" + outputList + "\n");
	}

	void getUniqueName(String[] input) {
		LinkedHashSet<String> outputList = new LinkedHashSet<String>();
		for (String name : input) {
			outputList.add(name);
		}
		System.out.println("output :" + outputList + "\n");
	}

	void getUniqueCharacter(String input) {
		LinkedHashSet<Character> list = new LinkedHashSet<Character>();
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			list.add(ch);
		}

		System.out.println("output :" + list + "\n");
	}

	void removeDuplicateUsingLinkedHashSet(Integer[] input) {
		LinkedHashSet<Integer> list = new LinkedHashSet<Integer>();
		for (int i = 0; i < input.length; i++) {
			list.add(input[i]);
		}
		System.out.println("output :" + list + "\n");
	}

	void removeDuplicateUsingTreeSet(Integer[] input) {
		TreeSet<Integer> list = new TreeSet<Integer>();
		for (int i = 0; i < input.length; i++) {
			list.add(input[i]);
		}
		System.out.println("output :" + list + "\n");
	}

	void removeDuplicateUsingHashSet(Integer[] input) {
		LinkedHashSet<Integer> inputList = new LinkedHashSet<Integer>();
		LinkedHashSet<Integer> outputList = new LinkedHashSet<Integer>();
		for (int i = 0; i < input.length; i++) {
			if (!inputList.add(input[i])) {
				outputList.add(input[i]);
			}
		}
		System.out.println("output :" + outputList + "\n");
	}

	void removeDuplicateUsingList(Integer[] input) {
		ArrayList<Integer> inputList = new ArrayList<Integer>(Arrays.asList(input));
		ArrayList<Integer> outputList = new ArrayList<Integer>();

		for (Integer num : inputList) {
			if (inputList.indexOf(num) != inputList.lastIndexOf(num) && !outputList.contains(num)) {
				outputList.add(num);
			}
		}
		System.out.println("output :" + outputList);

	}

	public static void main(String[] args) {
		Assignment39 assignment39 = new Assignment39();
		System.out.println("--------------------------------------------------------");
		System.out.println("Program 1");
		String[] input1 = { "Maulik", "Umesh", "Saroj", "Umesh" };
		assignment39.getDuplicateName(input1);
		
		
		System.out.println("--------------------------------------------------------");
		System.out.println("Program 2");
		String[] input2 = { "Maulik", "Umesh", "Saroj", "Umesh", "Umesh", "Saroj" };
		assignment39.getUniqueName(input2);
		
		System.out.println("--------------------------------------------------------");
		System.out.println("Program 3");
		String input3 = "technocredits";
		assignment39.getUniqueCharacter(input3);
		
		System.out.println("--------------------------------------------------------");
		System.out.println("Program 4");
		Integer[] input4 = { 10, 10, 13, 12, 12, 10, 55, 66, 55, 11 };
		assignment39.removeDuplicateUsingLinkedHashSet(input4);
		
		System.out.println("--------------------------------------------------------");
		System.out.println("Program 5");
		Integer[] input5 = { 10, 10, 13, 12, 12, 10, 55, 66, 55, 11 };
		assignment39.removeDuplicateUsingTreeSet(input5);

		System.out.println("--------------------------------------------------------");
		System.out.println("Program 6");
		Integer[] input6 = { 10, 10, 13, 12, 12, 10, 55, 66, 55, 11, 11 };
		assignment39.removeDuplicateUsingHashSet(input6);
		
		System.out.println("--------------------------------------------------------");
		System.out.println("Program 7");
		Integer[] input7 = { 10, 10, 13, 12, 12, 10, 55, 66, 55, 11, 11 };
		assignment39.removeDuplicateUsingList(input7);

	}
}

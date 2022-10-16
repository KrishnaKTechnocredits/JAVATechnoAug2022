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
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class CollectionExample2 {
	void getDuplicateNames(String[] input) {
		HashSet<String> inputList = new HashSet<String>();
		HashSet<String> outputList = new HashSet<String>();
		for (String name : input) {
			if (!inputList.add(name)) {
				outputList.add(name);
			}

		}
		System.out.println("output : " + outputList + "\n");
	}

	void getUniqueNames(String[] input) {

		LinkedHashSet<String> list = new LinkedHashSet<String>(Arrays.asList(input));
		System.out.println("output : " + list + "\n");
	}

	void getUniqueChar(String input) {
		LinkedHashSet<Character> list = new LinkedHashSet<Character>();
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			list.add(ch);
		}
		System.out.println("output : " + list + "\n");
	}

	void getUniqueNum(Integer[] input) {
		LinkedHashSet<Integer> listofNumber = new LinkedHashSet<Integer>(Arrays.asList(input));
		System.out.println("output : " + listofNumber + "\n");
	}

	void getUniqueNumbers(Integer[] input) {
		TreeSet<Integer> list = new TreeSet<Integer>(Arrays.asList(input));
		System.out.println("output : " + list + "\n");
	}

	void getDuplicateNumUsingSet(Integer[] input) {
		LinkedHashSet<Integer> inputList = new LinkedHashSet<Integer>();
		LinkedHashSet<Integer> outputList = new LinkedHashSet<Integer>();
		for (Integer list : input) {
			if (!inputList.add(list)) {
				outputList.add(list);
			}

		}
		System.out.println("output : " + outputList + "\n");

	}

	void getDuplicateNumList(Integer[] input) {
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
		CollectionExample2 ce = new CollectionExample2();
		System.out.println(" ** program 1 output ** ");
		String[] input = { "Maulik", "Umesh", "Saroj", "Umesh" };
		System.out.println("input : " + Arrays.toString(input));
		ce.getDuplicateNames(input);

		System.out.println("** program 2 output **");
		String[] input2 = { "Maulik", "Umesh", "Saroj", "Umesh", "Umesh", "Saroj" };
		System.out.println("input : " + Arrays.toString(input2));
		ce.getUniqueNames(input2);

		System.out.println(" **  progrma 3 output : ");
		String input3 = "technocredits";
		System.out.println("input : " + input3);
		ce.getUniqueChar(input3);

		System.out.println(" ** program 4 output **");
		Integer[] input4 = { 10, 10, 13, 12, 12, 10, 55, 66, 55, 11 };
		System.out.println("Input : " + Arrays.toString(input4));
		ce.getUniqueNum(input4);

		System.out.println(" ** program 5 output **");
		// Integer[] input5 = {10,10,13,12,12,10,55,66,55,11};
		System.out.println("Input : " + Arrays.toString(input4));
		ce.getUniqueNumbers(input4);

		System.out.println(" ** program 6 output **");
		Integer[] input5 = { 10, 10, 13, 12, 12, 10, 55, 66, 55, 11, 11 };
		System.out.println("Input : " + Arrays.toString(input5));
		ce.getDuplicateNumUsingSet(input5);

		System.out.println(" ** program 7 output **");
		Integer[] input6 = { 10, 10, 13, 12, 12, 10, 55, 66, 55, 11, 11 };
		System.out.println("Input : " + Arrays.toString(input6));
		ce.getDuplicateNumList(input6);
	}
}

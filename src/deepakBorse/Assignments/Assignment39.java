/*
 * Assignment 39 : 15th Oct'2022

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
output : [10,12,55,11]
 */
package deepakBorse.Assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Assignment39 {

	void getDupname(String[] names) {
		System.out.println("\nProgram 1: Print all duplicate names from given Array");
		System.out.println("Input String array: " + Arrays.toString(names));
		HashSet<String> setOfName = new HashSet<String>();
		System.out.print("Output: ");
		for (String name : names) {
			boolean flag = setOfName.add(name);
			if (!flag) {
				System.out.print(name);
			}
		}

	}

	void getuniqueName(String[] listnames) {
		System.out.println("\n\nProgram 2 : Return unique names from given Array");
		System.out.println("Input String array: " + Arrays.toString(listnames));
		HashSet<String> listofuniquename = new HashSet<String>(Arrays.asList(listnames));
		System.out.println("Output :" + listofuniquename);
	}

	void getuniquecharater(String name) {
		System.out.println("\nProgram 3 : Write a program to return unique characters from given name");
		System.out.println("Input :" + name);
		HashSet<Character> characterset = new LinkedHashSet<Character>();

		for (int index = 0; index < name.length(); index++) {
			Character ch = name.charAt(index);
			characterset.add(ch);
		}
		System.out.println("Output :" + characterset);
	}

//Program 4 : Remove duplicates from array containing numbers [insertion order].
	void removedupnumber(Integer[] numset) {
		System.out.println("\nProgram 4 : Remove duplicates from array containing numbers [insertion order]");
		System.out.println("Input array: " + Arrays.toString(numset));
		Set<Integer> setofnum = new LinkedHashSet<Integer>();
		for (Integer number : numset) {
			setofnum.add(number);
		}

		System.out.println("Output :" + setofnum);
	}

//Program 5 : Remove duplicates from array containing numbers [natural order]
	void removedupNaturalorder(Integer[] numset) {
		System.out.println("\nProgram 5 :Remove duplicates from array containing numbers [natural order]");
		System.out.println("Input array: " + Arrays.toString(numset));
		Set<Integer> setofnum = new TreeSet<Integer>();
		for (Integer number : numset) {
			setofnum.add(number);
		}

		System.out.println("Output :" + setofnum);
	}

//Program 7 : Remove duplicates from array containing numbers using Set
	Set<Integer> removeDuplicatesFromArrayUsingSet(Integer[] arr) {

		Set<Integer> outputHashSet = new LinkedHashSet<>();
		Set<Integer> outputHashSet1 = new LinkedHashSet<>();

		for (int num : arr) {
			boolean flag = outputHashSet.add(num);
			if (!flag) {
				outputHashSet1.add(num);
			}
		}
		return outputHashSet1;
	}

	// Program 7 : Remove duplicates from array containing numbers using List.
	List<Integer> removeDuplicateNumbersFromArray(Integer[] arr) {

		ArrayList<Integer> listOfNum = new ArrayList<>(Arrays.asList(arr));
		ArrayList<Integer> outputList = new ArrayList<Integer>();

		for (Integer num : listOfNum) {
			if (listOfNum.indexOf(num) != listOfNum.lastIndexOf(num) && !outputList.contains(num)) {
				outputList.add(num);
			}
		}
		return outputList;
	}

	public static void main(String[] args) {

		Assignment39 Assignment = new Assignment39();

		String[] names = { "Maulik", "Umesh", "Saroj", "Umesh" };
		Assignment.getDupname(names);

		String[] listofname = { "Maulik", "Umesh", "Saroj", "Umesh", "Umesh", "Saroj" };
		Assignment.getuniqueName(listofname);

		String input = "technocredits";
		Assignment.getuniquecharater(input);

		Integer[] numberset = { 10, 10, 13, 12, 12, 10, 55, 66, 55, 11 };
		Assignment.removedupnumber(numberset);
		Assignment.removedupNaturalorder(numberset);

		System.out.println("\nProgram 6: Remove duplicates from array containing numbers using Set");
		System.out.println("Input array: " + Arrays.toString(numberset));
		System.out.println("Output: " + Assignment.removeDuplicatesFromArrayUsingSet(numberset));

		System.out.println("\nProgram 7: Remove duplicates from array containing numbers using List.");
		System.out.println("Input array: " + Arrays.toString(numberset));
		System.out.println("Output: " + Assignment.removeDuplicateNumbersFromArray(numberset));
	}

}

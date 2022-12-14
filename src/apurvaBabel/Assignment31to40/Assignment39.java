/*Assignment 39 :

Program 1: Print all duplicate names from given Array.

input : {"Maulik", "Umesh", "Saroj", "Umesh"};
output : ["Umesh"] 

Program 2 : Return unique names from given Array.
String[] arr = {"Maulik", "Umesh", "Saroj", "Umesh","Umesh","Saroj"};
output : ["Maulik", "Umesh", "Saroj"]

Program 3 : Write a program to return unique characters from given name.

input : technocredits
output : [t,e,c,h,n,o,r,d,i,s]

Program 4 : Remove duplicates from array containing numbers [insertion order].

input : {10,10,13,12,12,10,55,66,55,11}
output : [10,13,12,55,66,11]

Program 5 : Remove duplicates from array containing numbers [natural order].

input : {10,10,13,12,12,10,55,66,55,11}
output : [10,11,12,13,55,66]

Program 6 : Return duplicates from array containing numbers using Set.

input : {10,10,13,12,12,10,55,66,55,11,11}
output : [10,12,55,11]

Program 7 : Remove duplicates from array containing numbers using List.

input : {10,10,13,12,12,10,55,66,55,11,11}
output : [10,12,55,11]
*/

package apurvaBabel.Assignment31to40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Assignment39 {

	// Program 1 : Method to print all duplicate names from given Array
	void printAllDuplicateNames(String[] input) {
		System.out.println("Duplicate names from given array : ");
		System.out.println("Input : " + Arrays.toString(input));
		HashSet<String> setOfNames1 = new HashSet<String>();
		HashSet<String> setOfNames2 = new HashSet<String>();
		for (String name : input) {
			if (!setOfNames1.add(name)) {
				setOfNames2.add(name);
			}
		}
		System.out.println("Output : " + setOfNames2);
	}

	// Program 2 : Method to return unique names from given Array
	LinkedHashSet<String> getUniqueNames(String[] input) {
		System.out.println("\nUnique names from array : ");
		System.out.println("Input : " + Arrays.toString(input));
		LinkedHashSet<String> setOfNames = new LinkedHashSet<String>(Arrays.asList(input));
		return setOfNames;
	}

	// Program 3 : Method to return unique characters from given name
	LinkedHashSet<Character> getUniqueCharacters(String input) {
		System.out.println("\nUnique characters from given name : ");
		System.out.println("Input : " + input);
		LinkedHashSet<Character> setOfCharacters = new LinkedHashSet<Character>();
		for (int index = 0; index < input.length(); index++) {
			Character ch = input.charAt(index);
			setOfCharacters.add(ch);
		}
		return setOfCharacters;
	}

	// Program 4 : Method to remove duplicates from array containing numbers
	// [insertion order]
	LinkedHashSet<Integer> getUniqueNumbers1(Integer[] input) {
		System.out.println("\nUnique numbers from array (Insertion order): ");
		System.out.println("Input : " + Arrays.toString(input));
		LinkedHashSet<Integer> setOfNumbers = new LinkedHashSet<Integer>(Arrays.asList(input));
		return setOfNumbers;
	}

	// Program 5 : Method to remove duplicates from array containing numbers
	// [natural order]
	TreeSet<Integer> getUniqueNumbers2(Integer[] input) {
		System.out.println("\nUnique numbers from array (Natural order) : ");
		System.out.println("Input : " + Arrays.toString(input));
		TreeSet<Integer> setOfNumbers = new TreeSet<Integer>(Arrays.asList(input));
		return setOfNumbers;
	}

	// Program 6 : Method to return duplicates from array containing numbers using
	// Set
	LinkedHashSet<Integer> getDuplicateNumbersUsingSet(Integer[] input) {
		System.out.println("\nDuplicate numbers from given array using Set : ");
		System.out.println("Input : " + Arrays.toString(input));
		LinkedHashSet<Integer> setOfNumbers1 = new LinkedHashSet<Integer>();
		LinkedHashSet<Integer> setOfNumbers2 = new LinkedHashSet<Integer>();
		for (Integer num : input) {
			if (!setOfNumbers1.add(num)) {
				setOfNumbers2.add(num);
			}
		}
		return setOfNumbers2;
	}

	// Program 7 : Method to return duplicates from array containing numbers using
	// List
	ArrayList<Integer> getDuplicateNumbersUsingList(Integer[] input) {
		System.out.println("\nDuplicate numbers from given array using List : ");
		System.out.println("Input : " + Arrays.toString(input));
		ArrayList<Integer> listOfInputNumbers = new ArrayList<Integer>(Arrays.asList(input));
		ArrayList<Integer> listOfOutputNumbers = new ArrayList<Integer>();
		for (Integer num : listOfInputNumbers) {
			if (listOfInputNumbers.indexOf(num) != listOfInputNumbers.lastIndexOf(num)
					&& !listOfOutputNumbers.contains(num)) {
				listOfOutputNumbers.add(num);
			}
		}
		return listOfOutputNumbers;
	}

	public static void main(String[] args) {
		Assignment39 assignment39 = new Assignment39();
		String[] arr1 = { "Maulik", "Umesh", "Saroj", "Umesh" };
		assignment39.printAllDuplicateNames(arr1);

		String[] arr2 = { "Maulik", "Umesh", "Saroj", "Umesh", "Umesh", "Saroj" };
		System.out.println("Output : " + assignment39.getUniqueNames(arr2));

		String name = "technocredits";
		System.out.println("Output : " + assignment39.getUniqueCharacters(name));

		Integer[] arr3 = { 10, 10, 13, 12, 12, 10, 55, 66, 55, 11 };
		System.out.println("Output : " + assignment39.getUniqueNumbers1(arr3));
		System.out.println("Output : " + assignment39.getUniqueNumbers2(arr3));

		Integer[] arr4 = { 10, 10, 13, 12, 12, 10, 55, 66, 55, 11, 11 };
		System.out.println("Output : " + assignment39.getDuplicateNumbersUsingSet(arr4));
		System.out.println("Output : " + assignment39.getDuplicateNumbersUsingList(arr4));

	}
}

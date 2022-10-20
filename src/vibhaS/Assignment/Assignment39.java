package vibhaS.Assignment;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Arrays;
import java.util.TreeSet;
import java.util.ArrayList;

public class Assignment39 {

	// Print all duplicate name from given array
	void printAllDuplicateName(String[] arr) {
		System.out.println(" Duplicate name in given array ");
		HashSet<String> hashset = new HashSet<String>();
		for (String str1 : arr) {
			boolean flag = hashset.add(str1);
			if (flag == false) {
				System.out.println(hashset);
			}
		}
	}

	// Return unique name from given array
	LinkedHashSet<String> uniqueNameFromArray(String[] arr1) {
		System.out.println(" Unique name in given array ");
		LinkedHashSet<String> linkedhashset = new LinkedHashSet<String>();
		for (String name : arr1) {
			linkedhashset.add(name);
		}
		return linkedhashset;
	}

	// Write a program to return unique character from given name
	LinkedHashSet<Character> UniqueCharacterInArray(String str) {
		char[] chArr = str.toCharArray();
		System.out.println(" Unique character in given array ");
		LinkedHashSet<Character> linkedhashset1 = new LinkedHashSet<Character>();
		for (Character ch : chArr) {
			linkedhashset1.add(ch);
		}
		return linkedhashset1;
	}

	// Remove duplicate from array containing number[insertion order]
	LinkedHashSet<Integer> uniqueNumberThroughInsertionOrder(Integer[] arr) {
		System.out.println(" Remove all dupicate from array Thorugh [insertion order] ");
		LinkedHashSet<Integer> linkedhashset2 = new LinkedHashSet<Integer>(Arrays.asList(arr));
		return linkedhashset2;
	}

	// Remove duplicate from array containing number[natural order]
	TreeSet<Integer> uniqueThroughNaturalOrder(Integer[] arr) {
		System.out.println(" Remove all dupicate from array Thorugh [natural order] ");
		TreeSet<Integer> treeset = new TreeSet<Integer>(Arrays.asList(arr));
		return treeset;
	}

	// remove duplicate from array containing number using set
	LinkedHashSet<Integer> finduniqueNumberThroughSet(Integer[] arr) {
		System.out.println("Unique number from array Using set ");
		LinkedHashSet<Integer> linkedhashset1 = new LinkedHashSet<Integer>();
		LinkedHashSet<Integer> linkedhashset2 = new LinkedHashSet<Integer>();
		for (Integer num : arr) {
			if (!linkedhashset1.add(num))
				linkedhashset2.add(num);
		}
		return linkedhashset2;
	}

	// Remove Duplicate from array Containing using list
	ArrayList<Integer> findUniqueNumberUsingList(Integer[] arr) {
		System.out.println("Unique number from array Using list ");
		ArrayList<Integer> arraylist1 = new ArrayList<Integer>(Arrays.asList(arr));
		ArrayList<Integer> arraylist2 = new ArrayList<Integer>();
		for (Integer num : arraylist1) {
			if (arraylist1.indexOf(num) != arraylist1.lastIndexOf(num) && !arraylist2.contains(num)) {
				arraylist2.add(num);
			}
		}
		return arraylist2;
	}

	public static void main(String[] args) {
		Assignment39 assignment39 = new Assignment39();
		String[] arr = { "Maulik", "Umesh", "Saroj", "Umesh" };
		assignment39.printAllDuplicateName(arr);
		System.out.println("");
		String[] arr1 = { "Maulik", "Saroj", "Umesh", "Umesh", "Saroj", "Umesh" };
		LinkedHashSet<String> linkedhashset1 = assignment39.uniqueNameFromArray(arr1);
		System.out.println(linkedhashset1);
		System.out.println("");
		LinkedHashSet<Character> linkedhashset2 = assignment39.UniqueCharacterInArray("technocredits");
		System.out.println(linkedhashset2);
		System.out.println("");
		Integer[] arr2 = { 10, 10, 13, 12, 12, 10, 55, 66, 55, 11 };
		LinkedHashSet<Integer> linkedhashset3 = assignment39.uniqueNumberThroughInsertionOrder(arr2);
		System.out.println(linkedhashset3);
		System.out.println("");
		TreeSet<Integer> treeset = assignment39.uniqueThroughNaturalOrder(arr2);
		System.out.println(treeset);
		System.out.println("");
		Integer[] arr3 = { 10, 10, 13, 12, 12, 10, 55, 66, 55, 11, 11 };
		LinkedHashSet<Integer> linkedhashset4 = assignment39.finduniqueNumberThroughSet(arr3);
		System.out.println(linkedhashset4);
		System.out.println("");
		Integer[] arr4 = { 10, 10, 13, 12, 12, 10, 55, 66, 55, 11, 11 };
		ArrayList<Integer> arraylist = assignment39.findUniqueNumberUsingList(arr4);
		System.out.println(arraylist);

	}
}

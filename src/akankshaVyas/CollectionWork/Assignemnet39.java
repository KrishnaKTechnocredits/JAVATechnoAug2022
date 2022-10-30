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

package akankshaVyas.CollectionWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Assignemnet39 {

	// Program 1
	HashSet<String> getDuplicateStringRemove1(String[] arr) {
		ArrayList<String> nameSet1 = new ArrayList<String>(Arrays.asList(arr));
		HashSet<String> nameSet = new HashSet<String>();
		HashSet<String> nameSet2 = new HashSet<String>();
		for (String name : nameSet1) {
			if (!nameSet.add(name))
				nameSet2.add(name);
		}
		return nameSet2;
	}

	// Method 1 for Program 2
	ArrayList<String> getDuplicateString2a(String[] arr) {
		ArrayList<String> nameSet1 = new ArrayList<String>(Arrays.asList(arr));
		ArrayList<String> nameSet = new ArrayList<String>(Arrays.asList(arr));
		nameSet1.retainAll(nameSet);
		return nameSet1;
	}

	// Method 2 for Program 2
	LinkedHashSet<String> getUniqueString2b(String[] arr) {
		LinkedHashSet<String> nameSet1 = new LinkedHashSet<String>(Arrays.asList(arr));
		return nameSet1;
	}

	// Program 3
	Set<Character> uniqueCharacter3(String name) {
		LinkedHashSet<Character> chs = new LinkedHashSet<Character>();
		for (int index = 0; index < name.length(); index++) {
			char ch = name.charAt(index);
			chs.add(ch);
		}
		return chs;
	}

	// Program 4
	Set<Integer> getRemoveDuplicateNum4(Integer[] arr) {
		LinkedHashSet<Integer> listOfNum = new LinkedHashSet<Integer>(Arrays.asList(arr));
		return listOfNum;
	}

	// Program 5
	TreeSet<Integer> getDuplicateNumNatural5(Integer[] arr) {
		TreeSet<Integer> numberSet = new TreeSet<Integer>(Arrays.asList(arr));
		return numberSet;
	}

	// program 6
	LinkedHashSet<Integer> getRemoveRepeatNum6(Integer[] arr) {
		LinkedHashSet<Integer> numberSet = new LinkedHashSet<Integer>();
		LinkedHashSet<Integer> numberSet1 = new LinkedHashSet<Integer>();
		for (Integer number : arr)
			if (!numberSet.add(number)) {
				numberSet1.add(number);
			}
		return numberSet1;
	}

	// Program 7
	LinkedList<Integer> getRemoveRepeatNum7(Integer[] arr) {
		List<Integer> numberSet = new LinkedList<Integer>(Arrays.asList(arr));
		LinkedList<Integer> numberSet1 = new LinkedList<Integer>();
		for (int number : numberSet)
			if (numberSet.indexOf(number) != numberSet.lastIndexOf(number) && !numberSet1.contains(number)) {
				numberSet1.add(number);
			}
		return numberSet1;
	}

	public static void main(String[] args) {
		Assignemnet39 ass39 = new Assignemnet39();
		String[] arr = { "Maulik", "Umesh", "Saroj", "Umesh" };
		System.out.println(ass39.getDuplicateStringRemove1(arr));
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
		System.out.println(ass39.getDuplicateString2a(arr));
		System.out.println(ass39.getUniqueString2b(arr));
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
		System.out.println(ass39.uniqueCharacter3("technocredits"));
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
		Integer[] arr4 = { 10, 10, 13, 12, 12, 10, 55, 66, 55, 11 };
		System.out.println(ass39.getRemoveDuplicateNum4(arr4));
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
		Integer[] arr1 = { 10, 10, 13, 12, 12, 10, 55, 66, 55, 11 };
		System.out.println(ass39.getDuplicateNumNatural5(arr1));
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
		Integer[] arr2 = { 10, 10, 13, 12, 12, 10, 55, 66, 55, 11, 11 };
		System.out.println(ass39.getRemoveRepeatNum6(arr2));
		System.out.println(ass39.getRemoveRepeatNum7(arr2));
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++");

	}
}
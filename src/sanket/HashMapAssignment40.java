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
         11 -> 1
*/

package sanket;

import java.util.*;

public class HashMapAssignment40 {

	// Program 1 : Find frequency of each number using array and single while loop.
	void getFrequncyOfNumber(Integer[] arr) {
		ArrayList<Integer> listOfNumber = new ArrayList<Integer>(Arrays.asList(arr));
		System.out.println(
				"Program 1 : Find frequency of each number using array and single while loop: " + listOfNumber);
		System.out.println("The frequency of each number using array and single while loop is : ");
		ArrayList<Integer> removeList = new ArrayList<Integer>();
		int beforeSize = 0, afterSize = 0, number = 0;
		while (listOfNumber.size() > 0) {
			number = listOfNumber.get(0);
			beforeSize = listOfNumber.size();
			removeList.add(number);
			listOfNumber.removeAll(removeList);
			afterSize = listOfNumber.size();
			System.out.println(number + "-->" + (beforeSize - afterSize));
			removeList.clear();
		}
	}

	// Program 2 : Find missing numbers from give array from 50 to 60.
	List<Integer> findMissingNumber(Integer[] arr) {
		ArrayList<Integer> listOfNumber = new ArrayList<Integer>(Arrays.asList(arr));
		ArrayList<Integer> listOfMissingNumber = new ArrayList<Integer>();
		for (int number = 50; number <= 60; number++) {
			if (!listOfNumber.contains(number))
				listOfMissingNumber.add(number);
		}
		return listOfMissingNumber;
	}

	// Program 3 : Return a reverse String [Method : inplace reverse].
	String reverseString(String str) {
		for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
			char ch1 = str.charAt(i);
			char ch2 = str.charAt(j);
			if (i == 0)
				str = ch2 + str.substring(i + 1, j) + ch1;
			else
				str = str.substring(0, i) + ch2 + str.substring(i + 1, j) + ch1 + str.substring(j + 1);
		}
		return str;
	}

	// Program 4 : Return a reverse String [Use : StringBuilder].
	StringBuilder reverseStringBuilder(String str) {
		StringBuilder normalString = new StringBuilder(str);
		StringBuilder reverseString = normalString.reverse();
		return reverseString;
	}

	// Program 5 : WAP to find frequency of each character using Map.
	void getCharacterFrequency(String name) {
		HashMap<Character, Integer> characterFrequency = new HashMap<Character, Integer>();
		for (int index = 0; index < name.length(); index++) {
			char ch = name.charAt(index);
			if (characterFrequency.containsKey(ch)) {
				int count = characterFrequency.get(ch);
				characterFrequency.put(ch, count + 1);
			} else {
				characterFrequency.put(ch, 1);
			}
		}
		Set<Character> keys = characterFrequency.keySet();
		for (Character currentKey : keys) {
			System.out.println(currentKey + "-->" + characterFrequency.get(currentKey));
		}
	}
	
	// Program 6 : WAP to find frequency of each word in a given String using Map.
	void getWordFrequency(String str) {
		String[] strArray = str.split(" ");
		LinkedHashMap<String, Integer> StringFrequency = new LinkedHashMap<String, Integer>();

		for (int index = 0; index < strArray.length; index++) {
			if (StringFrequency.containsKey(strArray[index])) {
				int count = StringFrequency.get(strArray[index]);
				StringFrequency.put(strArray[index], count + 1);
			} else {
				StringFrequency.put(strArray[index], 1);
			}
		}
		Set<String> keys = StringFrequency.keySet();
		for (String currentKey : keys) {
			System.out.println(currentKey + "-->" + StringFrequency.get(currentKey));
		}
	}
	
	// Program 7 : WAP to find frequency of each word in a given String using Map.
	void getNumberFrequency(Integer[] arr) {

		TreeMap<Integer, Integer> IntegerFrequency = new TreeMap<Integer, Integer>();

		for (int index = 0; index < arr.length; index++) {
			if (IntegerFrequency.containsKey(arr[index])) {
				int count = IntegerFrequency.get(arr[index]);
				IntegerFrequency.put(arr[index], count + 1);
			} else {
				IntegerFrequency.put(arr[index], 1);
			}
		}
		Set<Integer> keys = IntegerFrequency.keySet();
		for (Integer currentKey : keys) {
			System.out.println(currentKey + "-->" + IntegerFrequency.get(currentKey));
		}
	}

	public static void main(String[] args) {
		Integer[] arr = { 3, 5, 33, 3, 55, 3, 11, 11 };
		new HashMapAssignment40().getFrequncyOfNumber(arr);

		System.out.println("\n");

		Integer[] arr2 = { 60, 54, 51, 57 };
		System.out.println("Program 2 : Find missing numbers from give array from 50 to 60.");
		System.out.println("The input string is --> " + Arrays.toString(arr2));
		System.out.println("The missing number array is " + new HashMapAssignment40().findMissingNumber(arr2));

		System.out.println("\n");

		String str = "technocredits";
		System.out.println("Program 3 : Return a reverse String [Method : inplace reverse].");
		System.out.println("The input string is --> " + str);
		System.out.println("The reverse string is --> " + new HashMapAssignment40().reverseString(str));

		System.out.println("\n");

		System.out.println("Program 4 : Return a reverse String [Use : StringBuilder].");
		System.out.println("The input string is --> " + str);
		System.out.println("The reverse string is --> " + new HashMapAssignment40().reverseStringBuilder(str));

		System.out.println("\n");

		System.out.println("Program 5 : WAP to find frequency of each character using Map.");
		System.out.println("The input string is --> " + str);
		System.out.println("The frequency of each character in string is --> ");
		new HashMapAssignment40().getCharacterFrequency(str);
		
		System.out.println("\n");
		
		String str2 = "Hi Hello Techno Techno Hi";
		System.out.println("Program 6 : WAP to find frequence of each word in a given String using Map.");
		System.out.println("The input string is --> " + str2);
		System.out.println("The frequency of each word in string is --> ");
		new HashMapAssignment40().getWordFrequency(str2);
		
		System.out.println("\n");
		
		Integer[] arr3 = { 10, 2, 5, 2, 3, 3, 3, 10, 11, 8, 8, 8 };
		System.out.println("Program 7 : WAP to find frequence of each word in a given String using Map.");
		System.out.println("The input string is --> " + Arrays.toString(arr3));
		System.out.println("The frequency of each number in array is --> ");
		new HashMapAssignment40().getNumberFrequency(arr3);
	}
}

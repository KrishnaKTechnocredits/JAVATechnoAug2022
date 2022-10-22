/*
 * Assignment 40 : 16th Oct'2022

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

Program 5 : WAP to find frequency of each character using Map.
input : technocredits
output : {r=1, c=2, s=1, t=2, d=1, e=2, h=1, i=1, n=1, o=1}
          r --> 1
		  c --> 2
          s --> 1
          t --> 2
          ..... so on		  

Program 6 : WAP to find frequency of each word in a given String using Map.
input : "Hi Hello Techno Techno Hi"
output : Hi -> 2
         Hello -> 1
		 Techno -> 2

Program 7 : WAP to find frequency of each word in a given String using Map.
input : {10,2,5,2,3,3,3,10,11,8,8,8};
output : 2 -> 2
         3 -> 3
         5 -> 1
         8 -> 3
         10 -> 2
         11 -> 1
 */
package akankshaVyas.CollectionWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Assignment40 {

	// Program 1
	void freqEachNum1(Integer[] arr) {
		List<Integer> numList = new ArrayList<Integer>(Arrays.asList(arr));
		List<Integer> tempList = new ArrayList<Integer>();
		int beforLength, temp, afterLength, size;
		while (numList.size() > 0) {
			beforLength = numList.size();
			temp = numList.get(0);
			tempList.add(temp);
			numList.removeAll(tempList);
			afterLength = numList.size();
			size = beforLength - afterLength;
			System.out.println(temp + "->" + size);
		}
	}

	// Program 2
	ArrayList<Integer> getMissingNum2(Integer[] arr1, Integer[] arr2) {
		ArrayList<Integer> numList1 = new ArrayList<Integer>(Arrays.asList(arr1));
		// Integer[] arr2= {50,51,52,53,54,55,56,57,58,59,60};
		ArrayList<Integer> numList2 = new ArrayList<Integer>(Arrays.asList(arr2));
		numList1.removeAll(numList2);
		return numList1;
	}

	// Program 3
	void ReverseString3(String str) {
		// String str2="";
		for (int index = 0, backIndex = str.length() - 1; index < backIndex; index++, backIndex--) {
			char ch2 = str.charAt(index);
			char ch1 = str.charAt(backIndex);

			if (index == 0) {
				str = ch1 + str.substring(index + 1, backIndex) + ch2;
			} else {
				str = str.substring(0, index) + ch1 + str.substring(index + 1, backIndex) + ch2
						+ str.substring(backIndex + 1);
			}
		}
		System.out.println(str);
	}

	// program 4
	String getReverString4a(String str) {
		StringBuilder name = new StringBuilder(str);
		name.reverse(); // output is reverse but in builder form
		System.out.println(name);
		return name.toString(); // it will override tostring method to get output as string
	}

	// Program 4
	String getReverStringBuffer4b(String str) {
		StringBuffer name = new StringBuffer(str);
		return name.reverse().toString(); // combined both lines of builder and written one line
	}

	// Program 5

	void displayFrequencyOfEachChar5(String str) {
		Map<Character, Integer> cm = new HashMap<Character, Integer>();
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (cm.containsKey(ch)) {
				cm.put(ch, cm.get(ch) + 1);
			} else {
				cm.put(ch, 1);
			}
		}
		System.out.println(cm); // output as map

		Set<Character> cs = cm.keySet();
		for (char keych : cs)
			System.out.println(keych + "-->" + cm.get(keych)); // output with iteration

	}

	// Program 6

	void frequencyOfEachString6(String str) {
		String[] arr = str.split(" ");
		Map<String, Integer> nameMap = new LinkedHashMap<String, Integer>();
		for (int index = 0; index < arr.length; index++) {
			String name = arr[index];
			if (nameMap.containsKey(name)) {
				nameMap.put(name, nameMap.get(name) + 1);
			} else {
				nameMap.put(name, 1);
			}
		}
		System.out.println(nameMap);

		Set<String> keys = nameMap.keySet();
		for (String name : keys)
			System.out.println(name + "-->" + nameMap.get(name));
	}

	// Program 7
	void frequencyofEachNum7(Integer[] numarr) {
		Map<Integer, Integer> numMap = new HashMap<Integer, Integer>();
		for (int index = 0; index < numarr.length; index++) {
			int numkey = numarr[index];
			if (numMap.containsKey(numkey)) {
				numMap.put(numkey, numMap.get(numkey) + 1);
			} else {
				numMap.put(numkey, 1);
			}
		}
		System.out.println(numMap);
		Set<Integer> keys = numMap.keySet();
		for (int num : keys)
			System.out.println(num + "-->" + numMap.get(num));
		// Set<Integer> keys1 = numMap.keySet();
		// Iterator<Integer> itr = keys.iterator();
		// while(itr.hasNext()) {
		// System.out.println(itr.next() +"-->" + numMap.get(keys));
	}

	public static void main(String[] args) {
		Assignment40 a = new Assignment40();

		Integer[] arr = { 3, 5, 33, 3, 55, 3, 11, 11 };
		a.freqEachNum1(arr);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		Integer[] arr1 = { 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60 };
		Integer[] arr2 = { 60, 54, 51, 57 };
		System.out.println(a.getMissingNum2(arr1, arr2));
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		a.ReverseString3("technocredits");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println(a.getReverString4a("technocredits"));
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println(a.getReverStringBuffer4b("technocredits"));
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		a.displayFrequencyOfEachChar5("technocredits");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		String str = "Hi Hello Techno Techno Hi";
		a.frequencyOfEachString6(str);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		Integer[] numarr = { 10, 2, 5, 2, 3, 3, 3, 10, 11, 8, 8, 8 };
		a.frequencyofEachNum7(numarr);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	}
}

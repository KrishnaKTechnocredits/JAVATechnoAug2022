/* Assignment 40 : 16th Oct'2022

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

package swatiM.assignment.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Assignment_40 {

	// Program 1 : Find frequency of each number using array and single while loop.

	void getFrequencyOfNumber(ArrayList<Integer> inputList) {
		System.out.println("Input array list -> " + inputList);
		ArrayList<Integer> outputList = new ArrayList<Integer>();
		int num = 0;
		int inputsize = 0;
		int outputsize = 0;
		while (inputList.size() > 0) {
			num = inputList.get(0);
			inputsize = inputList.size();
			outputList.add(num);
			inputList.removeAll(outputList);
			outputsize = inputList.size();
			System.out.println("Frequency of " + num + " is --> " + (inputsize - outputsize));
			outputList.clear();

		}

	}

	// Program 2 : Find missing numbers from give array from 50 to 60.
	void getMissingNumMethod1(ArrayList<Integer> listOfNum) {
		ArrayList<Integer> outputList = new ArrayList<Integer>();
		for (int index = 50; index <= 60; index++) {
			if (!listOfNum.contains(index)) {
				outputList.add(index);
			}
		}
		System.out.println("Output using if condition -- " + outputList);

	}

	void getMissingNumMethod2(ArrayList<Integer> input) {
		ArrayList<Integer> outputList = new ArrayList<Integer>();
		for (int index = 50; index <= 60; index++) {
			if (!outputList.contains(index)) {
				outputList.add(index);
				outputList.removeAll(input);
			}
		}
		System.out.println("Output using removeall -- " + outputList);

	}

	// Program 3 : Return a reverse String [Method : inplace reverse].

	void getReverseString(String str) {
		for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
			char ch1 = str.charAt(i);
			char ch2 = str.charAt(j);
			if (i == 0)
				str = ch2 + str.substring(i + 1, j) + ch1;
			else
				str = str.substring(0, i) + ch2 + str.substring(i + 1, j) + ch1 + str.substring(j + 1);
		}
		System.out.println("Reversed String -> " + str);
	}
	/* Program 4 : Return a reverse String [Use : StringBuilder]. */

	void getReverseNameUsingStringBuilder(String input) {
		StringBuilder output = new StringBuilder(input);
		StringBuilder reverseString = output.reverse();
		System.out.println("Rverse string using String Builder  ->  " + reverseString);
	}

	// Program 5 : WAP to find frequence of each character using Map.

	void getFreqOfCharUsingMap(ArrayList<Character> listOfChar) {
		Map<Character, Integer> listOfFrequency = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < listOfChar.size(); i++) {
			char ch = listOfChar.get(i);
			if (listOfFrequency.containsKey(ch)) {
				int count = listOfFrequency.get(ch);
				listOfFrequency.put(ch, count + 1);
			} else {
				listOfFrequency.put(ch, 1);
			}
		}
		System.out.println(listOfFrequency);
		Set<Character> keys = listOfFrequency.keySet();
		for (Character currentKey : keys) {
			System.out.println(currentKey + "-->" + listOfFrequency.get(currentKey));
		}

	}
	// Program 6 : WAP to find frequence of each word in a given String using Map.
	
	void getFreqOfWord(String[] input) {
		LinkedHashMap<String,Integer> listOfFreq = new LinkedHashMap<String, Integer>();
		for(String word : input) {
			if(listOfFreq.containsKey(word)) {
				int count = listOfFreq.get(word);
				listOfFreq.put(word,count + 1);
			}else {
				listOfFreq.put(word, 1);
			}
		}System.out.println(listOfFreq);
		Set<String> key = listOfFreq.keySet();
		for(String name : key) {
			System.out.println(name + " --> " + listOfFreq.get(name));
		}
	}
	
	//Program 7 : WAP to find frequence of each word in a given String using Map.
	
	void getFreqOfNum(Integer[] input ){
		LinkedHashMap<Integer, Integer> listOfFreq = new LinkedHashMap<Integer, Integer>();
		for(Integer num : input) {
			if(listOfFreq.containsKey(num)) {
				int count = listOfFreq.get(num);
				listOfFreq.put(num,count+1);
			}else {
				listOfFreq.put(num, 1);
			}
		}System.out.println(listOfFreq);
		Set<Integer> key = listOfFreq.keySet();
		for(int num : key) {
			System.out.println(num + " -->" + listOfFreq.get(num));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Assignment_40 assignment_40 = new Assignment_40();
		Integer[] input = { 3, 5, 33, 3, 55, 3, 11, 11 };
		ArrayList<Integer> givenNumList = new ArrayList<Integer>();
		for (int num : input) {
			givenNumList.add(num);
		}
		assignment_40.getFrequencyOfNumber(givenNumList);

		System.out.println("---------------------------------------------");

		Integer[] input1 = { 60, 54, 51, 57 };

		System.out.println("Input array list -> " + Arrays.toString(input1));
		ArrayList<Integer> listOfNum = new ArrayList<Integer>();
		for (Integer num : input1) {
			listOfNum.add(num);
		}
		assignment_40.getMissingNumMethod1(listOfNum);
		assignment_40.getMissingNumMethod2(listOfNum);

		System.out.println("---------------------------------------------");

		String input3 = "Yuvaan";
		System.out.println("Given String -> " + input3);
		assignment_40.getReverseString(input3);

		System.out.println("---------------------------------------------");

		String input4 = "MOHITE";
		System.out.println("Given String -> " + input4);
		assignment_40.getReverseString(input4);
		assignment_40.getReverseNameUsingStringBuilder(input4);

		System.out.println("---------------------------------------------");

		String input5 = "technocredits";
		char[] ch = input5.toCharArray();
		ArrayList<Character> listOfChar = new ArrayList<>();
		for (Character ch1 : ch) {
			listOfChar.add(ch1);
		}
		assignment_40.getFreqOfCharUsingMap(listOfChar);
		

		System.out.println("---------------------------------------------");

		
		String input6 = "Hi Hello Techno Techno Hi" ;
		String[] inputSplit = input6.split(" ");
		assignment_40.getFreqOfWord(inputSplit);
		
		System.out.println("---------------------------------------------");

		Integer[]  input7 = {10,2,5,2,3,3,3,10,11,8,8,8};
		assignment_40.getFreqOfNum(input7);

	}
}

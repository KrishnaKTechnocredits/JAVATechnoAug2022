package komalShrivastava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class ArrayListMapPrograms {

	//Program 1 : Find frequency of each number using array and single while loop.
	
	void getFreqOfNumber(int[] input){
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(3,5,33,3,55,3,11,11));
		System.out.println("Input : " + numbers);
		ArrayList<Integer> removeList = new ArrayList<Integer>();
		int num = 0, originalLength = 0, updatedLength = 0;
			while(numbers.size()>0) {
				num = numbers.get(0);
				originalLength = numbers.size();
				removeList.add(num);
				numbers.removeAll(removeList);
				updatedLength = numbers.size();
				System.out.println(num + "-->" + (originalLength-updatedLength));
				removeList.clear();
		}
	}
	
	//Program 2 : Find missing numbers from give array from 50 to 60
	
	ArrayList<Integer> getMissingNumber(int[] input) {
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(60,54,51,57));
		System.out.println("Input : " + numbers);
		ArrayList<Integer> missingNumber = new ArrayList<Integer>();
		for(int index=50; index<=60; index++) {
			if(!numbers.contains(index)) 
				missingNumber.add(index);
		}
		return missingNumber;
	}
	
	//Program 3 : Return a reverse String [Method : inplace reverse]
	
	String getReverse(String str) {
		System.out.println("Input : " + str);
		for(int index=0, j=str.length()-1; index<j; index++,j--) {
			char ch1 = str.charAt(index);
			char ch2 = str.charAt(j);
			if(index==0)
				str = ch2 + str.substring(index+1, j) + ch1;
			else
				str = str.substring(0,index) + ch2 + str.substring(index+1, j) + ch1 + str.substring(j+1);
		}
		return str;
	}
	
	//Program 4 : Return a reverse String [Use : StringBuilder].
	
	String revStringBuilder(String str) {
		StringBuilder sb = new StringBuilder(str);
		return sb.reverse().toString();
	}
	
	//Program 5 : WAP to find frequency of each character using Map
	
	HashMap<Character, Integer> getFreqOfCharacter(String inputStr){
		HashMap<Character, Integer> freq = new HashMap<Character, Integer>();
		System.out.println("Input : " + inputStr);
		char[] charArr =inputStr.toCharArray();
		for(char key : charArr) {
			if(freq.containsKey(key))
				freq.put(key, freq.get(key)+1);
			else
				freq.put(key, 1);
		}
		return freq;
	}
	
	//Program 6 : WAP to find frequency of each word in a given String using Map
	
	LinkedHashMap<String, Integer> getfreqOfWords(String inputStr){
		LinkedHashMap<String, Integer> freq = new LinkedHashMap<String, Integer>();
		String[] inputArr = inputStr.split(" ");
		for(String word : inputArr) {
			if(freq.containsKey(word))
				freq.put(word, freq.get(word)+1);
			else
				freq.put(word, 1);
		}
		return freq;
	}
	
	//Program 7 : WAP to find frequency of each word in a given String using Map
	
	TreeMap<Integer, Integer> getFreqOfNumberMap(int[] inputArr){
	TreeMap<Integer, Integer> freqOfNum = new TreeMap<Integer, Integer>();
		for(int num : inputArr) {
			if(freqOfNum.containsKey(num))
				freqOfNum.put(num, freqOfNum.get(num)+1);
			else	
				freqOfNum.put(num, 1);
		}
		return freqOfNum;
	}
	
	public static void main(String[] args) {
		ArrayListMapPrograms amp = new ArrayListMapPrograms();
		
		System.out.println("Program 1 : Find frequency of each number using array and single while loop");
		int[] input1 = {3,5,33,3,55,3,11,11};
		amp.getFreqOfNumber(input1);
		
		System.out.println("\nProgram 2 : Find missing numbers from give array from 50 to 60");
		int[] input2 = {60,54,51,57};
		ArrayList<Integer> missingNumbers = amp.getMissingNumber(input2);
		System.out.println("Missing Numbers : " + missingNumbers);
		
		System.out.println("\nProgram 3 : Return a reverse String [Method : inplace reverse]");
		String input3 = "technocredits";
		String rev = amp.getReverse(input3);
		System.out.println("Reverse : " + rev);
		
		System.out.println("Program 4 : Return a reverse String [Use : StringBuilder]");
		String input4 = "technocredits";
		String revString = amp.revStringBuilder(input4);
		System.out.println("Reverse : " + revString);
		
		System.out.println("\nProgram 5 : WAP to find frequency of each character using Map");
		String input5 = "technocredits";
		HashMap<Character, Integer> frequencyOfCharacter= amp.getFreqOfCharacter(input5);
		Set<Character> keyOfChar = frequencyOfCharacter.keySet();
		for(char key : keyOfChar) {
			System.out.println(key + "-->" + frequencyOfCharacter.get(key));
		}
		
		System.out.println("\nProgram 6 : WAP to find frequence of each word in a given String using Map");
		String input6 = "Hi Hello Techno Techno Hi";
		Map<String, Integer> frequencyOfWords = amp.getfreqOfWords(input6);
		Set<String> keyOfWords = frequencyOfWords.keySet();
		for(String word : keyOfWords ) {
			System.out.println(word + "-->" + frequencyOfWords.get(word));
		}
		
		System.out.println("\nProgram 7 : WAP to find frequence of each word in a given String using Map");
		int[] input7 = {10,2,5,2,3,3,3,10,11,8,8,8};
		Map<Integer, Integer> freqOfNum = amp.getFreqOfNumberMap(input7);
		Set<Integer> keyOfNum = freqOfNum.keySet();
		for(int num : keyOfNum) {
			System.out.println(num + "-->" + freqOfNum.get(num));
		}
	}
}
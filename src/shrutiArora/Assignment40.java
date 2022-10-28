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
         11 -> 1  */
package shrutiArora;
import java.util.*;
public class Assignment40 {
	void getFreqOfNum(Integer[] input) {
		List<Integer> listOfNumbers = new ArrayList<Integer>(Arrays.asList(input));
		List<Integer> output = new ArrayList<Integer>();
		int num = 0, originalSize = 0, actualSize = 0;
		while (listOfNumbers.size() > 0) {
			num = listOfNumbers.get(0);
			originalSize = listOfNumbers.size();
			output.add(num);
			listOfNumbers.removeAll(output);

			actualSize = listOfNumbers.size();
			System.out.println(num + "-->" + (originalSize - actualSize));
		}
	}
	void getMissingNumbers(Integer[] input) {
		List<Integer> listOfNumbers = new ArrayList<Integer>(Arrays.asList(input));
		List<Integer> output = new ArrayList<Integer>();

		for (int num = 50; num <= 60; num++) {
			output.add(num);
		}
		output.removeAll(listOfNumbers);
		System.out.println("Output --> " + output);
	}
	String getReverseString(String input) {
		for(int i=0,j=input.length()-1;i<j;i++,j--) {
			char ch1 = input.charAt(i);
			char ch2 = input.charAt(j);
			if(i==0) {
				input = ch2 + input.substring(i+1,j) + ch1;
			}else {
				input = input.substring(0,i)+ch2+input.substring(i+1,j)+ch1+input.substring(j+1);
			}
		}
		return input;
	}
	StringBuilder getReverseStringUsingStrBuilder(String input) {
		StringBuilder stringBuilder = new StringBuilder(input);
		stringBuilder.reverse();
		return stringBuilder;
	}
	void getFrequencyUsingMap(String input) {
		Map<Character, Integer> freq = new HashMap<Character, Integer>();
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (freq.containsKey(ch)) {
				freq.put(ch, freq.get(ch) + 1);
			} else {
				freq.put(ch, 1);
			}
		}
		Set<Character> key = freq.keySet();
		for (Character currentKey : key) {
			System.out.println(currentKey + " --> " + freq.get(currentKey));
		}
	}
	void getFrequencyOfEachWordUsingMap(String input1) {
		String[] arr = input1.split(" ");
		Map<String, Integer> freq = new LinkedHashMap<String, Integer>();
		for (String input : arr) {
			if (freq.containsKey(input)) {
				freq.put(input, freq.get(input) + 1);
			} else {
				freq.put(input, 1);
			}
		}
		Set<String> key = freq.keySet();
		for (String currentKey : key) {
			System.out.println(currentKey + " --> " + freq.get(currentKey));
		}
	}
	void getFrequencyOfNumUsingMap(Integer[] input) {
		Map<Integer, Integer> freq = new TreeMap<Integer, Integer>();
		for (Integer num : input) {
			if (freq.containsKey(num)) {
				freq.put(num, freq.get(num) + 1);
			} else {
				freq.put(num, 1);
			}
		}
		Set<Integer> key = freq.keySet();
		for (Integer currentKey : key) {
			System.out.println(currentKey + " --> " + freq.get(currentKey));
		}
	}
  public static void main(String[] args) {
    Assignment40 a40 = new Assignment40();
	Integer[] input = { 3, 5, 33, 3, 55, 3, 11, 11 };
	System.out.println(" Program-1:Frequency of each number using array and single while loop");
	System.out.println("Input --> " + Arrays.toString(input));
	a40.getFreqOfNum(input);
	Integer[] input1 = { 60, 54, 51, 57 };
	System.out.println(" Program-2:Missing numbers from given array between 50 to 60");
	System.out.println("Input -->" + Arrays.toString(input1));
	a40.getMissingNumbers(input1);
	String input2 = "technocredits";
	System.out.println(" Program-3:Reverse String using Inplace Replacement");
	System.out.println("Input: "+ input2);
	System.out.println("Output: "+ a40.getReverseString(input2));
	String input3 = "technocredits";
	System.out.println(" Program-4:Reverse String using String Builder");
	System.out.println("Input: " + input3);
	System.out.println("Output: " + a40.getReverseStringUsingStrBuilder(input3));
	String input4 = "technocredits";
	System.out.println(" Program-5:Frequency of each character using Map");
	System.out.println("Input: " + input4);
	a40.getFrequencyUsingMap(input4);
	String input5 = "Hi Hello Techno Techno Hi";
	System.out.println(" Program-6:Frequency of each word using Map");
	System.out.println("Input: " + input5);
	a40.getFrequencyOfEachWordUsingMap(input5);
	Integer[] input6 = { 10, 2, 5, 2, 3, 3, 3, 10, 11, 8, 8, 8 };
	System.out.println(" Program-7:Frequency of each number using Map");
	System.out.println("Input: " + Arrays.toString(input6));
	a40.getFrequencyOfNumUsingMap(input6);
  }
}
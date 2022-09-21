/*

Assignment - 23 : 16th Sep'2022

Program 1: --35min
Write a method to return maximum length word from given input.
String input = "Good morning friends this is technocredits";
output : technocredits

String getMaxLengthWord(String input){
	
}
String[] arr = input.split(" "); --15mins

Program 2: Write a method to print all the words having atleast one digit.

String input = "Good mor9ning fr3iends t2hi2s is technocredits";
output : mor9ning
         fr3iends
         t2hi2s	

Program 3: Write a method to return word having maximum uppercase.

String input = "Good Mor9niNg FR3ienDs t2hi2s Is tEchnocredits";
output : FR3ienDs			 

Program 4: Write a method to print all the words having no digits and uppercase.
String input = "Good mor9ning techno fr3iends t2Hi2s is tEchnocredits";
output : techno
         is
		 
*/

package pranjaliV.assignment23;

import java.util.Arrays;

public class StringArrayAssignment23 {

	String getMaxLengthWord(String input) {
		String[] split = input.split(" ");
		String maxlengthWord = "" ;
		int maxLength = 0;
		for(int index=0; index<split.length; index++) {
			int length = split[index].length();
			if (maxLength < length ) {
				maxLength = length;
				maxlengthWord = split[index];
			}
		}
		return  maxlengthWord;
	}
	
	void printDigitWord(String word) {
		for(int index=0; index<word.length();index++) {
			char ch = word.charAt(index);
			if(Character.isDigit(ch)) {
				System.out.println(word);
				break;
			}
		}
	}
	
	void WordWithDigit(String input) {
		String[] input1 = input.split(" ");
		System.out.println("Words having atleast one digit are: ");
		for(int index=0; index<input1.length; index++) {
			printDigitWord(input1[index]);
		}
	}
	
	int getCountUpperCase(String word) {
		int countUpper=0;
		for(int index=0; index<word.length(); index++) {
			char ch = word.charAt(index);
			if(Character.isUpperCase(ch)) {
				countUpper++;
			}
		}
		return countUpper;
	}
	
	String getWordMaxUpperCase(String input) {
		int maxCountUpper=0;
		int countUpper = 0;
		String word = "";
		String[] input1 = input.split(" ");
		for(int index=0; index<input1.length;index++) {
			countUpper = getCountUpperCase(input1[index]);
			if(maxCountUpper<countUpper) {
				maxCountUpper = countUpper;
				word = input1[index];	
			}
		}
		return word;
	}
	
	boolean isDigit(String word) {
		boolean flag = false;
		for(int index=0; index<word.length();index++) {
			char ch = word.charAt(index);
			if(Character.isDigit(ch)){
				flag=true;
				break;
			}
		}
		if(flag) {
			return flag;
		}
		else {
		return flag;
		}
	}
	
	boolean isUpperCase(String word) {
		boolean flag = false;
		for(int index=0; index<word.length();index++) {
			char ch = word.charAt(index);
			if(Character.isUpperCase(ch)){
				flag=true;
				break;
			}
		}
		if(flag) {
			return flag;
		}
		else {
		return flag;
		}
	}
	
	void printWordNoDigitNoUppercase(String word) {
		boolean isDigit = isDigit(word);
		boolean isUpperCase = isUpperCase(word);
		if (isDigit==false && isUpperCase==false) {   
				System.out.println(word);
		}
	}
	
	void getWordNoDigitNoUppercase(String input) {
		System.out.println("Words having no digits and uppercase are: ");
		String[] input1 = input.split(" ");
		for(int index=0; index<input1.length;index++) {
			printWordNoDigitNoUppercase(input1[index]);
		}
	}
	
	public static void main(String[] args) {
		StringArrayAssignment23 assignment23 = new StringArrayAssignment23();
		String input1 = "Good morning friends this is technocredits";
		System.out.println("Input: "+ input1);
		System.out.println("Max length word in the given string is: "+ assignment23.getMaxLengthWord(input1));
		System.out.println("");
		
		String input2 = "Good mor9ning fr3iends t2hi2s is technocredits";
		System.out.println("Input2 : " + input2);
		assignment23.WordWithDigit(input2);
		System.out.println("");

		String input3 = "Good Mor9niNg FR3ienDs t2hi2s Is tEchnocredits";
		System.out.println("Input3 : " + input3);
		System.out.println("Max Uppercase word in the given string is: "+ assignment23.getWordMaxUpperCase(input3));
		System.out.println("");
		
		String input4 = "Good mor9ning techno fr3iends t2Hi2s is tEchnocredits";
		System.out.println("Input4 : " + input4);
		assignment23.getWordNoDigitNoUppercase(input4);
	}
}

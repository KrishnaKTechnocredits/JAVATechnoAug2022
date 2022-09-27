/*
 * Assignment - 23 : 16th Sep'2022

Program 1:
Write a method to return maximum length word from given input.
String input = "Good morning friends this is technocredits";
output : technocredits

String getMaxLengthWord(String input){
	
}

String[] arr = input.split(" ");

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

package rahulSaswadkar.arrayPrograms;

//import java.util.Arrays;

public class ArrayProgram7 {
	public static void main(String[] args) {
		ArrayProgram7 arrayProgram7 = new ArrayProgram7();
		
		String str1 = "Good morning friends this is technocredits";
		String str2 = "Good mor9ning fr3iends t2hi2s is technocredits";
		String str3 = "Good Mor9niNg FR3ienDs t2hi2s Is tEchnocredits";
		String str4 = "good morning friends this is technocredits";
		String str5 = "Good mor9ning techno fr3iends t2Hi2s is tEchnocredits";
		
		System.out.println("Maximum length word in given String \"" + str1 + "\" is : " + arrayProgram7.getMaxLenWord(str1));
		arrayProgram7.getStringWithDigits(str2);
		System.out.println("\nWord having maximum uppercase letters in given String \"" + str3 
				+ "\" is : " + arrayProgram7.getWordWithMaxUpperCaseLetters(str3));
		System.out.println("Word having maximum uppercase letters in given String \"" + str4
				+ "\" is : " + arrayProgram7.getWordWithMaxUpperCaseLetters(str4));
		arrayProgram7.getWordWithNoDigitsAndNoUpperCaseLetters(str5);
		}
	
	String[] getStringToArray(String inputStr) {
		String[] outputArray = inputStr.split(" ");
		return outputArray;
		
	}
	
	String getMaxLenWord(String str) {
		String[] arr = getStringToArray(str);
		int maxWordLen = arr[0].length();
		String maxWord = arr[0];
		
		for(int index = 1; index < arr.length ; index++) {
			if(arr[index].length() > maxWordLen) {
				maxWordLen = arr[index].length();
				maxWord = arr[index];
			}
		}
		return maxWord;
	}
	
	void getStringWithDigits(String str) {
		System.out.println("\nAll the words in given String \"" + str + "\" having atleast one digit are as below :");
		String[] arr = getStringToArray(str);
		boolean flag = false;
		for(int index = 0; index < arr.length ; index++) {
			flag = isStringContainDigit(arr[index]);
			if(flag) {
				System.out.println(arr[index]);
			}
		}
		
	}
	
	private boolean isStringContainDigit(String str) {
		for(int index = 0;index < str.length(); index++) {
			if(Character.isDigit(str.charAt(index))) {
				return true;
			}
		}
		return false;

	}
	
	String getWordWithMaxUpperCaseLetters(String str) {
		String[] arr = getStringToArray(str);
		//int countOfMaxUpperCaseLetters = getCountOfUpperCaseLetters(arr[0]);
		int countOfUpperCaseLetters = 0;
		//String strMaxUpperCaseLetters = arr[0];
		String strMaxUpperCaseLetters = "\'No word in given String has Upper case letter\'";
		int maxCount = 0;
		
		 for(int index = 0; index < arr.length ; index++) {
			 countOfUpperCaseLetters = getCountOfUpperCaseLetters(arr[index]);
			 if(countOfUpperCaseLetters > maxCount) {
				 maxCount = countOfUpperCaseLetters;
				 strMaxUpperCaseLetters = arr[index];
			 }
		 }
		 return strMaxUpperCaseLetters;
	}
	
	private int getCountOfUpperCaseLetters(String str) {
		int count = 0;
		for(int index = 0 ; index < str.length() ; index++) {
			if(Character.isUpperCase(str.charAt(index))) {
				count += 1;
			}
		}
		return count;
		
		
	}
	
	void getWordWithNoDigitsAndNoUpperCaseLetters(String str) {
		System.out.println("\nAll the words in given String \"" + str + "\" having no digit and no upper case letter are as below :");
		String[] arr = getStringToArray(str);
		for(int index = 0; index < arr.length ; index++) {
			if(isStringContainDigit(arr[index]) == false && getCountOfUpperCaseLetters(arr[index]) == 0) {
				System.out.println(arr[index]);	
			}
		}
		
	}
	
	
}

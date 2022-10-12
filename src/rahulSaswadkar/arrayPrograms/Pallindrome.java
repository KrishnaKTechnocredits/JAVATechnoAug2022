/*
 * Assignment - 31 : 29th Sep'2022

Program 1 :
Write a method to find whether given String is pallindrome.

input : radar
output : radar is pallindrom

input : aabcbaa
output : aabcbaa is pallindrom

input : abcabc
output : abcabc is not a pallindrom


Program 2 :
Write a method to print all pallindrome input from given array.

input : {"radar","techhpet","madam","maulikkilum"};
output : radar
         madam

 */

package rahulSaswadkar.arrayPrograms;

import java.util.Arrays;

public class Pallindrome {
	public static void main(String[] args) {
		Pallindrome pallindrome = new Pallindrome();
		
		String str1 = "radar";
		String str2 = "aabcbaa";
		String str3 = "abcabc";
		String[] str4 = {"radar","techhpet","madam","maulikkilum"};
		
		//pallindrome.printData(str1);
		//pallindrome.printData(str2);
		//pallindrome.printData(str3);
		pallindrome.printPallindromeStr(str1);
		pallindrome.printPallindromeStr(str2);
		pallindrome.printPallindromeStr(str3);
		pallindrome.printPallindromeStrInArr(str4);
	}
	
	String getRevString(String str) {
		String revString = "";
		for(int index = str.length()-1; index >= 0 ; index--) {
			revString = revString + Character.toString(str.charAt(index));
			//revString = revString + str.charAt(index);
		}
		return revString;
	}
	
	boolean isPallindrome(String str) {
		boolean flag = false;
		if(str.equals(getRevString(str))) {
			flag = true;
		}
		return flag;
		
		
	}	
	
	void printData(String str) {
		if(isPallindrome(str)) {
			System.out.println("Given String \"" + str + "\" is a Pallindrome String");
		}
		else {
			System.out.println("Given String \"" + str + "\" is not a Pallindrome String");
		}
	}
	
	
	boolean isPallindrome1(String str) {
		boolean flag = true;
		for(int i =0, j = str.length()-1 ; i < j  ;i++, j-- ) {
			if(str.charAt(i) != str.charAt(j)) {
				flag = false;
				break;
			}		
		}
		return flag;
	}
	
	void printPallindromeStr(String str) {
		if(isPallindrome1(str)) {
			System.out.println("Given String \"" + str + "\" is a Pallindrome String");
		}
		else {
			System.out.println("Given String \"" + str + "\" is not a Pallindrome String");
		}
	}
	
	void printPallindromeStrInArr(String[] str) {
		System.out.println("\nGiven Array of String is : " + Arrays.toString(str) + "\nPallindrome Strings in given Array are as below :");
		for(int index = 0 ; index < str.length ; index++) {
			if(isPallindrome1(str[index])) {
				System.out.println(str[index]);
			}
			
		}
		
	}
	
	

}

/*Assignment - 34 : 2nd Oct'2022

Program 1 : How to check if two given String is the anagram of each other (using scanner class)?

Input1: catc
Input2: actc
Output: anagram
 */

package deepakPatil.Assignment34AnagramFactorialFibonacci;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment34_StringAnagram {
	
	boolean isStringAnagram1(String str1, String str2) {
		
		char []str1CharArray= str1.toCharArray();
		char []str2CharArray= str2.toCharArray();
		
		Arrays.sort(str1CharArray);
		Arrays.sort(str2CharArray);
		
		if(str1CharArray.length==str2CharArray.length) {
			for(int index=0; index<str1CharArray.length; index++) {
				if(str1CharArray[index]!=str2CharArray[index]) {
					return false;
				}
			}
			return true;
		}else {
			return false;
		}		
	}
	
	boolean isStringAnagram2(String str1, String str2) {
		
		if(str1.length()==str2.length()) {
			char ch = ' ';
			while(str1.length()>0) {
				ch=str1.charAt(0);
				str1=str1.replaceFirst(String.valueOf(ch), "");
				str2=str2.replaceFirst(String.valueOf(ch), "");
			}
			if(str1.length()==str2.length())
				return true;
			else
				return false;
		}else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		Assignment34_StringAnagram assignment34_StringAnagram = new Assignment34_StringAnagram();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your first String:");
		String str1=scanner.next();
		System.out.println("Enter your second String:");
		String str2=scanner.next();
		
		System.out.println("\n1)Approach One:By converting String to char Array:");
		if(assignment34_StringAnagram.isStringAnagram1(str1, str2)) {
			System.out.println("Given strings are Anagram strings");
		}else {
			System.out.println("Given strings are not Anagram strings");
		}
		
		System.out.println("\n2)Approach Two:By String replace logic:");
		if(assignment34_StringAnagram.isStringAnagram2(str1, str2)) {
			System.out.println("Given strings are Anagram strings");
		}else {
			System.out.println("Given strings are not Anagram strings");
		}
		
		scanner.close();
		
	}

}

//Assignment 34

package komalShrivastava;

import java.util.Scanner;

public class Anagram {

	// method to check if two given String is the anagram of each other
	
	static void isAnagram(String str1, String str2) {
		if(str1.length() == str2.length()) {
			for(int index = 0; index<str1.length();) {
				char ch = str1.charAt(0);
				str1 = str1.replaceFirst(String.valueOf(ch), "");
				str2 = str2.replaceFirst(String.valueOf(ch), "");
				if(str1.length()!=str2.length())
					System.out.println("Not Anagram");
					break;
			}
			if(str1.length()==str2.length())
				System.out.println("Anagram String");
		}
		else
			System.out.println("Not Anagram");
	}
	
	//another Anagram method for self-practice
	
	static void findAnagram(String str1, String str2) {
		if(str1.length() == str2.length()) {
			while(str1.length()>0) {
				char ch = str1.charAt(0);
				str1  =str1.replaceFirst(String.valueOf(ch), "");
				str2  =str2.replaceFirst(String.valueOf(ch), "");
			}
			if(str1.length()==str2.length())
				System.out.println("Anagram String");
			else
				System.out.println("Not Anagram String");
		}
		else
			System.out.println("Not Anagram String");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String 1 : ");
		String str1 = sc.next();
		System.out.println("Enter String 2 : ");
		String str2 = sc.next();
		sc.close();
		isAnagram(str1, str2);
		System.out.println("-----------------");
		String input1 = "komal";
		String input2 = "lmoka";
		System.out.println("String 1 : \n" + input1 + "\nString 2: \n" + input2);
		findAnagram(input1, input2);	
	}
}
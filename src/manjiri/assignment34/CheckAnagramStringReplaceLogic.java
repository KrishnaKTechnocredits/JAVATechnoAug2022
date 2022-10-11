/*Program 1 : How to check if two given String is the anagram of each other (using scanner class)?
Input1: catc
Input2: actc
Output: anagram*/

package manjiri.assignment34;

import java.util.Scanner;

public class CheckAnagramStringReplaceLogic {
	
	boolean isAnagram(String str1, String str2){
		//check if the length of both strings is equal
		if(str1.length() == str2.length()) {
			while(str1.length() > 0) {
				char ch = str1.charAt(0);
				//replace char with empty string
				str1 = str1.replaceFirst(str1.valueOf(ch), "");
				str2 = str2.replaceFirst(str1.valueOf(ch), "");
			}
			if (str1.length() == str2.length()) // check if length of both strings is 0
				return true;
		}else {
			return false;
		}
		return false;
	}
	
	void display(boolean flag) {
		if (flag) {
			System.out.println("Anagram String !!!");
		}
		else {
			System.out.println("Not an Anagram String !!!");
		}
	}
	public static void main(String[] args) {
		// Take input using Scanner class
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String1: ");
		String str1 = sc.next();
		System.out.println("Enter String2: ");
		String str2 = sc.next();
		sc.close();

		boolean ans = new CheckAnagramStringReplaceLogic().isAnagram(str1, str2);
		new CheckAnagramStringReplaceLogic().display(ans);
	}
}

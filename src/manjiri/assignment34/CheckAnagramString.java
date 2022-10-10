/*Program 1 : How to check if two given String is the anagram of each other (using scanner class)?
Input1: catc
Input2: actc
Output: anagram*/

package manjiri.assignment34;

import java.util.Arrays;
import java.util.Scanner;

public class CheckAnagramString {
		
	boolean isAnagram(String str1, String str2) {
		//Create character arrays for the given input strings
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		
		//Sort the character arrays
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		//Check if length of both the arrays is same.
		if(arr1.length == arr2.length) {
			for(int index = 0; index < arr1.length; index++) {
				if (arr1[index] != arr2[index]) { // compare array elements
					return false;
				}
			}
			return true;
		}
		else {
			return false;
		}	
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
		//Take input using Scanner class
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String1: ");
		String str1 = sc.next();
		System.out.println("Enter String2: ");
		String str2 = sc.next();
		sc.close();
		
		boolean ans = new CheckAnagramString().isAnagram(str1, str2);	
		new CheckAnagramString().display(ans);
	}
}

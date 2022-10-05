/*
 Program 1 :
Write a method to find whether given String is pallindrome.

input : radar
output : radar is pallindrom

input : aabcbaa
output : aabcbaa is pallindrom

input : abcabc
output : abcabc is not a pallindrom

 */

package swapnilMaheshwari.Assignment31_PalindramePrograms;

import java.util.Scanner;

public class PalindramString {
	boolean isPalindram (String str) {
	boolean flag= true;
		
		for (int i=0 , j=str.length()-1;i<j;i++,j--) {
			if (str.charAt(i)!=str.charAt(j)) {
				flag=false;
				break;
			}
			
		}
		return flag;
	}
	public static void main(String[] args) {
		PalindramString palindramString = new PalindramString();
		String str="";
		Scanner src = new Scanner(System.in);
		System.out.println("Enter the string");
		str=src.next();
		boolean flag=palindramString.isPalindram(str);
		if(flag==true) {
			System.out.println(str+ ":"+"String is Palindram");
		}
		else
			System.out.println(str+ ":"+"String is not Palindram");
	}
}

/*
 Program 1 : 
WAP to return String by encrypting all characters from given string by its next character.

input : apdz
output : bqea

 */

package swapnilMaheshwari.AsciiValuePrograms;

import java.util.Scanner;

public class ReturnStringByEncyByItsNextString {

	String getReturnOfString(String str) {
		String output="";
		for (int index=0; index<str.length(); index++) {
			char ch=str.charAt(index);
			if (ch=='z') {
				output+='a';
			}
			else
				output=output+(char)(ch+1);
		}
		return output;
	}
	public static void main(String[] args) {
		Scanner src=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=src.next();
		System.out.print("input :" +str);
		String strReturn;
		strReturn=new ReturnStringByEncyByItsNextString().getReturnOfString(str);
		System.out.println();
		System.out.println("Output :"+strReturn);
	}
}

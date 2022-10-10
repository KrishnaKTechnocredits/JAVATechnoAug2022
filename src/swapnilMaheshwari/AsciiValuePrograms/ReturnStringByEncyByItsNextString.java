/*
 Program 7 : 
WAP to return String by encrypting all characters from given string by its next character.

input : aPd%3zZ
output : bQe%3aA

if(ch =='Z'){
	output = output + 'A';
}else if(ch =='z'){
	output = output + 'a';
}else{
	if((ch>=65 && ch<=90) || (ch>=97 && ch<=122)){
		ch++;
	}
	output = output + ch;
}


 */

package swapnilMaheshwari.AsciiValuePrograms;

import java.util.Scanner;

public class ReturnStringByEncyByItsNextString {

	String getReturnOfString(String str) {
		String output = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (ch == 'z') {
				output += 'a';
			} else if (ch == 'Z')
				output += 'A';
			else if (ch >= 65 && ch <= 90 || ch >= 97 && ch <= 122)
				output = output + (char) (ch + 1);
			else
				output = output + ch;
		}
		return output;
	}

	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = src.next();
		System.out.print("input :" + str);
		String strReturn;
		strReturn = new ReturnStringByEncyByItsNextString().getReturnOfString(str);
		System.out.println();
		System.out.println("Output :" + strReturn);
	}
}

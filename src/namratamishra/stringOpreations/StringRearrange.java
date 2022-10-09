package namratamishra.stringOpreations;
/*
 Write a program to rearrange String in given format.  
String str = "te2cH4no";
output : "24tecHno";
Hint : AllDigitAllCharacter
*/

import java.util.Scanner;

class StringRearrange {
	String getStringStringRearrange(String str) {
		String strDgt = " ", strStr = " ";
		for (int index = 0; index <= str.length() - 1; index++) {
			char ch = str.charAt(index);
			boolean flag = Character.isDigit(ch);
			if (flag)
				strDgt = strDgt + ch;

			else
				strStr = strStr + ch;
		}
		strDgt = strDgt.replaceAll("\\s", "");
		strStr = strStr.replaceAll("\\s", "");

		return (strDgt + strStr);

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name to rearrange the name");
		String name = sc.nextLine();
		System.out.println(new StringRearrange().getStringStringRearrange(name));
		sc.close();

	}
}
/*
 Return count of digits from given String without using isDigit method of Character class..

input : te1chno2cre4di6ts 
output : 4

 */

package swapnilMaheshwari.AsciiValuePrograms;

import java.util.Scanner;

public class CountOfDigitsInString {
	int getCountOfDigitsInString(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 48 && ch <= 57) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string which has number");
		String str = scanner.next();
		int count = new CountOfDigitsInString().getCountOfDigitsInString(str);
		System.out.println("Total count of digits in the string is: " + count);
	}
}

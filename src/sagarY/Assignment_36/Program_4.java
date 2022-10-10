/*Program 4 :
Return count of digits from given String without using isDigit method of Character class..

input : Te1chNo2cre4di6ts 
output : 4*/

package sagarY.Assignment_36;

import java.util.Scanner;

public class Program_4 {

	int getDigitCount(String str) {
		int digitCount = 0;

		for (int i = 0; i < str.length(); i++) {
			int ch = str.charAt(i);
			if ((ch >= 97 && ch <= 122)  || (ch >= 60 && ch <= 90)) {

			} else
				digitCount++;
		}
		return digitCount;
	}

	public static void main(String[] args) {
		System.out.println("Program 4: Return count of digits from given String \nwithout using isDigit method of Character class");
		System.out.println("---------------------------------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any String: ");
		String str = sc.next();
		Program_4 prg4 = new Program_4();
		int digitCount = prg4.getDigitCount(str);
		System.out.println("-----------------------------------------------");
		System.out.println("Output: Count of digits in above string is: \n: " + digitCount);
	}
}

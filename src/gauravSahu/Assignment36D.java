/*		 
Program 4 :
Return count of digits from given String without using isDigit method of Character class..

input : te1chno2cre4di6ts 
output : 4
*/

package gauravSahu;

import java.util.Scanner;

public class Assignment36D {
	
	int getCountOfDigits(String input) {
		int count = 0;
		for(int i=0;i<input.length();i++) {
			char ch = input.charAt(i);
			int ascii = ch;
			if(ascii>=48 && ascii<=57) {
				count ++;
			}
		}return count;
	}
	
	public static void main(String[] args) {
		Assignment36D a36 = new Assignment36D();
		Scanner sc = new Scanner(System.in);
		System.out.println("Give input : ");
		String input = sc.next();
		int count = a36.getCountOfDigits(input);
		System.out.println("Count of Digits is : " + count);
	}
}

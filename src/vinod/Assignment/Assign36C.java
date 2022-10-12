/*Return count of digits from given String without using isDigit method of Character class..

input : te1chno2cre4di6ts 
output : 4*/

package vinod.Assignment;

import java.util.Scanner;

public class Assign36C {
	
	int getCountOfDigits(String input) {
		int count = 0;
		for(int i=0; i<input.length(); i++) {
			char ch = input.charAt(i);
			int Ascii = ch;
			if (Ascii>=48 && Ascii<=57) {
				count++;
			}
			
		}
		return count;	
	}
	public static void main(String[] args) {
		Assign36C assign36C = new Assign36C();
		Scanner sc = new Scanner(System.in);
		System.out.println("Give input : ");
		String input = sc.next();
		int count = assign36C.getCountOfDigits(input);
		System.out.println("Count of Digit is :" + count);
	}

}

package nikeshM.Assignment31;

import java.util.Scanner;

//Program 1 :

//Write a method to find whether given String is pallindrome.
//
//input : radar
//output : radar is pallindrom
//
//input : aabcbaa
//output : aabcbaa is pallindrom
//
//input : abcabc
//output : abcabc is not a pallindrom

public class Assignment31Program1 {
	boolean getPallindrome(String input) {
		boolean flag = true;
		for (int index = 0, j = input.length() - 1; index < j; index++, j--) {
			if (input.charAt(index) != input.charAt(j)) {
				flag = false;
				break;
			}		
		}
		
		return flag;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String : " );
		String input = scan.next();
		Assignment31Program1 p1 = new Assignment31Program1();
		boolean output = p1.getPallindrome(input);
		System.out.println(output);

	}
}

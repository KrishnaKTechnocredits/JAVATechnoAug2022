/*
 Program 2 : 
Write a method to return reverse number.
input : 123
output : 321

 */

package swapnilMaheshwari.Assignment32_Arms_Reverse_PalindNumbers;

import java.util.Scanner;

public class ReverseNumber {
	int getReverseNumber (int num) {
		int r=0;
		int reverseNum=0;
		while (num>0) {
			r=num%10;
			reverseNum=reverseNum*10+r;
			num=num/10;
		}
		return reverseNum;
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Number");
		System.out.println ("The reverser number is :"+new ReverseNumber().getReverseNumber(scanner.nextInt()));
	}

}

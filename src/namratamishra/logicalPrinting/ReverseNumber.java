/*
Program 2 : 
Write a method to return reverse number.
input : 123
output : 321
*/

package namratamishra.logicalPrinting;

import java.util.Scanner;

public class ReverseNumber {

	int getReverseNumber(int n) {

		String sum = "";
		while (n > 0) {

			int rem = n % 10;
			sum = sum + rem;
			n = n / 10;

		}
		int num = Integer.parseInt(sum);
		return num;
	}

	public static void main(String[] args)

	{
		ReverseNumber rn = new ReverseNumber();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to get reverse of number");
		int a = sc.nextInt();
		System.out.println("The reverse number is: " + rn.getReverseNumber(a));
		sc.close();

	}
}

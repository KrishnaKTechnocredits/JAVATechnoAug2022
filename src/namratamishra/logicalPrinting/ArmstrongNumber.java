/*Assignment - 32 : 30th Sep'2022
 * Program 1 : 
Write a method to verify number is Armstrong or not.

input : 153
output : 153 is an Armstrong number

input : 123
output : 123 is not an Armstrong number
*/
package namratamishra.logicalPrinting;

import java.util.*;

public class ArmstrongNumber {

	int getArmstrongNumber(int n) {

		int sum = 0;
		while (n > 0) {
			int rem = n % 10;
			sum = sum + rem * rem * rem;
			n = n / 10;

		}

		return sum;
	}

	public static void main(String[] args)

	{
		ArmstrongNumber an = new ArmstrongNumber();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter to check armstrong number");
		int a = sc.nextInt();
		if (a == an.getArmstrongNumber(153))
			System.out.println("Entered Number is Armstrong Number");
		else
			System.out.println("Entered Number:" + a + " is not a Armstrong Number");
		sc.close();

	}
}

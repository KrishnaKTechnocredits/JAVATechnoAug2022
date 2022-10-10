/*
 Program 1 : 
Write a method to verify number is Armstrong or not.

input : 153
output : 153 is an Armstrong number

input : 123
output : 123 is not an Armstrong number
 

 */
package swapnilMaheshwari.Assignment32_Arms_Reverse_PalindNumbers;

import java.util.Scanner;

public class ArmstrongNumber {
	void isNumberArmstrongOrNot(int num) {
		int OrignalNum = num;
		int ans = 0, r;
		while (num > 0) {
			r = num % 10;
			ans = ans + (r * r * r);
			num = num / 10;

		}
		if (OrignalNum == ans)
			System.out.println(OrignalNum + "->" + "Is Armstrong Number");
		else
			System.out.println(OrignalNum + "->" + "Is not a Armstrong Number");
	}

	public static void main(String[] args) {
		ArmstrongNumber armstrongNumber = new ArmstrongNumber();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		armstrongNumber.isNumberArmstrongOrNot(num);

	}
}

/*Assignment - 43
Java Program To Find Maximum Number Out of Three Numbers
A = 40, B = 10, C = 120*/

package rashmiG.Assignment43_46;

import java.util.Scanner;

public class Assignment43MaxNumbOutOfThreeNumbers {
	static {
		System.out.println("Enter the 3 numbers");
	}

	public static void maxNumber(int num1, int num2, int num3) {
		System.out.println("Maximum number : " + (num1 > num2 && num1 > num3 ? num1 : num2 > num3 ? num2 : num3));
	}

	public static void maxNumberApproach2(int num1, int num2, int num3) {
		System.out.println("Maximum number : ");
		if (num1 > num2 && num1 > num3) {
			System.out.println(num1);
		} else if (num2 > num3) {
			System.out.println(num2);
		} else
			System.out.println(num3);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		maxNumber(num1, num2, num3);
		sc.close();
	}
}
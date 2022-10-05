package nehaniG;

import java.util.Scanner;

public class Assignment32 {

	void getArmstrongNum(int num) {
		int input = num;
		int remainder = 0;
		int ans = 0;
		while (num > 0) {
			remainder = num % 10;
			ans += (remainder * remainder * remainder);
			num = num / 10;
		}
		if (ans == input) {
			System.out.println(input + " is armstrong");
		} else
			System.out.println(input + " is not armstrong");
	}

	int getReverseNum(int num) {
		int remainder = 0;
		int reverseNum = 0;
		while (num > 0) {
			remainder = num % 10;
			reverseNum = reverseNum * 10 + remainder;
			num = num / 10;
		}
		return reverseNum;
	}

	void getPalindromeNum(int num) {
		int input = num;
		int remainder = 0;
		int revNum = 0;
		while (num > 0) {
			remainder = num % 10;
			revNum = revNum * 10 + remainder;
			num = num / 10;
		}
		if (revNum == input) {
			System.out.println(input + " is palindrome");
		} else
			System.out.println(input + " is not palindrome");

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Assignment32 assignment32 = new Assignment32();
		System.out.print("Check Armstrong number : ");
		assignment32.getArmstrongNum(sc.nextInt());
		assignment32.getArmstrongNum(sc.nextInt());
		System.out.println("Get Reverse Number : ");
		System.out.println(assignment32.getReverseNum(sc.nextInt()));
		System.out.println("Check Palindrome Number");
		assignment32.getPalindromeNum(sc.nextInt());
		assignment32.getPalindromeNum(sc.nextInt());

	}
}

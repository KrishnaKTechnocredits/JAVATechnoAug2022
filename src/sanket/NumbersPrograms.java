/*Assignment 32 - 30th Sept 2022
WAP for reverse number, armstrong number and pallindrome number.*/

package sanket;

public class NumbersPrograms {

	// method to find given number is Armstrong Number or not
	void isArmstrongNum(int num) {

		int originalNum = num;
		int remainder = 0;
		int answer = 0;

		while (num > 0) {
			remainder = num % 10;
			answer = answer + remainder * remainder * remainder;
			num = num / 10;
		}
		if (originalNum == answer)
			System.out.println("The number " + originalNum + " is a Armstrong Number.");
		else
			System.out.println("The number " + originalNum + " is not a Armstrong Number.");
	}

	// method to find the reverse number
	void getReverseNumber(int num) {

		int originalNum = num;
		int remainder = 0;
		int revNumb = 0;

		while (num > 0) {
			remainder = num % 10;
			revNumb = revNumb * 10 + remainder;
			num = num / 10;
		}
		System.out.println("The reverse of " + originalNum + " is " + revNumb + ".");
	}

	// method to find the number is pallindrome or not.
	void isPallindromeNumber(int num) {

		int originalNum = num;
		int remainder = 0;
		int revNumb = 0;

		while (num > 0) {
			remainder = num % 10;
			revNumb = revNumb * 10 + remainder;
			num = num / 10;
		}
		if (originalNum == revNumb)
			System.out.println("The number " + originalNum + " is a Pallindrome Number.");
		else
			System.out.println("The number " + originalNum + " is not a Pallindrome Number.");
	}

	public static void main(String[] args) {
		int input1 = 123;
		int input2 = 153;
		int input3 = 121;
		int input4 = 1221;

		System.out.println("***Armstrong Number Program***");
		new NumbersPrograms().isArmstrongNum(input1);
		new NumbersPrograms().isArmstrongNum(input2);

		System.out.println("\n");

		System.out.println("***Reverse Number Program***");
		new NumbersPrograms().getReverseNumber(input1);
		new NumbersPrograms().getReverseNumber(input2);

		System.out.println("\n");

		System.out.println("***Pallindrome Number Program***");
		new NumbersPrograms().isPallindromeNumber(input1);
		new NumbersPrograms().isPallindromeNumber(input3);
		new NumbersPrograms().isPallindromeNumber(input4);
	}
}

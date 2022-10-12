package saroj;

public class Assignment32 {

	void findArmstrong(int number) {
		int sum = 0;
		int digit = 0;
		int number1 = number;
		while (number1 > 0) {
			digit = number1 % 10;
			sum = sum + (digit * digit * digit);
			number1 = number1 / 10;
		}
		if (sum == number)
			System.out.println(number + " is an armstrong number");
		else
			System.out.println(number + " is not an armstrong number");
	}

	void getReverseNum(int number) {
		int reverseNum = 0;
		int number1 = number;
		int digit = 0;
		while (number1 > 0) {
			digit = number1 % 10;
			reverseNum = reverseNum * 10 + digit;
			number1 = number1 / 10;
		}
		System.out.println("Reverse of: " + number + " is: " + reverseNum);
	}

	void checkPalindrome(int number) {
		int reverseNum = 0;
		int number1 = number;
		int digit = 0;
		while (number1 > 0) {
			digit = number1 % 10;
			reverseNum = reverseNum * 10 + digit;
			number1 = number1 / 10;
		}
		if (number == reverseNum)
			System.out.println(number + " is a palindrome number");
		else
			System.out.println(number + " is not a palindrome number");
	}

	public static void main(String[] args) {
		Assignment32 assignment32 = new Assignment32();
		int num = 153;
		assignment32.findArmstrong(num);
		int num1 = 123;
		assignment32.findArmstrong(num1);
		System.out.println("======================================");
		assignment32.getReverseNum(num1);
		System.out.println("======================================");
		int num2 = 1221;
		assignment32.checkPalindrome(num2);
		int num3 = 1231;
		assignment32.checkPalindrome(num3);
	}
}

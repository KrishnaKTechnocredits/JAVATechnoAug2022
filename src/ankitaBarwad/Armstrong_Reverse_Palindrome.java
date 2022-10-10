/*Assignment - 32 : 30th Sep'2022

Program 1 : 
Write a method to verify number is Armstrong or not.

input : 153
output : 153 is an Armstrong number

input : 123
output : 123 is not an Armstrong number
 
Program 2 : 
Write a method to return reverse number.
input : 123
output : 321

Program 3 : 
write a method to verify number is palindrome.

input : 1221
output : 1221 is a palindrome number

input : 1231
output : 1231 is not a palindrome number*/
package ankitaBarwad;

public class Armstrong_Reverse_Palindrome {

	// method to verify number is Armstrong or not
	private boolean isArmstrongNumber(int number) {
		int armstrongResult = 0;
		int remainder;
		int originalNumber = number;
		while (number > 0) {
			remainder = number % 10;
			armstrongResult = armstrongResult + (remainder * remainder * remainder); // 27+125+1=153
			number = number / 10;
		}
		if (armstrongResult == originalNumber)
			return true;
		else
			return false;
	}

	void printArmstrongNumber(int number) {
		boolean flag = isArmstrongNumber(number);
		if (flag)
			System.out.println(number + " is an Armstrong Number");
		else
			System.out.println(number + " is not an Armstrong Number");
	}

	// method to return reverse number.
	void printReverseNumber(int number) {
		System.out.print("Input Number : " + number + "\nReverse Number : ");
		int remainder;
		while (number > 0) {
			remainder = number % 10;
			number = number / 10;
			System.out.print(remainder);
		}
		System.out.print("\n");
	}

	// method to verify number is palindrome
	private boolean isPalindrome(int number) {
		int result = 0;
		int remainder;
		int originalNumber = number;
		while (number > 0) {
			remainder = number % 10;
			number = number / 10;

			result = result * 10 + remainder;
		}
		if (originalNumber == result) {
			return true;
		} else
			return false;
	}

	void printPalindrome(int number) {
		boolean flag = isPalindrome(number);
		if (flag) {
			System.out.println(number + " is a Palindrome Number");
		} else {
			System.out.println(number + " is not a Palindrome Number");
		}
	}

	public static void main(String[] args) {
		System.out.println("Program 1 :");
		Armstrong_Reverse_Palindrome example = new Armstrong_Reverse_Palindrome();
		example.printArmstrongNumber(153);
		example.printArmstrongNumber(123);
		System.out.println("\nProgram 2 :");
		example.printReverseNumber(123);
		System.out.println("\nProgram 3 :");
		example.printPalindrome(1221);
		example.printPalindrome(1231);
	}
}

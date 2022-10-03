package nilamP;

/*
Assignment - 32 : 30th Sep'2022

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
output : 1231 is not a palindrome number
*/

public class ArrayOperations4 {
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
		ArrayOperations4 ao = new ArrayOperations4();
		System.out.println("program 1 output : ");
		ao.getArmstrongNum(153);
		ao.getArmstrongNum(123);
		System.out.println("program 2 output : ");
		int input = 123;
		int output = +ao.getReverseNum(input);
		System.out.println("Reverse Num : " + output);
		System.out.println("program 3 output : ");
		int input1 = 1221;
		ao.getPalindromeNum(input1);
		int input2 = 1231;
		ao.getPalindromeNum(input2);

	}
}

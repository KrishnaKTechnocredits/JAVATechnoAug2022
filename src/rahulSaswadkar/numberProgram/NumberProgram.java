/*
 * Assignment - 32 : 30th Sep'2022

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

package rahulSaswadkar.numberProgram;

public class NumberProgram {
	public static void main(String[] args) {
		NumberProgram numberProgram = new NumberProgram();
		
		int num1 = 123;
		int num2 = 153;
		int num3 = 1221;
		int num4 = 1231;
		
		numberProgram.isArmstrongNum(num2);
		numberProgram.isArmstrongNum(num1);
		System.out.println("\nReverse Number of given number \"" + num1 + "\" is : " + numberProgram.getReverseNum(num1) + "\n");;
		numberProgram.isPalindromeNum(num3);
		numberProgram.isPalindromeNum(num4);
	}
	
	
	int getReverseNum(int num) {
		int remainder = 0;
		int revNum = 0;
		while(num > 0) {
			remainder = num % 10;//3//2//1
			revNum = (revNum * 10) + remainder;//3/32//321
			num = num / 10;//12//1//0
		}
		return revNum;
	}
	
	void isArmstrongNum(int num) {
		int origNum = num ;
		int remainder = 0;
		int ans = 0;
		while(num > 0) {
			remainder = num % 10;
			ans = ans + (remainder*remainder*remainder);
			num = num / 10;
		}
		if(origNum == ans) {
			System.out.println(origNum + " is an Armstrong Number");
		}else {
			System.out.println(origNum + " is not an Armstrong Number");
		}
	}
	
	void isPalindromeNum(int num) {
		if(num == getReverseNum(num)) {
			System.out.println(num + " is a Palindrome Number");
		}else {
			System.out.println(num + " is not a Palindrome Number");
		}
	}
}

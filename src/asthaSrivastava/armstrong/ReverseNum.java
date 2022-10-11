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
package asthaSrivastava.armstrong;

public class ReverseNum {

	// find Reverse of Number
	int getReverseNumber(int num) { // Program2
		int reverseNum = 0;
		while (num > 0) {
			int remainder = num % 10;
			reverseNum = reverseNum * 10 + remainder;
			num = num / 10;
		}
		System.out.println("Reverse num is " + reverseNum);
		return reverseNum;
	}

	public static void main(String[] args) {
		ReverseNum a = new ReverseNum();
		a.getReverseNumber(123);
	}

}

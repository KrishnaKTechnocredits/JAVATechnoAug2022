/*Assignment - 32 : 30th Sep'2022
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

package deepakPatil.Assignment32ArmstrongPalindromeNumber;

public class Assignment32_2 {
	
	//Get reverse number method
	int getReverseNumber(int num) {
		int reverseNum = 0;

		while (num > 0) {
			int remainder = num % 10;
			reverseNum = reverseNum * 10 + remainder;
			num = num / 10;
		}
		return reverseNum;
	}
	
	//Method to find if Number is pallindorme
	void findIfNumberIsPallindrome(int num) {

		if (num == getReverseNumber(num))
			System.out.println("Given number " + num + " is a Pallindrome number");
		else
			System.out.println("Given number " + num + " is not a Pallindrome number");
		System.out.println("---------------------------------------------------");
	}

	public static void main(String[] args) {
		Assignment32_2 assignment32_2 = new Assignment32_2();
		int num1 = 123;
		System.out.println("Reverse number of " + num1 + " is: " + assignment32_2.getReverseNumber(num1) + "\n");

		int num2 = 1221;
		int num3 = 1231;
		assignment32_2.findIfNumberIsPallindrome(num2);
		assignment32_2.findIfNumberIsPallindrome(num3);
	}
}

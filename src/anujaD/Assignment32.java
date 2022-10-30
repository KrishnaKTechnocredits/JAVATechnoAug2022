/*Assignment - 32 : 30th Sep'2022
Program 1 : 
Write a method to verify number is Armstrong or not.
input : 153
output : 153 is an Armstrong number
input : 123
output : 123 is not an Armstrong number
*/
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
package anujaD;

public class Assignment32 {
	
	void findIfNumberArmstrong(int num) {
		int originalNum = num;
		int ans = 0;

		while (num > 0) {

			int remainder = num % 10;
			System.out.println(remainder);
			ans = ans + (remainder * remainder * remainder);
			num = num / 10;
		}

		if (ans == originalNum)
			System.out.println("Number " + originalNum + " is an Armstrong number");
		else
			System.out.println("Number " + originalNum + " is not an Armstrong number");
		System.out.println("------------------------------------------");
	}
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
		Assignment32 assignment32 = new Assignment32();
		int num1 = 153;
		int num2 = 123;
		assignment32.findIfNumberArmstrong(num1);
		assignment32.findIfNumberArmstrong(num2);
		
		int num3 = 123;
		System.out.println("Reverse number of " + num3 + " is: " + assignment32.getReverseNumber(num3) + "\n");

		int num4 = 1221;
		int num5 = 1231;
		assignment32.findIfNumberIsPallindrome(num4);
		assignment32.findIfNumberIsPallindrome(num5);
	}


}

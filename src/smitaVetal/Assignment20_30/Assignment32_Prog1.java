/*Program 1 : 
Write a method to verify number is Armstrong or not.

input : 153
output : 153 is an Armstrong number

input : 123
output : 123 is not an Armstrong number
*/
package smitaVetal.Assignment20_30;

public class Assignment32_Prog1 {

	void palindrome(int number) {
		int originalNumber = number;
		int remainder = 0;
		int revNum = 0;
		
		System.out.println("Original Number is : " + originalNumber);

		while (number > 0) {
			remainder = number / 10;
			revNum = revNum * 10 + remainder;
			number = number / 10;
		}
		if (revNum == originalNumber)
			System.out.println(originalNumber +" Is palindrome");
		else
			System.out.println(originalNumber +" is not palindrome");
	}

	public static void main(String[] args) {
		Assignment32_Prog1 prog = new Assignment32_Prog1();
		int number = 1221;
		prog.palindrome(number);
		System.out.println("========================================");
		int number2 = 1251;
		prog.palindrome(number2);

	}
}

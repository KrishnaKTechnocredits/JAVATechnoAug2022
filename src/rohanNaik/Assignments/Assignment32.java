/*Program 1 : 
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

package rohanNaik.Assignments;

public class Assignment32 {

	void isPalindrome(int input) {
		int originalNum = input;
		int processNum = input;
		int num = 0;
		int revNum = 0;
		for (int i = 0; i < 4; i++) {
			num = processNum % 10;
			revNum = revNum * 10 + num;
			if (processNum > 0)
				processNum = processNum / 10;
		}

		if (originalNum == revNum) {
			System.out.println(originalNum + " is Palindrome!");
		} else
			System.out.println(originalNum + " is not a Palindrome!");

	}

	
	void reverseNum(int input) {

		int originalNum = input;
		int processNum = input;
		int reverseNum = 0;
		int num = 0;

		for (int i = 0; i < 6; i++) {
			num = processNum % 10;
			reverseNum = reverseNum * 10 + num;
			if (processNum > 0)
				processNum = processNum / 10;
		}
		System.out.println("reverse of "+originalNum+" is :"+reverseNum);
	}

	
	void isArmstrong(int input) {

		int originalNum = input;
		int processNum = input;
		int sum = 0;
		int num = 0;
		int cube = 0;

		for (int index = 0; index < 3; index++) {
			num = processNum % 10;
			cube = (num * num * num);
			sum = sum + cube;
			if (processNum > 0)
				processNum = processNum / 10;
		}
		if (originalNum == sum)
			System.out.println(originalNum + " is an Armstrong Number");
		else
			System.out.println(originalNum + " is not an Armstrong Number");
	}

	public static void main(String[] args) {
		Assignment32 obj = new Assignment32();
		 obj.isArmstrong(153);
		 obj.isArmstrong(123);
		 System.out.println("---------------------------------------------------------------");
		 obj.reverseNum(123456);
		 System.out.println("---------------------------------------------------------------");
		 obj.isPalindrome(7337);
	}
}

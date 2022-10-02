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
package shrutiArora;
public class Assignment32 {
	void checkIfNumberIsArmstrongOrNot(int num) {
		System.out.println("input: " + num);
		int digit = 0;
		int sum = 0;
		int orginalNum = num;
		while (num > 0) {
			digit = num % 10;
			sum +=  digit * digit * digit;
			num = num / 10;
		}
		if (orginalNum == sum) {
			System.out.println(orginalNum + " is Armstrong Number");
		} else {
			System.out.println(orginalNum + " is not Armstrong Number");
		}
	}
	int getReverseNumber(int num) {
		System.out.println("Given input number is: " + num);
		int revNum = 0;
		int digit=0;
		while (num > 0) {
			digit = num % 10;
			revNum=revNum*10+digit;
			num = num / 10;
		}
		return revNum;
	}
	void checkIfNumberIsPalindrome(int num) {
		System.out.println("input: " + num);
		int orginalNum = num;
		int revNum = 0;
		int digit = 0;
		while (num > 0) {
			digit = num % 10;
			revNum = revNum * 10 + digit;
			num = num / 10;
		}
		if (orginalNum == revNum) {
			System.out.println(orginalNum + " is a pallindrome number");
		} else {
			System.out.println(orginalNum + " is not a pallindrome number");
		}
	}
	

	public static void main(String[] args) {
		Assignment32 assignment32 = new Assignment32();
		System.out.println("************************************Program1**************************************************");
        assignment32.checkIfNumberIsArmstrongOrNot(153);
		assignment32.checkIfNumberIsArmstrongOrNot(123);
		System.out.println("**********************************************************Program2*********************************************");
	    System.out.println(" reverse number  is: "+assignment32.getReverseNumber(123));
	    System.out.println("*******************************************************Program3***************************************************");
	    assignment32.checkIfNumberIsPalindrome(1221);
		assignment32.checkIfNumberIsPalindrome(1231);
	}
}
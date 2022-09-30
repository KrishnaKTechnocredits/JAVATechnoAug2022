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
output : 1231 is not a palindrome number */

package pujaSah.assignments31_40;

public class PallindromNumbers {

	// method to verify number is Armstrong or not
	void displayArmstrongNumber(int num) {
		int armNum = 0;
		int origNum = num;
		while (num > 0) {
			armNum += (num % 10) * (num % 10) * (num % 10);
			num = num / 10;
		}
		if (origNum == armNum) {
			System.out.println(origNum + " is an Armstrong number");
		} else {
			System.out.println(origNum + " is not an Armstrong number");
		}
	}

	// method to return reverse number
	int getReverseNumber(int num) {
		int revNum = 0;
		int origNum = num;
		while (num > 0) {
			revNum = (revNum * 10) + (num % 10);
			num = num / 10;
		}
		System.out.println("Reverse of " + origNum + " is " + revNum);
		return revNum;
	}

	// method to verify number is palindrome
	void displayPallindromNumber(int num) {
		int revNum = getReverseNumber(num);
		if (num == revNum) {
			System.out.println(num + " is Pallindrom \n");
		} else {
			System.out.println(num + " is not Pallindrom \n");
		}
	}

	public static void main(String[] args) {
		PallindromNumbers obj = new PallindromNumbers();

		obj.displayArmstrongNumber(153);
		obj.displayArmstrongNumber(123);
		System.out.println("\n");

		obj.getReverseNumber(123);
		System.out.println("\n");

		obj.displayPallindromNumber(1221);
		obj.displayPallindromNumber(1231);
	}
}

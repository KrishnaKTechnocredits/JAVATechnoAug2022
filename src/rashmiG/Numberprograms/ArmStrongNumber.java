/*Assignment - 32 : 30th Sep'2022

Program 1 : 
Write a method to verify number is Armstrong or not.

input : 153
output : 153 is an Armstrong number

input : 123
output : 123 is not an Armstrong number*/

package rashmiG.Numberprograms;

class ArmStrongNumber {

	void isArmStrongNumber(int num) {
		int originalNumber = num;
		int ans = 0;
		while (num > 0) {
			int r = num % 10;
			ans = ans + (r * r * r);
			num = num / 10;
		}
		if (originalNumber == ans)
			System.out.println(originalNumber + " is an Armstrong number");
		else
			System.out.println(originalNumber + " is not an Armstrong number");
	}

	public static void main(String[] args) {
		ArmStrongNumber number = new ArmStrongNumber();
		number.isArmStrongNumber(153);
		number.isArmStrongNumber(123);
	}
}

/*Assignment - 32 :

Program 1 : 
Write a method to verify number is Armstrong or not.

input : 153
output : 153 is an Armstrong number

input : 123
output : 123 is not an Armstrong number
*/

package apurvaBabel.Assignment31to40;

public class Assignment32_ArmstrongNumber {

	// Method to verify Armstrong number
	boolean isArmstrong(int num) {
		int originalNum = num;
		int sum = 0;
		int reminder;

		while (num > 0) {
			reminder = num % 10;
			sum = sum + (reminder * reminder * reminder);
			num = num / 10;
		}
		if (sum == originalNum) {
			return true;
		}
		return false;
	}

	void printStatus(int num) {
		if (isArmstrong(num)) {
			System.out.println(num + " is an Armstrong number");
		} else {
			System.out.println(num + " is not an Armstrong number");
		}
	}

	public static void main(String[] args) {
		Assignment32_ArmstrongNumber assignment32 = new Assignment32_ArmstrongNumber();
		assignment32.printStatus(153);
		assignment32.printStatus(123);
	}
}

package apurvaBabel;

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

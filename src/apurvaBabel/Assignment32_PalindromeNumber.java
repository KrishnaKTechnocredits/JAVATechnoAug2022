package apurvaBabel;

public class Assignment32_PalindromeNumber {

	// Method to verify palindrome number
	boolean isPalindromeNumber(int num) {
		int originalNum = num;
		int reverseNum = 0;
		int reminder;

		while (num > 0) {
			reminder = num % 10;
			reverseNum = reverseNum * 10 + reminder;
			num = num / 10;
		}
		if (reverseNum == originalNum) {
			return true;
		}
		return false;
	}

	void printStatus(int num) {
		if (isPalindromeNumber(num)) {
			System.out.println(num + " is a palindrome number.");
		} else {
			System.out.println(num + " is not a palindrome number.");
		}
	}

	public static void main(String[] args) {
		Assignment32_PalindromeNumber assignment32 = new Assignment32_PalindromeNumber();
		assignment32.printStatus(1221);
		assignment32.printStatus(1231);
	}
}

/*write a method to verify number is palindrome.
input : 1221
output : 1221 is a palindrome number
input : 1231
output : 1231 is not a palindrome number*/

package manjiri.assignment32;

public class PalindromeNumber {

	boolean isPalindrome(int num) {
		int number = num;
		int revNumber = 0;
		int remainder = 0;

		// Calculate reverse number
		while (num > 0) {
			remainder = num % 10;
			revNumber = revNumber * 10 + remainder;
			num = num / 10;
		}

		// Check if reverse number is equal to original number
		if (number == revNumber) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		PalindromeNumber palindromeNumber = new PalindromeNumber();
		int input = 1221;
		boolean palindromeNumberFlag = palindromeNumber.isPalindrome(input);

		if (palindromeNumberFlag)
			System.out.println(input + " " + "is a palindrome number");
		else
			System.out.println(input + " " + "is not a palindrome number");
	}
}

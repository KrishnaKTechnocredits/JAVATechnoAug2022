/*Assignment - 32 : 30th Sep'2022

Program 3 : 
write a method to verify number is palindrome.

input : 1221
output : 1221 is a palindrome number

input : 1231
output : 1231 is not a palindrome number*/

package rashmiG.Numberprograms;

class PalindromeNumber {

	void isPalindrome(int num) {
		int originalNumber = num;
		int revNumber = 0;
		while (num > 0) {
			int r = num % 10;
			revNumber = revNumber * 10 + r;
			num = num / 10;
		}
		if (originalNumber == revNumber)
			System.out.println(originalNumber + " is a palindrome number");
		else
			System.out.println(originalNumber + " is not a palindrome number");
	}

	public static void main(String[] args) {
		PalindromeNumber number = new PalindromeNumber();
		number.isPalindrome(1221);
		number.isPalindrome(1231);
	}
}

/*Program 3 : 
write a method to verify number is palindrome.

input : 1221
output : 1221 is a palindrome number

input : 1231
output : 1231 is not a palindrome number*/

package asthaSrivastava.armstrong;

public class PallindromeNumber {

	// find Number Pallindrome
	void getPallindromeNumber(int num) { // Program3
		int reverseNum = 0;
		int originalNum = num;
		while (num > 0) {
			int remainder = num % 10;
			reverseNum = reverseNum * 10 + remainder;
			num = num / 10;
		}
		if (originalNum == reverseNum)
			System.out.println(originalNum + " is Pallindrome Number");
		else
			System.out.println(originalNum + " is not Pallindrome Number");
	}

	public static void main(String[] args) {
		PallindromeNumber test = new PallindromeNumber();
		test.getPallindromeNumber(1221);
		PallindromeNumber test1 = new PallindromeNumber();
		test1.getPallindromeNumber(1231);
	}

}

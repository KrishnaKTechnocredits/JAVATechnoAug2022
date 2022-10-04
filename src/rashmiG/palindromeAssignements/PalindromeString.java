/*Assignment - 31 : 29th Sep'2022

Program 1 :
Write a method to find whether given String is pallindrome.

input : radar
output : radar is pallindrom

input : aabcbaa
output : aabcbaa is pallindrom

input : abcabc
output : abcabc is not a pallindrom*/

package rashmiG.palindromeAssignements;

class PalindromeString {

	void findPaindromeStringAlternative(String str) {
		String revString = "";
		for (int index = str.length() - 1; index >= 0; index--) {
			revString = revString + str.charAt(index);
		}

		System.out.print("input : " + str + "\n");

		if (str.equals(revString))
			System.out.println("output : " + str + " is palindrome" + "\n");
		else
			System.out.println("output : " + str + " is  not a palindrome");
	}

	boolean isPlaindrome(String str) {
		boolean isPlaindromeFlag = true;
		for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
			if (str.charAt(i) != str.charAt(j)) {
				isPlaindromeFlag = false;
				break;
			}
		}
		return isPlaindromeFlag;
	}

	void displayPalindromeOrNot(String str) {
		boolean flag = isPlaindrome(str);
		System.out.print("input : " + str + "\n");
		if (flag)
			System.out.println("output : " + str + " is palindrome" + "\n");
		else
			System.out.println("output : " + str + " is  not a palindrome");
	}

	public static void main(String[] args) {
		PalindromeString palindromeString = new PalindromeString();
		palindromeString.displayPalindromeOrNot("radar");
		palindromeString.displayPalindromeOrNot("aabcbaa");
		palindromeString.displayPalindromeOrNot("abcabc");

	}
}
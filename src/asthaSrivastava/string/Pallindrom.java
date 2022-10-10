/*Assignment - 31 : 29th Sep'2022

Program 1 :
Write a method to find whether given String is pallindrome.

input : radar
output : radar is pallindrom

input : aabcbaa
output : aabcbaa is pallindrom

input : abcabc
output : abcabc is not a pallindrom


Program 2 :
Write a method to print all pallindrome input from given array.

input : {"radar","techhpet","madam","maulikkilum"};
output : radar
         madam*/

package asthaSrivastava.string;


public class Pallindrom {

	// method to find Pallindrom
	boolean isPallindromString(String str) {
		boolean flag = true;

		for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
			if (str.charAt(i) != str.charAt(j)) {
				flag = false;
			}
		}
		return flag;
	}

	// method to print Pallindrom
	void displayPallindrome(String input) {

		if (isPallindromString(input)) {
			System.out.println(input + " is pallindrome");
		} else {
			System.out.println(input + " is not pallindrome");
		}
	}
	//method to find all Pallindrom from given array of String
	void printAllPallindrome(String[] arr) {
		for (int index = 0; index < arr.length; index++) {
			String name = arr[index];
			boolean flag = isPallindromString(name);

			if (flag) {
				System.out.println(name + " is pallindrome");
			}
		}

	}

	public static void main(String[] args) {
		Pallindrom pm = new Pallindrom();
		pm.displayPallindrome("radar");
		pm.displayPallindrome("aabcbaa");
		pm.displayPallindrome("abcabc");
		System.out.println("--------------------------");

		String[] input = { "radar", "techhpet", "madam", "maulikkilum" };
		
		pm.printAllPallindrome(input);

	}

}

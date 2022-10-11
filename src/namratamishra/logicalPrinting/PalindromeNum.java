/*Program 3 : 
write a method to verify number is palindrome.

input : 1221
output : 1221 is a palindrome number

input : 1231
output : 1231 is not a palindrome number
*/

package namratamishra.logicalPrinting;

import java.util.Scanner;

public class PalindromeNum

{
	boolean getPalindromeNum(String str) {
		boolean flag = true;
		for (int i = 0, j = str.length() - 1; i < j; i++, j--)

		{
			if (str.charAt(i) != str.charAt(j)) {
				flag = false;
				break;
			}
		}
		return flag;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number to check palindrome or not");
		int a = sc.nextInt();
		String str = "" + a;
		PalindromeNum pn = new PalindromeNum();
		if (pn.getPalindromeNum(str))
			System.out.println("Entered Number: " + a + " is palindrome number");
		else
			System.out.println("Entered Number: " + a + " is not a  palindrome number");

		sc.close();

	}

}

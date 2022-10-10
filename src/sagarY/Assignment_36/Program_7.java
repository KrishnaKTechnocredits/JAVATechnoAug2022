/*Program 7 : 
WAP to return String by encrypting all characters from given string by its next character.

input : aPd%3zZ
output : bQ%e3aA
*/

package sagarY.Assignment_36;
import java.util.Scanner;

public class Program_7 {

	String nextCharReturnByUsingAscii(String str) {
		String nextCharString = "";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (str.charAt(i) == 'z') {
				nextCharString = nextCharString + 'a';
			} else if (str.charAt(i) == 'Z') {
				nextCharString = nextCharString + 'A';
			} else {
				if ((ch >= 97 && ch <= 122) || (ch >= 60 && ch <= 90)) {
					ch++;
				}
				nextCharString = nextCharString + ch;
			}
		}
		return nextCharString;
	}

	public static void main(String[] args) {
		System.out.println("Program 7 : WAP to return String by encrypting all \ncharacters from given string by its next character.");
		System.out.println("----------------------------------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any String: ");
		String str = sc.next();
		Program_7 prg7 = new Program_7();
		String returnString = prg7.nextCharReturnByUsingAscii(str);
		System.out.print("Output: String returning with its next chars is: \n:" + returnString);
		sc.close();
	}

}

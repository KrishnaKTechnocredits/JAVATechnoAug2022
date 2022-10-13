/*Program 5 : 
Return character holding given Ascii value.

input : 69
output : E*/

package vinod.Assignment;

import java.util.Scanner;

public class Assign36D {
	void getCharacter(int input) {
		char ch = (char)input;
		System.out.println("Character of given Value : " + ch);
	}
	public static void main(String[] args) {
		Assign36D assign36D = new Assign36D();
		Scanner sc = new Scanner(System.in);
		System.out.println("Give Number :");
		int input = sc.nextInt();
		assign36D.getCharacter(input);
	}

}

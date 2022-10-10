/*Program 5 : 
Return character holding given Ascii value.

input : 69
output : E*/
package gauravSahu;

import java.util.Scanner;

public class Assignment36E {

	void getCharacter(int input) {
		char ch = (char)input;
		System.out.println("Characeter of given value : " + ch);
	}
	public static void main(String[] args) {
		Assignment36E a36 = new Assignment36E();
		Scanner sc = new Scanner(System.in);
		System.out.println("Give number : ");
		int input = sc.nextInt();
		a36.getCharacter(input);
		
	}
}

/*Program 5 : 
Return character holding given Ascii value.

input : 69
output : E
*/

package sagarY.Assignment_36;

import java.util.Scanner;

public class Program_5 {
	
	char getCharHoldAscii(int num) {
		char ch = (char)num;
				
		return ch;
		
	}
	public static void main(String[] args) {
		System.out.println("Program 5 : Return character \nholding given Ascii value.");
		System.out.println("-------------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number: ");
		int num = sc.nextInt();
		Program_5 prg5 = new Program_5();
		char ch = prg5.getCharHoldAscii(num);
		System.out.println("-----------------------------");
		System.out.println("OUTPUT: Ascii value of '"+num+"' is: \n:"+ch);
	}

}

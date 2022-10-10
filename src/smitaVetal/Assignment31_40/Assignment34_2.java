/*Program 2 : Write a method to return factorial of user defined given number (using scanner class).
input : 5
output : 120
*/
package smitaVetal.Assignment31_40;

import java.util.Scanner;

public class Assignment34_2 {
	void Factorial(int num) {

		int fact = 1;

		for (int index = 1; index <= num; index++) {
			fact = fact * index;
		}
		System.out.println("Factorial of " + num + "! =" + fact);
	}
public static void main(String[] args) {
	Assignment34_2 prog = new Assignment34_2();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number for factorial:");
	int num = sc.nextInt();
	prog.Factorial(num);
	sc.close();

}
}

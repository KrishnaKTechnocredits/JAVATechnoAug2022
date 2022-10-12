/*Program 2 : Write a method to return factorial of user defined given number (using scanner class).
input : 5
output : 120*/

package manjiri.assignment34;

import java.util.Scanner;

public class FactorialOfNumber {
	
	int getFactorial(int num) {
		int fact = 1;
		
		while(num > 0) {
			fact *= num;
			num--;
		}
		return fact;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to calculate Factorial: ");
		int num = sc.nextInt();
		sc.close();
		
		int ans = new FactorialOfNumber().getFactorial(num);
		System.out.println("Factorial of "+ num +" is: " + ans);
	}
}

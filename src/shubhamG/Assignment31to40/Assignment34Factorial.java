package shubhamG.Assignment31to40;

import java.util.Scanner;

/*Program 2 : Write a method to return factorial of user defined given number (using scanner class).
input : 5
output : 120*/

public class Assignment34Factorial {

	int getFactorialOfGivenNumber(int num) {
		int fact = 1;
		if (num < 1) {
			System.out.println("Invalid Number");
			fact = 0;
		} else {
			for (int i = 1; i <= num; i++) {
				fact = fact * i;
			}
		}
		return fact;
	}

	public static void main(String[] args) {
		Assignment34Factorial factorial = new Assignment34Factorial();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("Factorial of " + num + " is: " + factorial.getFactorialOfGivenNumber(num));
		sc.close();
	}
}

package rohini.Assignment34;
//Program 2 : Write a method to return factorial of user defined given number (using scanner class).
import java.util.Scanner;

public class Factorial {
	int getFactorial(int num) {
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		return fact;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number");
		int num = input.nextInt();
		int output = new Factorial().getFactorial(num);
		System.out.println("Factorial of " + num + " is: " + output);
		input.close();
	}
}

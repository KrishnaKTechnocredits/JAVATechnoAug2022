package rohini.Assignment34;
//Program 3 : Print Fibonacci series till Nth number.
import java.util.Scanner;

public class Fibonacci {
	void printFibonacci(int input) {
		int num1 = 0;
		int num2 = 1;
		System.out.print("Fibonacci Series: " + num1 + " " + num2);
		for (int i = 1; i <= input - 2; i++) {
			int temp = num1 + num2;
			num1 = num2;
			num2 = temp;
			System.out.print(" " + num2);
		}
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number");
		int num = input.nextInt();
		new Fibonacci().printFibonacci(num);
		input.close();
	}
}

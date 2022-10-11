/*Program 3 : Print fibonacci series till Nth number.
input : 8
output : 0 1 1 2 3 5 8 13*/

package manjiri.assignment34;

import java.util.Scanner;

public class FibonacciSeries {
	
	void getFibonacciSeries(int num){;
		System.out.println("Fibonacci Series till "+num+" is: ");
		
		int num1 = 0;
		int num2 = 1;
		int temp = 0;
		System.out.print(num1 + " ");
		System.out.print(num2 + " ");
		
		for(int index = 1; index <=num-2; index++) {
			temp = num2;
			num2 = num1+num2;
			num1 = temp;
			System.out.print(num2 + " ");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number to print Fibonacci series till given number: ");
		String str = sc.next();
		int num = Integer.parseInt(str); //Converts String to Integer
		sc.close();
		
		new FibonacciSeries().getFibonacciSeries(num);
	}
}

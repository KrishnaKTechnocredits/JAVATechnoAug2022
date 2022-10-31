

package deepakPatil.Assignment34AnagramFactorialFibonacci;

import java.util.Scanner;

public class FibonacciSeries {
	
	void printFibonacciSeries(int num) {
		int num1=0;
		int num2=1;
		System.out.println(num1);
		System.out.println(num2);
		for(int index=1; index<=num-2; index++) {
			int temp=num2;
			num2=num1+num2;
			num1=temp;
			System.out.println(num2);
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the number till you want to print Fibonacci Series: ");
		int num= scanner.nextInt();
		
		System.out.println("Fibonacci Series till number "+num+" as below:");
		new FibonacciSeries().printFibonacciSeries(num);
		
		scanner.close();
	}
}

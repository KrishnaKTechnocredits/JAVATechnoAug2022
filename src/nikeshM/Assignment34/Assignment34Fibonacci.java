package nikeshM.Assignment34;

import java.util.Scanner;

//Program 3 : Print fibonacci series till Nth number.
//input : 8
//output : 0 1 1 2 3 5 8 13 21 34

public class Assignment34Fibonacci {
	void getFibonacci(int num) {
		int num1 = 0 , num2 =1 , temp ;
		System.out.println( num1 + " ");
		System.out.println( num2 + " ");
		
		for(int index = 1 ; index<=num ; index++) {
			temp = num2;
			num2 = num1+num2;
			num1= temp;
			System.out.print(num2 + " ");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Fibonacci No");
		int num = scanner.nextInt();
		Assignment34Fibonacci fibonacci = new Assignment34Fibonacci();
		fibonacci.getFibonacci(num);
		scanner.close();
	}
}	

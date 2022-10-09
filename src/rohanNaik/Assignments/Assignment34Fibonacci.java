/*Program 3 : Print fibonacci series till Nth number.
input : 8
output : 
*/package rohanNaik.Assignments;

import java.util.Scanner;

public class Assignment34Fibonacci {
	
	void getFibonacci(int num) {//0 1 1 2 3 5 8 13
		
		int fibonacci = 0;
		int num1 = 0;
		int num2 = 1;
		System.out.println(num1);
		System.out.println(num2);
		
		for(int index = 1; index<=num-2; index++) {			
			int temp = num2;
			num2 = num1+num2;
			num1 = temp;
			
			System.out.println(num2);			
		}
		
	}
	
	
	public static void main(String[] args) {
		System.out.print("Enter the Number: ");
		
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		Assignment34Fibonacci obj = new Assignment34Fibonacci();
		obj.getFibonacci(num);
	}

}

package nikeshM.Assignment34;

import java.util.Scanner;

//Program 2 : Write a method to return factorial of user defined given number (using scanner class).
//input : 5
//outut : 120

public class Assignment34Factorial {
	int getFactorialNo(int num){
		int fact =1 ;
		for(int index = 1 ; index<=num; index++) {
			fact = fact*index;
			
		}
		return fact;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Factorial No");
		int num = scanner.nextInt();
		Assignment34Factorial factorial = new Assignment34Factorial();
		int fact = factorial.getFactorialNo(num);
		System.out.println("Factorial is : " + fact);
		scanner.close();
	}
}

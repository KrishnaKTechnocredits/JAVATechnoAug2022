package kiran.Assignment34.AnagramFibFact;

import java.util.Scanner;

public class Factorial {
	int getFactorial(int num) {
		int fact = 1;
		for(int i=1;i<=num;i++) {
			fact = fact*i;
		}
		return fact;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		Factorial factorial = new Factorial();
		int fact = factorial.getFactorial(num);
		System.out.println("Factorial is: "+fact);
		sc.close();
	}
}

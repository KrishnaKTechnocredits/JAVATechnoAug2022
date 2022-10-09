package technocredits.inteview;

import java.util.Scanner;

public class FactorialExample {

	int getFactorial(int num) {
		return 0;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter input :");
		int num = scanner.nextInt();
		
		FactorialExample factorialExample = new FactorialExample();
		int ans = factorialExample.getFactorial(num);
		System.out.println(ans);
		
	}
}

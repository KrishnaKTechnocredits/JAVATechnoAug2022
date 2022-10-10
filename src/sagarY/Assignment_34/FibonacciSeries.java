package sagarY.Assignment_34;

import java.util.Scanner;

public class FibonacciSeries {
	
	void fibonacciSeries(int num) {
		int num1=0;
		int num2=1;
		
		while(num>0) {
			int temp = num1;
			num1=num1+num2;
			num2=temp;
			System.out.print(num2+",");
			num--;
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the num till want fibonacci calculate:");
		int num = sc.nextInt();
		new FibonacciSeries().fibonacciSeries(num);
		sc.close();
	}

}

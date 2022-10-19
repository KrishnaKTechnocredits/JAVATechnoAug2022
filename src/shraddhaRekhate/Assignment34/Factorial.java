package shraddhaRekhate.Assignment34;
//Program 2 : Write a method to return factorial of user defined given number (using scanner class).
//input : 5
//output : 120

import java.util.Scanner;

public class Factorial {
	//5!=5*4*3*2*1
	int getFactorial(int num) {
		int factorial=1;
		if(num==0)
			System.out.println(1);
		
		for(int index=1;index<=num;index++) {
		factorial=factorial*index;
	}
	return factorial;	
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter input");
		int input1=sc.nextInt();
		Factorial obj=new Factorial();
		System.out.println(obj.getFactorial(input1));
	}

}

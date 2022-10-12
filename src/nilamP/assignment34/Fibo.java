/*Program 3 : Print fibonacci series till Nth number.
input : 8
output : 0 1 1 2 3 5 8 13*/
package nilamP.assignment34;

import java.util.Scanner;

public class Fibo {
	void getFibo(int num) {
		int num1 = 0, num2 = 1, temp;
		System.out.print(num1 + " ");
		System.out.print(num2 + " ");
		for (int i = 1; i <= num; i++) {
			temp = num2;
			num2 = num1 + num2;
			num1 = temp;
			System.out.print(num2 + " ");
		}
	}

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("enter the number to get fibonacci series : ");
		int num = sc1.nextInt();
		System.out.println("fibonacci series : ");
		Fibo fb = new Fibo();
		fb.getFibo(num);

		sc1.close();
	}
}

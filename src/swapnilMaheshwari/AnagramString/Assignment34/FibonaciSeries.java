/*
 Program 3 : Print fibonacci series till Nth number.
input : 8
output : 0 1 1 2 3 5 8 13

 */

package swapnilMaheshwari.AnagramString.Assignment34;

import java.util.Scanner;

public class FibonaciSeries {
	void getFibonaciSeries(int num) {
		int i = 0;
		int j = 1;
		System.out.print("Fibonaic Series of the given number is:" + num + " :");
		System.out.print(i + " ");
		System.out.print(j + " ");
		for (int k = 1; k <= num - 2; k++) {
			int temp = j;
			j = i + j;
			i = temp;
			System.out.print(j + " ");
		}
	}

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scr.nextInt();
		new FibonaciSeries().getFibonaciSeries(num);
	}
}

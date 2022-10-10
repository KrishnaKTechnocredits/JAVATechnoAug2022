/*Program 3 : Print fibonacci series till Nth number.
input : 8
output : 0 1 1 2 3 5 8 13
*/
package smitaVetal.Assignment31_40;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment34_3 {

	void fibona(int num) {

		int[] fibo = new int[num];
		fibo[0] = 0;
		fibo[1] = 1;
		System.out.println("Print fibonacci series till " + num + " number: ");
		for (int index = 2; index <= num - 1; index++) {
			fibo[index] = fibo[index - 2] + fibo[index - 1];
		}
		System.out.println(Arrays.toString(fibo));
	}

	public static void main(String[] args) {
		Assignment34_3 prog = new Assignment34_3();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Nth number till fibonacci is required:");
		int num2 = sc.nextInt();
		prog.fibona(num2);
		sc.close();
	}

}

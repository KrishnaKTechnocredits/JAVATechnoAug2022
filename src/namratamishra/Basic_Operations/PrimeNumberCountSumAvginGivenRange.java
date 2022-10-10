
package namratamishra.Basic_Operations;

/*Assignment - 12 : 1st Sep'2022

Create a class to satisfy below requirements. 
 a) Print all the prime numbers between range 100->120. (parameterized method)
     Print total count of prime numbers within the same range.
     Print sum of all prime numbers within same range
     Print avg of prime numbers within same range
*/

import java.util.*;

public class PrimeNumberCountSumAvginGivenRange {

	void getPrimeNumberCountSumAvginGivenRange(int num1, int num2) {

		int count = 0;
		int sum = 0;

		for (int i = num1; i <= num2; i++) {
			boolean flag = true;
			for (int j = 2; j < i / 2; j++)

			{
				if (i % j == 0) {
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.println(i);
				count++;
				sum = sum + i;
			}
		}
		System.out.println("Count of all Prime Numbers in given range is: " + num1 + "and " + num2 + " is: " + count);
		System.out.println("Sum of all prime number in given range:" + num1 + "and " + num2 + " is: " + sum);
		System.out.println("Avg. of all Prime numbers in given range is: " + (sum / count));
	}

	public static void main(String[] args) {

		PrimeNumberCountSumAvginGivenRange pm = new PrimeNumberCountSumAvginGivenRange();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter range to check Prime Number");
		int a = sc.nextInt();
		int b = sc.nextInt();
		pm.getPrimeNumberCountSumAvginGivenRange(a, b);
		sc.close();

	}

}

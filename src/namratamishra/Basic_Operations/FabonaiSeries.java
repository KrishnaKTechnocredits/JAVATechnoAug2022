/*
Program 3 : Print fibonacci series till Nth number.
input : 8
output : 0 1 1 2 3 5 8 13
*/

package namratamishra.Basic_Operations;

import java.util.*;

public class FabonaiSeries {

	void getFabonaiSeries(int a) {

		int num1 = 0;
		int num2 = 1;
       int count=0;
		System.out.print(num1 + "," + num2);
		while (count<a-2) {

			 int num3 = num1 + num2;
			System.out.print("," + num3);
			count++;
			num1 = num2;
			num2 = num3;

		    }

	}

	public static void main(String[] args)

	{
		FabonaiSeries an = new FabonaiSeries();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in fabonai series");
		int numElementsFaboni = sc.nextInt();
		an.getFabonaiSeries(numElementsFaboni);
		sc.close();

	}
}

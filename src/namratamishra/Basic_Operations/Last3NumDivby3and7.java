/*
Find the last 3 numbers divisible by 3 and 7.

Input : 10 to 200
Output : 189
         168
         147  
              */

package namratamishra.Basic_Operations;

import java.util.Scanner;

public class Last3NumDivby3and7 {

	void getLast3NumDivby3and7(int startNum, int endNum) {
		int count = 0;
		System.out.println("Last 3 Numbers Div by 3&7 are: ");

		for (int i = endNum; i >= startNum; i--)
			if (i % 3 == 0 && i % 7 == 0) {

				count++;
				System.out.println(i);
				if (count == 3)
					break;

			}

	}

	public static void main(String[] args) {

		Last3NumDivby3and7 l3nd37 = new Last3NumDivby3and7();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Start Number");
		int a = sc.nextInt();
		System.out.println("Enter end Number");
		int b = sc.nextInt();
		l3nd37.getLast3NumDivby3and7(a, b);
		sc.close();
	}

}

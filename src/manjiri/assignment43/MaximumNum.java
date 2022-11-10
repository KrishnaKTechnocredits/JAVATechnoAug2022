/*Java Program To Find Maximum Number Out of Three Numbers
A = 40, B = 10, C = 120*/

package manjiri.assignment43;

import java.util.Scanner;

public class MaximumNum {
	
	void getMaximumNumber(int num1, int num2, int num3){
		if(num1 >  num2 && num1 > num3) {
			System.out.println("Max Number is:" + num1);
		}
		else if(num2 > num3) {
			System.out.println("Max Number is:" + num2);
		}
		else {
			System.out.println("Max Number is:" + num3);
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 3 numbers of your choice!!!");
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		sc.close();
		
		new MaximumNum().getMaximumNumber(num1, num2, num3);
	}
}

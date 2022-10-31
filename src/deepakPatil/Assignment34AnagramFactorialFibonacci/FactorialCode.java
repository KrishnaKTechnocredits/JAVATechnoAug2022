/*Assignment - 34 : 2nd Oct'2022
Program 2 : Write a method to return factorial of user defined given number (using scanner class).
input : 5
outut : 120
 */

package deepakPatil.Assignment34AnagramFactorialFibonacci;

import java.util.Scanner;

public class FactorialCode {
	
	
	int getFactorial(int num) {
		int factorial=1;
		int tempNum=1;
		while(tempNum<=num) {	
			factorial=factorial*tempNum;
			tempNum++;
		}
		return factorial;
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("Enter the numeber for factorial:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();		
		System.out.println("Factorial of "+num+" is:");
		System.out.println(new FactorialCode().getFactorial(num));
		sc.close();
	}

}

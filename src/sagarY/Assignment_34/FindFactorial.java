/*Program 2 : Write a method to return factorial of user defined given number (using scanner class).
input : 5
outut : 120*/

package sagarY.Assignment_34;
import java.util.Scanner;

public class FindFactorial {
	int factorial=1;
	
	void findFactorial(int num) {
		int num1=1;
		while(num1<=num) {
			System.out.print(num1);
			factorial = factorial*num1;
			num1++;
			if(num1<=5)
				System.out.print("*");
		}
		
		System.out.println("=" +factorial);
	}
	
	public static void main(String[] args) {
		System.out.println("Program 2 : Write a method to return \nfactorial of user defined given number");
		System.out.println("------------------------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number to check its factorial: ");
		int num=sc.nextInt();
		FindFactorial fact =  new FindFactorial();
		System.out.println("=====================================");
		System.out.println("Output: Factorial of "+num+" is");
		fact.findFactorial(num);
		sc.close();
	}

}

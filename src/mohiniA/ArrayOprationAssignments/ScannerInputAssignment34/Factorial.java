/********
 * Program 2 : Write a method to return factorial of user defined given number (using scanner class).
input : 5
output : 120
*******/

package mohiniA.ArrayOprationAssignments.ScannerInputAssignment34;
import java.util.Scanner;
public class Factorial {
	
	int getFactorial(int num) {
		int fact = 1;
		for(int index=1;index<=num;index++) {
			fact = fact * index;
		}
		return fact;
	}
	
	public static void main(String[] args) {
		// Declare Object of Scanner class
		Scanner scanner = new Scanner(System.in);
		
		// UserInput
		System.out.println("Enter number to get factorial of given number:");
		int num = scanner.nextInt();
		
		Factorial factorial = new Factorial();
		int fact = factorial.getFactorial(num);
		System.out.println("Factorial is: "+fact);
		scanner.close();
	}

}

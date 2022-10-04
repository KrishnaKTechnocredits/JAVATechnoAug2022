package sagarY.Assignment_34;
import java.util.Scanner;

public class FindFactorial {
	int factorial=1;
	
	void findFactorial(int num) {

		while(num>0) {
			System.out.print(num+"*");
			factorial = factorial*num;
			num--;
		}
		
		System.out.println("=" +factorial);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check its factorial: ");
		int num=sc.nextInt();
		FindFactorial fact =  new FindFactorial();
		System.out.println("=====================================");
		System.out.println("Output:");
		fact.findFactorial(num);
		sc.close();
	}

}

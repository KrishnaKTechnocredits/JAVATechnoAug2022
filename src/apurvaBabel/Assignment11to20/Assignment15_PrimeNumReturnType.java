/*Assignment - 15 :

1. We need to do sum of first 5 prime number, using return keyword
output: (2 + 3 + 5 + 7 + 11) = 28
*/

package apurvaBabel.Assignment11to20;

public class Assignment15_PrimeNumReturnType {
	int sum = 0;

	int printNPrimeNumbers(int n) {
		int count = 0;
		int num = 2;

		while (count != n) {
			boolean flag = true;
			for (int index = 2; index <= num / 2; index++) {
				if (num % index == 0) {
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.println(num);
				count++;
				sum = sum + num;
			}
			num++;
		}
		return sum;
	}

	public static void main(String[] args) {
		Assignment15_PrimeNumReturnType assignment15 = new Assignment15_PrimeNumReturnType();
		int ans = assignment15.printNPrimeNumbers(5);
		System.out.println("Sum of prime numbers is " + ans);
	}
}
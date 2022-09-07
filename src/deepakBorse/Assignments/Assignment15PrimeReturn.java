/*Assignment - 14 : 5th Sep'2022

1. We need to do sum of first 5 prime number, using return keyword
output: (2 + 3 + 5 + 7 + 11) = 28
*/
package deepakBorse.Assignments;

public class Assignment15PrimeReturn {
	int num = 2;
	static int sum;

	int isPrimeNo(int primecount) {
		int index, countp = 0;

		while (countp != primecount) {
			boolean primeflag = true;
			for (index = 2; index <= num / 2; index++) {
				if (num % index == 0) {
					primeflag = false;
					break;
				}
			}
			if (primeflag == true) {
				System.out.println("Prime Number :" + num);
				sum += num;
				countp++;

			}
			num++;
		}
		return sum;
	}

	public static void main(String[] args) {
		new Assignment15PrimeReturn().isPrimeNo(5);
		System.out.println("Sum of Prime number: " + Assignment15PrimeReturn.sum);
	}

}

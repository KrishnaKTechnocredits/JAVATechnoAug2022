
/*
 * Assignment - 15 :05092022 
 * Return type function

Print sum of first N prime numbers.
N should be passed as parameter in the method.
Hint : 5 pass as parameter, method should print first 5 prime numbers.

sample input : 5
output : First 5 Prime numbers are : 
 			 2
              3
              5
              7
              11
Sum of above Prime numbers is : 28              
 */

package mohiniA.ReturnType;

public class PrimeNumSumReturn {

	static int y;

	int primeNum(int x) {
		int num = 2;
		y = x;
		int count = 0;
		int sum = 0;
		System.out.println("First "+x+" Prime numbers are : ");
		while (num >= 2 && count != x) {
			boolean flag = true;
			for (int index = 2; index <= num / 2; index++) {

				if (num % index == 0) {
					flag = false;
					num++;
					break;
				}
			}
			if (flag == true) {
				count++;
				System.out.println(num);
				sum += num;
				num++;
			}

		}
		return (sum);
	}

	public static void main(String[] args) {
		int sum = new PrimeNumSumReturn().primeNum(5);

		System.out.println("Sum of above Prime numbers is  : " + sum + " and Avrage is  : " + sum / y);

	}

}

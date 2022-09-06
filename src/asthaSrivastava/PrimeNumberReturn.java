/*Assignment - 15 : 5th Sept'2022
Using While loop

Program 1: 
Print first N prime numbers.
N should be passed as parameter in the method.
Hint : 5 pass as parameter, method should print first 5 prime numbers.

sample input : 5
output : (2+3+5+7+11)=28*/

package asthaSrivastava;

public class PrimeNumberReturn {
	static int count = 0;
	static int sum;
	
	boolean isPrimeNumber(int num) {

		boolean flag = true;
		int index = 2;
		while (index <= num / 2) {
			if (num % index == 0) {
				return false;
			}
			index++;
		}
		if (flag)
			
		{
			count++;
			sum = sum + num;
			System.out.println(num);
		}
		return flag;
	}
	
	int primeSum(int n) {
		int num = 2;
		System.out.println("First " + n + " Prime are :");
		while (count != n) {
			isPrimeNumber(num);
			num++;
			
		}
		System.out.println("Sum of Prime Numbers is:");
		return sum;
	}

	public static void main(String[] args) {
		PrimeNumberReturn primeNum = new PrimeNumberReturn();
		primeNum.primeSum(5);
		System.out.println(sum);
		
	}
}


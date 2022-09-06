//We need to do sum of first 5 prime number, using return keyword
//output: (2 + 3 + 5 + 7 + 11) = 28

package komalShrivastava;

public class ReturnSumPrimeNumber {
	
	static int sumOfPrimeNumber(int n) {
		int count = 0;
		int number = 2;
		int sum = 0;
		System.out.println("First " + n + " Prime Numbers are : ");
		while(count<n) {
			boolean flag = true;
			int index = 2;
			while(number > index) {
				if(number%index == 0) {
					flag = false;
					break;
				}
				index++;
			}
			if(flag) {
				sum = sum + number;
				System.out.print(number + " ");
				count++;
			}
			number++;
		}
		return sum;
	}

	public static void main(String[] args) {
		int primeSum = sumOfPrimeNumber(5);
		System.out.println("\nSum of Prime Numbers is : " + primeSum);
	}
}
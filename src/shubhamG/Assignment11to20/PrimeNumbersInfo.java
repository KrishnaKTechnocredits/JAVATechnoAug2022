package shubhamG.Assignment11to20;

/*
 Assignment - 12 : 1st Sep'2022
  Create a class to satisfy below requirements. 
a) Print all the prime numbers between range 100->120. (parameterized method)
    Print total count of prime numbers within same range.
    Print sum of all prime numbers within same range
    Print avg of prime numbers within same range*/

public class PrimeNumbersInfo {
	int count = 0;
	int sum = 0;
	float avg = 0;

	void primeNumber(int num) {
		boolean prime = true;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				prime = false;
				break;
			} else {
				prime = true;
			}
		}
		if (prime == true) {
			System.out.println(num);
			count++;
			sum = sum + num;
		}
	}

	void primeRange(int startIndex, int endIndex) {
		System.out.println("Prime numbers between the range: " + startIndex + " and " + endIndex + " are- ");
		for (int num = startIndex; num <= endIndex; num++) {
			primeNumber(num);
		}
		avg = sum / count;
		System.out.println("\nTotal Count of prime numbers between the range: " + startIndex + " and " + endIndex
				+ " are- " + "\n" + count);
		System.out.println("\nSum of all the prime numbers between the range: " + startIndex + " and " + endIndex
				+ " are- " + "\n" + sum);
		System.out.println("\nAverage of all the prime numbers between the range: " + startIndex + " and " + endIndex
				+ " are- " + "\n" + avg);
	}

	public static void main(String[] args) {
		new PrimeNumbersInfo().primeRange(100, 120);
	}
}

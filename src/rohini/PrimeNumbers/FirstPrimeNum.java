package rohini.PrimeNumbers;
//Assignment 14- Print first N Prime numbers

public class FirstPrimeNum {
	int count;
	void primeNum(int num) {
		boolean flag = true;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				flag = false;
				//break;
			}
		}
		if (flag) {
			count++;
			System.out.println(num);
		}
	}
	void prinFirstPrime(int range) {
		int i = 2;
		System.out.println("First five Prime Numbers are-");
		while (i >= 2 && count!=range) {
			primeNum(i);
			i++;
		}
	}
	public static void main(String[] args) {
		new FirstPrimeNum().prinFirstPrime(6);
	}
}



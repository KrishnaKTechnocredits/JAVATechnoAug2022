package smitaVetal;

public class ReturnPrimeNum {
	
	boolean isPrime(int num) {
		int index = 2;
		boolean flag = true;
		while(index <= Math.sqrt(num)) {
			if (num % index == 0) {
				flag = false;
		}		
		if (flag) {
			count++;
			sum = sum + num;

		}
	}
	void sumOfPrimeNum(int n) {
		int count = 0;
		int sum = 0;
		int num = 2;
		System.out.println("Sum of first " + N + " prime numbers are");
		while (num >= 2 && count < N) {
			boolean flag = getPrimeNum(num);

			num++;
		}
		System.out.println("Sum of first "+ num +" prime numbers is " + sum);
		return num;
	}
	
	public static void main(String[] args) {
		new ReturnPrimeNum().firstPrimeNum(5);
	}
}
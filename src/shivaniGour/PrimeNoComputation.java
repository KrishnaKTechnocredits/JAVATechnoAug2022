package shivaniGour;

public class PrimeNoComputation {
	int countPrime;
    int sum;
    float avg;
	void prime(int num) {
		boolean flag = false;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				flag = true;
				break;
			}
		}
		if (!flag) {
			System.out.println(num + " is a Prime Number");
			sum=sum+num;
			countPrime++;
		}
	}

	void primeRange(int startRange, int endRange) {
		for (int n = startRange; n <= endRange; n++) {
			prime(n);
		}
		avg = (float)sum/countPrime;
		System.out.println("Total number of Prime Numbers: " +countPrime);
		System.out.println("Sum of Prime Numbers: " +sum);
		System.out.println("Average of Prime Numbers: " +avg);	
	}

	public static void main(String[] args) {
		new PrimeNoComputation().primeRange(100, 120);

	}
}

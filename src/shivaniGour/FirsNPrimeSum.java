package shivaniGour;

public class FirsNPrimeSum {
	int sum;

	int PrimeNosSum(int num) {
		int n = 2, count = 1;
		System.out.println("--Sum of First " + num + " Prime Numbers--");
		while (count <= num) {
			if (prime(n) == false) {
				sum = sum + n;
				count++;
			}
			n++;
		}
		return sum;
	}

	boolean prime(int num) {

		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		FirsNPrimeSum sumPrime = new FirsNPrimeSum();
		sumPrime.PrimeNosSum(5);
		System.out.println(sumPrime.sum);
	}
}

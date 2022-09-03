package pujaSah.assignments11_20;

public class MethodsOnPrimeNumber {
	int count = 0;
	boolean flag;
	int sum = 0;

	void checkPrime(int num) {
		flag = true;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				flag = false;
				break;
			}
		}
	}

	void operationsOnPrimeNumbers(int range1, int range2) {
		double avg = 0;
		System.out.println("All prime nos. from " + range1 + " to " + range2 + " are ");
		for (int i = range1; i <= range2; i++) {
			checkPrime(i);
			if (flag == true) {
				System.out.println(i);
				count++;
				sum = sum + i;
			}
		}
		avg = sum / count;
		System.out.println("Count of prime nos from " + range1 + " to " + range2 + " is " + count);
		System.out.println("Sum of prime nos from " + range1 + " to " + range2 + " is " + sum);
		System.out.println("Average of prime nos from " + range1 + " to " + range2 + " is " + avg);

	}

	public static void main(String[] args) {
		MethodsOnPrimeNumber methodsOnPrimeNumber = new MethodsOnPrimeNumber();
		methodsOnPrimeNumber.operationsOnPrimeNumbers(100, 150);
	}
}

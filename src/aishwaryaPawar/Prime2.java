package aishwaryaPawar;

public class Prime2 {
	int count;
	int sum = 0;
	double avg = 0;

	void primeCheck(int num) {
		boolean primeF = true;

		for (int index = 2; index <= num / 2; index++) {
			if (num % index == 0) {
				// System.out.println(num+" is not a Prime Number");
				primeF = false;
				break;
			}

		}
		if (primeF == true) {
			System.out.println(num + " is a Prime number");
			count++;
			sum = sum + num;
		}
	}

	void primeInRange(int startV, int endV) {
		System.out.println("Prime Number between " + (startV) + " : " + (endV) + " is ");
		for (int num = startV; num <= endV; num++) {
			primeCheck(num);
		}

	}

	void primeAvg() {
		avg = sum / count;
		System.out.println("Avarage of primr num : " + avg);
	}

	void display() {
		System.out.println("Total Number of Prime is " + count);
		System.out.println("total Sum of prime number is:" + sum);
	}

	public static void main(String[] arg) {
		Prime2 prime2 = new Prime2();
		prime2.primeInRange(100, 120);
		prime2.display();
		prime2.primeAvg();
	}
}

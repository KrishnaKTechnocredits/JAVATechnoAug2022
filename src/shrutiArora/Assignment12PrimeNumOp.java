package shrutiArora;
public class Assignment12PrimeNumOp {
	int count;
	int sum ;
	int average;

	void checkPrimeNumber(int num) {
		boolean flag = true;
		for (int index = 2; index <= num / 2; index++) {
			if (num % index == 0) {
				flag = false;
				break;
			}
		}
		if (flag == true) {
			System.out.println(num + " is a prime number.");
			count++;
			sum = sum + num;
		}
	}

	void printAllPrimeBetweenRange(int startRange, int endRange) {
		for (int num = startRange; num <= endRange; num++) {
			checkPrimeNumber(num);
		}
		average = sum /count;
		System.out.println("Total prime numbers within range " + startRange + "," + endRange + " are: " +count);
		System.out.println("Sum of all the prime numbers within range " + startRange + "," + endRange + " is: " + sum);
		System.out.println("Average of all the prime numbers within range " + startRange + "," + endRange + " is: " + average);
	}

	public static void main(String[] args) {
		Assignment12PrimeNumOp assignment12PrimeNumOp = new Assignment12PrimeNumOp();
		System.out.println("********************************************************PrimeNumberOperation************************************");
		assignment12PrimeNumOp.printAllPrimeBetweenRange(100, 200);
	}
}
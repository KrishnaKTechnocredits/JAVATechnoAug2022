package deepakBorse.Assignments;

public class Primenumberinter {
	boolean isPrime(int input) {
		boolean isprime = true;
		for (int num = 2; num <= input / 2; num++) {
			if (input % num == 0) {
				return isprime==false;

			}
		}
		return true;
	}

	void printprime(int[] input) {

		for (int index = 0; index < input.length; index++) {
			boolean Prime = isPrime(input[index]);
			if (Prime == true) {
				System.out.println(input[index]);
			}
		}
	}

	public static void main(String[] args) {
		Primenumberinter primenumber = new Primenumberinter();

		int[] input = { 10, 41, 33, 17, 99, 22, 19 };

		primenumber.printprime(input);

	}
}
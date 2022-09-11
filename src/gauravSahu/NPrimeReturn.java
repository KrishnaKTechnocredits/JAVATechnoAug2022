package gauravSahu;

public class NPrimeReturn {

	int count = 0;
	static int sum = 0;

	boolean isprime(int num) {
		boolean flag = true;
		int index = 2;
		while (index <= num / 2) {
			if (num % index == 0) {
				flag = false;
				break;
			}
			index++;
		}
		if (flag) {
			count++;
			sum = sum + num;
		}
		return true;
	}

	int firstNprime(int number) {
		int num = 2;
		System.out.println("Sum of first " + number + " prime number is ");
		while (count < number) {

			isprime(num);
			num++;
		}
		return sum;
	}

	public static void main(String[] args) {
		NPrimeReturn prime = new NPrimeReturn();
		int result = prime.firstNprime(5);
		System.out.println(result);
	}
}

package hindaviIngle;
class PrimeExample5 {

	void isPrime(int num) {
		if (num <=0) {
			System.out.println("Invalid number");
		} else {
			int status = 0;
			for (int index = 2; index <num; index++) {
				if (num % index == 0) {
					System.out.println("Number is not prime " + num);
					status = 1;
					break;
				}
			}

			if (status == 0) {
				System.out.println("Number is prime " + num);
			}
		}
	}

	public static void main(String[] args) {
		PrimeExample5 primeExample = new PrimeExample5();
		primeExample.isPrime(15);
		primeExample.isPrime(17);
		primeExample.isPrime(-90);
	}

}

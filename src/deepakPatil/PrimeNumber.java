package deepakPatil;

/*Assignment - 9 : 26th Aug'2022
Write a program to find given number is prime or not.

input : 15
output : 15 number is not a prime number

input : 17
output : 17 is a prime number

input : -90
output : not a valid number
*/

class PrimeNumber {

	void isPrime(int num) {

		if (num > 0) {
			boolean status = true;
			for (int i = 2; i < Math.sqrt(num); i++) {
				status = true;
				if (num % i == 0) {
					System.out.println(num + " is not a prime number");
					status = false;
					break;
				}
			}
			if (status == true)
				System.out.println(num + " is a prime number");
		} else
			System.out.println("not a valid number");
	}

	public static void main(String[] args) {
		PrimeNumber primeNumber = new PrimeNumber();
		primeNumber.isPrime(15);
		primeNumber.isPrime(17);
		primeNumber.isPrime(-90);
	}
}
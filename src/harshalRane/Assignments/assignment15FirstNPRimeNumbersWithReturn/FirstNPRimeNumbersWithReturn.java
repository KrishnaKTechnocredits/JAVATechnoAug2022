package harshalRane.Assignments.assignment15FirstNPRimeNumbersWithReturn;

/*
Assignment - 15 : 5th Sep'2022
Sum of first 5 prime number, using return keyword
output: (2 + 3 + 5 + 7 + 11) = 28
*/

class FirstNPRimeNumbersWithReturn {
	int count = 0;
	static int sum = 0;

	boolean isPrime(int num) {
		int index = 2;
		boolean flag = true;

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

	int firstNPrime(int number) {
		int num = 2;
		System.out.println("Sum of First " + number + " prime numbers is: ");
		while (count < number) {
			isPrime(num);
			num++;
		}
		return sum;
	}

	public static void main(String[] args) {
		FirstNPRimeNumbersWithReturn obj = new FirstNPRimeNumbersWithReturn();
		int result = obj.firstNPrime(5);
		System.out.println(result);
	}
}

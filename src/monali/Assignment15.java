package monali;

public class Assignment15 {
	

		int count = 0;
		int sum = 0;
		boolean flag = true;

		void findSumOfPrimeNumber(int num) {
			int chknum = 2;

			while (count < num) {
				if (isPrime(chknum) == true) {
					System.out.println(chknum + " is prime number");
					count++;
				}
				chknum++;
				sum += chknum;
			}
			System.out.println("Sum of prime numbers are: " + sum);
		}

		boolean isPrime(int num) {
			for (int index = 2; index <= num / 2; index++) {
				if (num % index == 0) {
					return false;
				}
			}
			return true;
		}

		public static void main(String[] args) {
			new Assignment15().findSumOfPrimeNumber(5);
		}
	}



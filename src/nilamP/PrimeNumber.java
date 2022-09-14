
/*Assignment - 12 : 1st Sep'2022

	Create a class to satisfy below requirements. 
	 a) Print all the prime numbers between range 100->120. (parameterized method)
	     Print total count of prime numbers within same range.
	     Print sum of all prime numbers within same range
	     Print avg of prime numbers within same range*/package nilamP;

public class PrimeNumber {
	
	

	
		int count = 0;
		int sum = 0, avg = 0;
		boolean primeFlag;

		void CheckPrimeNumber(int num) {

			primeFlag = true;
			for (int index = 2; index <= num / 2; index++) {
				if (num % index == 0) {
					primeFlag = false;

					break;
				}
			}
		}

		void printAllPrime(int startNum, int endNum) {
			System.out.println("Following are the Prime Numbers from  " + startNum + " to " + endNum + " : ");
			for (int num = startNum; num <= endNum; num++) {

				CheckPrimeNumber(num);

				if (primeFlag == true) {
					System.out.println(num);
					count++;
					sum = sum + num;
					avg = sum / count;
				}
			}
			System.out.println("The Total Count of Prime Numbers from  " + startNum + " to " + endNum + " : " + count);
			System.out.println("The Sum of Prime Numbers from  " + startNum + " to " + endNum + " : " + sum);
			System.out.println("The Average of prime numbers from  " + startNum + " to " + endNum + " : " + avg);
		}

		public static void main(String[] args) {

			new PrimeNumber().printAllPrime(100, 150);

		}

	}



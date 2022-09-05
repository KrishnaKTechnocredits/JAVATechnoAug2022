//Create a class to satisfy below requirements. 
//a) Print all the prime numbers between range 100->120. (parameterized method)
//   Print total count of prime numbers within same range.
//   Print sum of all prime numbers within same range
//   Print avg of prime numbers within same range

package shridharKumbhar;

public class SKRAssignment12 {

	int countPrime;
	int sumPrime;

	void checkPrimeNo(int num) {

		boolean flagPrime = true;

		for (int index = 2; num > index; index++) {
			if (num % index == 0) {
				flagPrime = false;
				break;
			}
		}
		if (flagPrime == true) {
			System.out.println(num + " is Prime number");
			countPrime++;
			sumPrime = num + sumPrime;
		}
	}

	void primeOperations(int startNum, int endnum) {

		if (startNum < endnum) {
			for (int index1 = startNum; endnum > index1; index1++) {
				checkPrimeNo(index1);
			}
			System.out.println("total num of prime in given range is : " + countPrime);
			System.out.println("Total sum of prime number in given range is : " + sumPrime);
			int avgPrime = (sumPrime / countPrime);
			System.out.println("Average of prime number in given range is : " + avgPrime);
		} else
			System.out.println("Invalid range");
	}

	public static void main(String[] args) {
		SKRAssignment12 sKRAssignment12 = new SKRAssignment12();
		sKRAssignment12.primeOperations(100, 120);
	}

}

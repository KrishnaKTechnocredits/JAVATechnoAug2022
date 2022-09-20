package hardikBhatia.Assignments;

public class Assignment12 {
	int count = 0;
	int sumPrimeNumber = 0;
	void checkNumberPrimeNumber(int number){
		boolean isPrime = true;
		for(int num = 2; num <= number/2; num++) {
			if(number%num == 0) {
				isPrime = false;
			}else {
				count++;
				sumPrimeNumber += number;
			}
		}
	}
	
	void primeNumberList(int startNumber, int endNumber) {
		for(int index = startNumber; index < endNumber; index++) {
			System.out.println(index);
			checkNumberPrimeNumber(index);
		}
		System.out.println("Print total count of prime numbers : " + count);
		System.out.println("Print sum of all prime numbers : " + sumPrimeNumber);
	}
	
	public static void main(String[] args) {
		Assignment12 assignment12 = new Assignment12();
		assignment12.primeNumberList(100,120);
	}
}

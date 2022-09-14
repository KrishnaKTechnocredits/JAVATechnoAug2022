package ashishBramhe;

public class A12_PrimeOperations {
	int sumOfPrimeNumbers, countOfPrimeNumbers;
	double averageOfPrimeNumbers;
	boolean isPrime = true;
	
	void primeOperations(int start, int end) {
		System.out.println("Prime Numbers in range (" + start + "," + end + ") are : ");
		for(int i=start; i<=end; i++) {
			isPrime = true;
			for(int j=2; j<=i/2; j++) {
				if(i%j == 0) {
					isPrime = false;
					break;
				}					
			}
			if(isPrime == true) {
				System.out.println(i);
				sumOfPrimeNumbers+=i;
				countOfPrimeNumbers++;
			}
		}
		averageOfPrimeNumbers = (double)sumOfPrimeNumbers / countOfPrimeNumbers;
		System.out.println("Total Prime Numbers in range (" + start + "," + end + "): " + countOfPrimeNumbers);
		System.out.println("Sum Of Prime Numbers in range (" + start + "," + end + "): " + sumOfPrimeNumbers);
		System.out.println("Average Of Prime Numbers in range (" + start + "," + end + "): " + averageOfPrimeNumbers);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A12_PrimeOperations primeOperations = new A12_PrimeOperations();
		primeOperations.primeOperations(100, 120);		
	}
}

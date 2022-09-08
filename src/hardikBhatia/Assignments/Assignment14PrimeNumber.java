package hardikBhatia.Assignments;

public class Assignment14PrimeNumber {
	int count = 0;
	boolean isPrime = true;
	int number = 2;
	void isPrimeNumber(int number) {
		for(int index=2;index<=number/2;index++){
			if(number%index==0){
				isPrime = false;
				number++;
			}	
		}
	}
	void printPrimeNumber(int limit) {
		while(count<limit) {
			isPrimeNumber(number);
			if(isPrime) {
			  System.out.println(number);
			  count++;
			  number++;
			}else {
				number++;
				isPrime = true;
			}
		}
		
	}
	public static void main(String[] args) {
		Assignment14PrimeNumber assignment14PrimeNumber = new Assignment14PrimeNumber();
		assignment14PrimeNumber.printPrimeNumber(5);
	}
}

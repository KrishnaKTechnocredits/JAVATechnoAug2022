/*Program 1: 
Print first N prime numbers.
N should be passed as parameter in the method.
Hint : 5 pass as parameter, method should print first 5 prime numbers.
sample input : 5
output : 2
              3
              5
              7
              11*/
package vinod.Assignment;

public class Assignment14 {
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
		Assignment14 assignment14 = new Assignment14();
		assignment14.printPrimeNumber(5);
	}
}




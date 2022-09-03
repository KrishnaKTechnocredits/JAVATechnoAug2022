/*Assignment - 14 : 2nd Sep'2022
Using While loop

Program 1: 
Print first N prime numbers.
N should be passed as parameter in the method.
Hint : 5 pass as parameter, method should print first 5 prime numbers.

sample input : 5
output : 2
              3
              5
              7
              11*/
package adittyThakare.basicconcepts;

public class PrimeNumbersWhileLoop {
	boolean primeFlag=true;
	
	void getPrimeNumbers(int number) {
		int primeCount=1;
		int num=2;
		while(primeCount<=number) {
			if(isPrime(num)==true) {
				System.out.println(num);
				primeCount++;
			}
			num++;
		}
	}
	
	 boolean isPrime(int number) {
		for(int index=2;index<=number/2;index++){
			if(number%index==0){
				return false;
			}	
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNumbersWhileLoop primeNumberWhileLoop = new PrimeNumbersWhileLoop();
		primeNumberWhileLoop.getPrimeNumbers(5);
	}

}

/*Assignment - 15 : 5th Sep'2022

1. We need to do sum of first 5 prime number, using return keyword
output: (2 + 3 + 5 + 7 + 11) = 28*/
package adittyThakare.basicconcepts;

public class SumOfPrimeNumbers {
	boolean primeFlag=true;
	int primeSum;
	
	int getPrimeNumbersAddition(int number) {
		int primeCount=1;
		int num=2;
		while(primeCount<=number) {
			if(isPrime(num)==true) {
				primeCount++;
				primeSum = primeSum + num;
			}
			num++;
		}
		return primeSum;
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
		SumOfPrimeNumbers sum1 = new SumOfPrimeNumbers();
		
		int inputNumber=5, inputNumber1=15;

		System.out.println("Addition of first "+inputNumber+" prime numbers is : "+sum1.getPrimeNumbersAddition(inputNumber));
		System.out.println("Addition of first "+inputNumber1+" prime numbers is : "+sum1.getPrimeNumbersAddition(inputNumber1));
	}

}

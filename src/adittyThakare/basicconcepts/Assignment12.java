/*Assignment - 12 : 1st Sep'2022

Create a class to satisfy below requirements. 
 a) Print all the prime numbers between range 100->120. (parameterized method)
     Print total count of prime numbers within same range.
     Print sum of all prime numbers within same range
     Print avg of prime numbers within same range
*/
package adittyThakare.basicconcepts;

public class Assignment12 {
	int primeCount, primeAddition, primeAverage;
	
	void checkPrimeNum(int number) {
		boolean primeFlag = true;
		
		for(int index=2;index<=number/2;index++) {
			if(number%index==0) {
				primeFlag=false;
				break;
			}
		}
		if(primeFlag==true) {
			System.out.println(number);
			primeCount++;
			primeAddition =  primeAddition + number;
			primeAverage = primeAverage + primeAddition;
		}
	}
	
	void checkPrimeNumberInRange(int startIndex, int endIndex) {
		
		System.out.println("Prime numbers between range "+startIndex+" to "+endIndex+" :");
		for(int index=startIndex;index<endIndex;index++) {
			checkPrimeNum(index);	
		}
		System.out.println("\nPrime number count: "+primeCount);
		System.out.println("\nPrime number addition: "+primeAddition);
		System.out.println("\nPrime number average: "+primeAverage);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment12 assignment12 = new Assignment12();
		assignment12.checkPrimeNumberInRange(100, 120);

	}

}

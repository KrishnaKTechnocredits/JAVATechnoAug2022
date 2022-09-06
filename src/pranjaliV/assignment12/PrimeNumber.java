/*Assignment - 12 : 1st Sep'2022

Create a class to satisfy below requirements. 
 a) Print all the prime numbers between range 100->120. (parameterized method)
     Print total count of prime numbers within same range.
     Print sum of all prime numbers within same range
     Print avg of prime numbers within same range*/

package pranjaliV.assignment12;

public class PrimeNumber {
	int count = 0;
	int sum = 0;
	int average = 0;
	
	void isPrime(int num) {
		boolean flag = true;
		for(int index=2; index<=num/2; index++) {
			if(num%index==0) {
				//System.out.println(num + " is not a Prime Number");
				flag = false;
				break;
			}
		}
		if (flag == true) {
			System.out.println(num + " is a Prime Number");
			count++;
			sum = sum + num;
			average = (sum/count) ;
		}
	}
	
	void isPrimeRange(int start, int end) {
		System.out.println("Prime Numbers between "+start+" and "+end+" are: ");
		for (int index=start; index<=end; index++) {
			isPrime(index);
		}
	}
	
	void primeDisplay(){
		System.out.println("Total number of Prime Numbers within the given range are: " + count);
		System.out.println("Sum of Prime Numbers within the given range is: " + sum);
		System.out.println("Average of Prime Numbers within the given range is: " + average);
	}

	public static void main(String[] args) {
		PrimeNumber primenum = new PrimeNumber();
		primenum.isPrimeRange(10,20);
		primenum.primeDisplay();
	}

}

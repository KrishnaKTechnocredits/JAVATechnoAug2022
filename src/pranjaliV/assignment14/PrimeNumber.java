/*Assignment - 14 : 2nd Sep'2022*
Using While loop

*Program 1: *
Print first N prime numbers.
N should be passed as parameter in the method.
Hint : 5 pass as parameter, method should print first 5 prime numbers.

sample input : 5
output : 2
              3
              5
              7
              11*/
              
package pranjaliV.assignment14;

public class PrimeNumber {
	
	void primeRange(int n) {
		int i=1;//to define the while range
		int num=2;//to check if the number is prime
		System.out.println("First "+n+" Prime Numbers are: ");
		while(i<=n) {
			boolean flag = true;
			for(int index=2; index<=num/2; index++) {
				if (num%index ==0) {
					flag = false;
					break;
				}			
			}
			if(flag==true) {
				System.out.println(num);
				i++;
			}
			num++;
		}
	}
	
	public static void main(String[] args) {
		PrimeNumber primeNumber = new PrimeNumber();
		primeNumber.primeRange(5);
	}
}

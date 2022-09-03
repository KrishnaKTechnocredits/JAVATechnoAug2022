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

package harshadaJagtap;

public class FindPrime {
	
	void findFirstPrime(int range) {
		int count=1;
		int a=2;	
	
		while(count<=range) {
			boolean primeFlag=true;
			
			for(int index=2; index<=a/2; index++) {
				if(a%index==0) {
					primeFlag=false;
					break;
				}
			}
			if (primeFlag==true) {
				System.out.println(a + " is a prime number");
				count++;	
			}
			a++;
		}	
	}
	  public static void main(String[] args) {
		  FindPrime findPrime=new FindPrime();
		  findPrime.findFirstPrime(5);
	}

	
}

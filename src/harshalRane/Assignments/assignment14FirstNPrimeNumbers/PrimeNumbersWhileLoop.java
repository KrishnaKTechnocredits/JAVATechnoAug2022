/*
 * Assignment - 14 : 2nd Sep'2022
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
              11
 */
package harshalRane.Assignments.assignment14FirstNPrimeNumbers;

class PrimeNumbersWhileLoop
{
	int count;
	void primeNumbers(int num)
	{
		boolean flag=true;
		for(int index=2;index<=num/2;index++){
			if(num%index==0){
				flag=false;
				break;
			}
		}
		if(flag==true){
			count++;
			System.out.println(num);
		}
	}
	
	void printFirstFive(int iteration){
		int num=2;
		System.out.println("First Five Prime Numbers are:");
		
		while(num>=2 && count !=iteration){
			primeNumbers(num);
			num++;
		}
	}
	
	public static void main(String[] args){
		new PrimeNumbersWhileLoop().printFirstFive(5);
	}
}
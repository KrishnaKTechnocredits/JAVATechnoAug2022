/*
 Write a method to return sum of all non prime numbers 
and should be divisible by 5 & 7 from given array.
input : {11,35,17,105,44}
output : 140
Hint : (35+105 = 28)

 */
package jagruti.Assignment20;

public class SumOfNonPrimeNumbersDivBy5and7 
{
	int getSumOfNotPrimeNumbers(int[] number)
	{
		int sum = 0;
		for (int index=0; index<number.length;index++)
		{
			boolean flag = isPrime(number[index]);
			if(flag==false)
			{
				if ((number[index]%5==0) && (number[index]%7==0))
				sum = sum + number[index];
			}						
		}
		return sum;
	}
	static boolean isPrime(int number) 
	{
		boolean flag = true;
		for(int index = 2; index < number /2; index++)
		{
			if(number%index==0)
			{
				flag = false;		
				break;
			}
			else
			{
				flag = true;				
			}
		}
		return flag;
	}
		public static void main(String[] args)
		{
			SumOfNonPrimeNumbersDivBy5and7 sumOfnotPrimeNumbersArra = new SumOfNonPrimeNumbersDivBy5and7();
			int[] number = { 11,35,17,105,44 };
			System.out.println();
			System.out.println("Sum of Non Prime Numbers divsible by 5 and 7 is: " +sumOfnotPrimeNumbersArra.getSumOfNotPrimeNumbers(number));
		}
}

/*1) Write a method to return sum of all not prime numbers from given array.
input : {11,13,17,22,44}
output : 66
Hint : (22+44 = 66)
 */
package jagruti.Assignment20;

public class SumOfNotPrimeNumbers 
{
	int getSumOfNotPrimeNumbers(int[] number)
	{
		int sum = 0;
		for (int index=0; index<number.length;index++)
		{
			boolean flag = isPrime(number[index]);
			if(flag==false)
			{
				System.out.println(number[index]);
				sum = sum + number[index];
			}						
		}
		return sum;
	}
	boolean isPrime(int number) 
	{
		boolean flag = true;
		for(int index = 2; index < number /2; index++)
		{
			if(number%2==0)
			{
				flag = false;				
			}
			else
			{
				flag = true;
				break;
			}
		}
		return flag;
	}
		public static void main(String[] args)
		{
			SumOfNotPrimeNumbers sumOfnotPrimeNumbersArra = new SumOfNotPrimeNumbers();
			int[] number = { 11, 13, 17, 22, 44 };
			System.out.println();
			System.out.println("Sum of Non Prime Numbers is: " +sumOfnotPrimeNumbersArra.getSumOfNotPrimeNumbers(number));
		}
}

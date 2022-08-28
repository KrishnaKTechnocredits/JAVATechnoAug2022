/* Assignment - 9 : 26th Aug'2022
Write a program to find given number is prime or not.

input : 15
output : 15 number is not a prime number

input : 17
output : 17 is a prime number

input : -90
output : not a valid number*/

package chaitanyaMankar;
class PrimeNumber
{
	void isPrime(int num)
	{
	boolean status = true;
	if(num>0)
		{
		for(int i=2;i<num/2;i++)
		{
			if(num%i==0)
			{
				System.out.println(num+" Number is not a Prime Number");
				status = false;
				break;
			}
		}
		if(status == true)
			{
				System.out.println(num+" Number is a Prime number");
			}
		}
	else
		{
			System.out.println(num+" Invalid Number");
		}	
	}
	
	public static void main(String[] args)
	{
		PrimeNumber prime_number = new PrimeNumber();
		prime_number.isPrime(15);
		prime_number.isPrime(17);
		prime_number.isPrime(-90);
	}
}
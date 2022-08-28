/*Assignment - 9 : 26th Aug'2022
Write a program to find given number is prime or not.
input : 15
output : 15 number is not a prime number
input : 17
output : 17 is a prime number
input : -90
output : not a valid number*/
package jagruti;
class PrimeNumber
{
	void numIsPrime(int number) 
	{	
		boolean count =  false;
		if(number>1)
		{
			
			for(int index=2; index<=number/2; index++)
			{
				if(number%index==0)
				{	
					count=true;					
					System.out.println(" "+number+ " : is not a prime number.");
					break;										
				}	
					
			}	
			if(count==false)
			{
				System.out.println(" "+number+" : is a prime number.");
			}
		}
		else
		{
			System.out.println(" "+number+" : is not a valid number");
		}
	}
	public static void main (String[] ars)
	{
		PrimeNumber primeNumber = new PrimeNumber();
		primeNumber.numIsPrime(15);
		primeNumber.numIsPrime(17);
		primeNumber.numIsPrime(-90);
	}
	
}


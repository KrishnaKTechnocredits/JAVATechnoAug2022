package jagruti.Assignmen19;
public class SumOfPrimeNumbersArra 
{
	int getSumOfPrimeNumbers(int[] number)
	{
		int sum = 0;
		for (int index=0; index<number.length;index++)
		{
			boolean flag = isPrime(number[index]);
			if(flag==true)
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
		SumOfPrimeNumbersArra sumOfPrimeNumbersArra = new SumOfPrimeNumbersArra();
		int[] number = { 11, 14, 17, 22, 44 };
		System.out.println();
		System.out.println("Sum of Prime Numbers is: " +sumOfPrimeNumbersArra.getSumOfPrimeNumbers(number));
	}
}

package nehaniG;

class PrimeNumberCheck 
{
	int count = 0;
	void isPrimeNumber(int number)
	{
		 boolean flag = true;
		 
		 for(int index=2;index<=number/2;index++)
		 {
			 if(number%index == 0)
			 {
				 flag = false;
				 break;
			 }
		 }
        if (flag==true)
        {
        	count++;
			System.out.println(number + " is a prime number");
        }
	}
	
	void findPrimeNumberForGivenInput(int iteration)
	{
		int number = 2;
		while(number >= 2 && count!=iteration)
		{
			isPrimeNumber(number);
			++number;
		}
	}

	public static void main(String[] args)
	{	
		PrimeNumberCheck primeNumber = new PrimeNumberCheck();
		primeNumber.findPrimeNumberForGivenInput(5);		
	}
}

	
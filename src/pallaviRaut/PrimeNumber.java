package pallaviRaut;
class PrimeNumber{
	void isPrimeNumber(int num)
	{
		if (num>=0)
		{
			boolean status=true;	
			for (int i=2; i<=num/2;i++)
			{
				if (num%i==0)
				{
					System.out.println(num+ " is not a prime number");
					status=false;
					break;
				}
			}
			if(num==0 || num==1)
			{
				System.out.println(num+ " is not prime number or composite number");
			}
			else
			{	
				if (status==true)	
				{
					System.out.println(num+" is a prime number.");
				}	
			}
		}	
		else 
		{
			System.out.println(num+ " is Invalid number");
		}	
	}	

	public static void main(String[] args)
	{
		PrimeNumber primeNum= new PrimeNumber();
		primeNum.isPrimeNumber(22);
		primeNum.isPrimeNumber(2);
		primeNum.isPrimeNumber(1);
		primeNum.isPrimeNumber(17);
		primeNum.isPrimeNumber(-41);
		primeNum.isPrimeNumber(0);
		
	}
}
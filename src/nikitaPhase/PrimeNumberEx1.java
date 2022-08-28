package nikitaPhase;
class PrimeNumberEx1
{
	
	
	void isPrime (int num)
	{
		boolean status = true;
		
		if (num>0)
		{
			for(int index=2; index<=Math.sqrt(num); index++)
			{
				if(num%index == 0)
				{
					System.out.println(num +" is a not a prime number.");
				    status = false;
					break;
				}
			}
		if (status == true)
			{
				System.out.println(num +" is a prime number.");
			}
		
		}else{
				System.out.println(num +" Invalid number.");
		}
	}
		
	public static void main(String args[]){
		PrimeNumberEx1 primeNumber = new PrimeNumberEx1();
		primeNumber.isPrime(15);
		primeNumber.isPrime(17);
		primeNumber.isPrime(90);
		primeNumber.isPrime(121);
	}
}	
	
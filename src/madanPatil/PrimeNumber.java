
package madanPatil;

	class PrimeNumber{
	
	void prime (int num)
	{
		if (num>0)
		{ 
			boolean status = true;
			for(int index=2; index<=num/2;index++)
			{
				if (num%index==0)
				{
				System.out.println(num + "It is not PrimeNumber");
				status = false;
				break;
				}
			}
		
		if(status == true)
		{
			System.out.println(num + "It is PrimeNumber");
		}
		}
		else
		{
			System.out.println(num + "It is not Valied number");
		}
	}
			
		public static void main(String[]args)
		{
			PrimeNumber primenumber = new PrimeNumber();
			primenumber.prime(15);
			primenumber.prime(17);
			primenumber.prime(-90);
		}
		
	}
	
	
	
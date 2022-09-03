package chaitanyaMankar;

public class NprimeNumber 
{
	void nPrime(int n)
	{	 		
		int count = 0;
		int num = 2;
		
		System.out.println("First "+num+" Prime Numbers: ");
		
		while(count!=n)
		{
			boolean status = true;
			for(int index=2;index<=num/2;index++)
			{
				if(num%index==0)
					{
						status = false;
						break;
				
					}
			}
		
		if(status == true)
			{
				System.out.println(num+" Number is a Prime number");
				count++;
			}
		num++;
		}
	}
	
	public static void main(String[] args) 
	{
		NprimeNumber nprime = new NprimeNumber();
		nprime.nPrime(5);
	}

}

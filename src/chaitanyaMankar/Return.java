package chaitanyaMankar;

public class Return 
{
	static int nPrime(int n)
	{	 		
		int count = 0;
		int sum = 0;
		int num = 2;
		
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
				count++;
				System.out.println("Prime Number: "+num);
				sum = sum + num;
			}
		num++;
		}
		return sum;
	}

	public static void main(String[] args) 
	{
		int s = nPrime(5);
		System.out.println("Addition of Prime Number "+s);
	}

}

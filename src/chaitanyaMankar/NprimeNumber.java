package chaitanyaMankar;

public class NprimeNumber 
{

	void nPrime(int num)
	{	
		int count = 0;
		System.out.println("First "+num+" Prime Numbers: ");
		for(int i=0;;i++)
		{
			if(i%2!=0)
			{
				System.out.println(i);
				count++;
			}
			if(count==num)
			{
				break;
			}
		}
	}
	public static void main(String[] args) 
	{
		NprimeNumber nprime = new NprimeNumber();
		nprime.nPrime(5);
	}

}

package titikshaG;

public class Primenumber
{
	int count=0;
	void start5Number(int num)
		{
			boolean primeFlag=true;
			for(int index=2;index<=num/2;index++)
			{
				if(num%index==0)
				{
				primeFlag=false;
				break;				
				}
			}
			if (primeFlag==true)
				{
				count++;
				System.out.println(num +" "+"Number is prime");	
				}
		}
	
	void printPrimeNumber(int iteration)
		{
		int num=2;
		while(num>=2 && count!=iteration)
			{
			start5Number(num);
			++num;
			}
		}
	public static void main(String[] a)
	{
		Primenumber primenumber=new Primenumber();
		primenumber.printPrimeNumber(5);
	}
}

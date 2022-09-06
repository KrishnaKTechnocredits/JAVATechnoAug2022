package titikshaG;

public class Prime
{
int count;
int sum;
int average;
	void checkPrime(int num)
	{
			boolean primeFlag=true;
			for(int index=2;index<=num/2;index++)
					if(num%index==0)
					{
						primeFlag=false;
						break;
					}
					if(primeFlag==true)
					{
						System.out.println(num +" "+ "is a prime number");
					}
				count++;
				sum=sum + num;
				average= sum/count;
	}
	void printPrime(int start,int end)
	{
		for (int num=start;num<=end;num++)
		{
			checkPrime(num);
		}
	}
	void display()
		{
			System.out.println(count +" "+ "is count of Prime numbers");
			System.out.println(sum +" "+ "is sum of Prime numbers");
			System.out.println(average +" "+ "is average of Prime numbers");	
		}
		
	public static void main(String[] a)
		{
		Prime prime=new Prime();
			prime.printPrime(100,120);
			prime.display();
		}
}

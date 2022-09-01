/*Assignment - 12 : 1st Sep'2022

Create a class to satisfy below requirements. 
 a) Print all the prime numbers between range 100->120. (parameterized method)
     Print total count of prime numbers within same range.
     Print sum of all prime numbers within same range
     Print avg of prime numbers within same range*/
package chaitanyaMankar;

public class PrimeNumberWithMethods 
{
	int count=0;
	int sum;
	void primeNumber(int num)
	{
		
		boolean primeFlag = true;
		for(int i=2;i<=num/2;i++)
		{
			if(num%2==0)
			{
				primeFlag= false;
				break;
			}
		}
		if(primeFlag==true)
		{
			System.out.println("PrimeNumer:"+num);
			count++;
			sum=sum+num;
		}
	}
	
	void primeRange(int sRange,int eRange)
	{
		for(int i=sRange;i<=eRange;i++)
		{
			primeNumber(i);
		}
	}
	
	void summary()
	{
		System.out.println("");
		System.out.println("Total Prime Number: " +count);
		System.out.println("Sum of Prime Number: "+sum);
		System.out.println("Average of Prime Number: "+(sum/count));
	}
	
	public static void main(String[] args) 
	{
	PrimeNumberWithMethods primenumber = new PrimeNumberWithMethods();
	primenumber.primeRange(100, 120);
	primenumber.summary();
	}

}

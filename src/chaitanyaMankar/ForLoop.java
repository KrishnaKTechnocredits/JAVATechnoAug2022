/*Assignment - 7 : 25th Aug'2022
Write only one program having the following methods. [7 methods in same program] 

1. On user define range (parameterized method) print all even numbers. 
Hint : pass start and end index as a parameter.
Input : Range -> 10 to 15
Output : Even numbers are:
		 10
		 12
		 14	

2. On user define range print all numbers which is divisible by 5. 
Hint : pass start and end index as a parameter.
Input : Range -> 10 to 30
Output : Divisible by 5, numbers are:
		 10
		 15
		 20
		 25
		 30	

3. On user define range print all numbers which is divisible by 5 and divisible by 3. 
Hint : pass start and end index as a parameter.
Input : Range -> 5 to 18
Output : Divisible by 5 & 3, numbers are:
		 15

4. On user define range print all numbers which is divisible by 7 or 13. 
Hint : pass start and end index as a parameter.
Input : Range -> 5 to 40
Output : Divisible by 7 or 13, numbers are:
		 7 is divisible by 7
		 13 is divisible by 13
		 14 is divisible by 7
		 21 is divisible by 7
		 26 is divisible by 13
		 28 is divisible by 7
		 35 is divisible by 7
		 39 is divisible by 13
		 
5. Find sum of all the numbers in user define range.
Input : Range -> 1 to 5
output : sum is 15

6. Find difference between sum of odd numbers and even numbers in a given range
Input : Range -> 3 to 9
output : 6
hint : (3+5+7+9) - (4+6+8) = 6
       
7. Print only odd numbers in reverse order.
Input : Range -> 10 to 20
output : 19
         17
         15
         13
         11*/
package chaitanyaMankar;
class ForLoop
{
	void processDivisibility1(int svalue,int evalue)
	{	System.out.println("Even Numbers are:");
		for(int i=svalue;i<=evalue;i++)
		{
			if(i%2==0)
			{
				System.out.println(+i);
			}
		}
		
	}
	
	void processDivisibility2(int svalue, int evalue)
	{   System.out.println("Number divisible by 5 are:");
		for(int i=svalue;i<=evalue;i++)
		{
			if(i%5==0)
			System.out.println(i);
		}
	}
	
	void processDivisibility3(int svalue, int evalue)
	{   System.out.println("Number divisible by 3 & 5 are:");			
		for(int i=svalue;i<=evalue;i++)
		{
			if(i%5==0 && i%3==0)
			{
				System.out.println(i);				
			}
		}
	}
	
	void processDivisibility4(int svalue, int evalue)
	{
		for(int i=svalue;i<=evalue;i++)
		{
			if(i%7==0)
			{
				System.out.println(i+ "Number divisible by 7:");
			}
			else if(i%13==0)
			{
				System.out.println(i+ "Number divisible by 13:");
			}
		}
	}
	
	void processDivisibility5(int svalue, int evalue)
	{
		int sum = 0;
		for(int i=svalue;i<=evalue;i++)
		{
			sum = i + sum;	
		}
		System.out.println("Sum is "+sum);
	}
	
	void processDivisibility6(int svalue, int evalue)
	{
		int sume = 0;
		int sumo = 0;
		int total;
		for(int i=svalue;i<=evalue;i++)
		{
			if(i%2==0)
			{
				sume =  sume +i;
			}
			else
			{
				sumo = sumo +i;
			}
		}
	
		System.out.println("Total:"+""+(sumo-sume));
	}
	
	void processDivisibility7(int svalue, int evalue)
	{
		for(int i=evalue;i>=svalue;i--)					
		{
			if(i%2!=0)
			{
				System.out.println("Odd Numbers are:"+""+i);
			}
		}
	}

	public static void main(String[] args)
	{
		ForLoop For_Loop = new ForLoop();
		For_Loop.processDivisibility1(10,15);
		For_Loop.processDivisibility2(10,30);
		For_Loop.processDivisibility3(5,18);
		For_Loop.processDivisibility4(5,40);
		For_Loop.processDivisibility5(1,5);
		For_Loop.processDivisibility6(3,9);
		For_Loop.processDivisibility7(10,20);
	}
}
package pallaviRaut;
/* Assignment - 7 : 25th Aug'2022
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
		 
class LoopExample1
{
	void evenNumbers(int startNum, int endNum)
	{
		System.out.println("Even numbers between "+startNum+ " and " +endNum+ " are : ");
		for( int index=startNum; index<=endNum; index++)
		{
			if(index%2==0)
			{
				System.out.println(+index);
			}	
		}
		System.out.println("--------------------------------");
	}

    void numDivisibleBy5(int startNum, int endNum)
	{
		System.out.println("Numbers divisible by 5 between "+startNum+ " and " +endNum+ " : ");
		for ( int index=startNum; index<=endNum; index++)
		{
			if(index%5==0)
			{
				System.out.println(+index);
			}	
		}
		System.out.println("--------------------------------");
	}		
	
	void numDivisibleBy5and3(int startNum, int endNum)
	{
		System.out.println("Numbers divisible by 5 and 3 between "+startNum+ " and " +endNum+ " : ");
		for ( int index=startNum; index<=endNum; index++)
		{
			if(index%5==0 && index%3==0)
			{
				System.out.println(+index);
			}	
		}
		System.out.println("--------------------------------");
	}		
	
	void numDivisibleBy7or13(int startNum, int endNum)
	{
		System.out.println("Divisible by " +startNum+ " or " +endNum+ ", numbers are: ");
		for ( int index=startNum; index<=endNum; index++)
		{
			if(index%7==0)
			{
				System.out.println(index+" is divisible by 7");
			}	
			else if(index%13==0)
			{
				System.out.println(index+" is divisible by 13");
			}		
		}
		System.out.println("--------------------------------");
	}
	
	void sumNum(int startNum, int endNum)
	{
		int sum=0;
		System.out.println("Sum of all the numbers between " +startNum+ " and " +endNum+ "is : ");
		for ( int index=startNum; index<=endNum; index++)
		{
			sum+=index;
		}
		System.out.println(+sum);
		System.out.println("--------------------------------");
	}
	
	void diffOffSumOddAndEvenNum(int startNum, int endNum)
	{
		int evenSum=0;
		int oddSum=0;
		
		for ( int index=startNum; index<=endNum; index++)
		{
			if( index%2==0)
			{
				evenSum+=index;
			}	
			else{
				oddSum+=index;
			}
		}	
		System.out.println("Difference of Sum of Odd and Even numbers between " +startNum+ " and " +endNum+ " : "+(oddSum-evenSum));
		System.out.println("--------------------------------");
	}	
	
	void reverseOddNum(int startNum, int endNum)
	{
		System.out.println("Odd numbers in reverse order between range " +startNum+ " and " +endNum+ " : ");
		for ( int index=endNum; index>=startNum; index--)
		{
			if( index%2!=0)
			{
				System.out.println(index);
			}	
		}	
		System.out.println("--------------------------------");
	}	
			
		
	public static void main(String[] args)
	{
		LoopExample1 loopExample1=new LoopExample1();
		loopExample1.evenNumbers(10,15);
		loopExample1.numDivisibleBy5(10,30);
		loopExample1.numDivisibleBy5and3(5,18);
		loopExample1.numDivisibleBy7or13(5,40);
		loopExample1.sumNum(1,5);
		loopExample1.diffOffSumOddAndEvenNum(3,9);
		loopExample1.reverseOddNum(10,20);
	}	
}

		 
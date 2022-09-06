package harshalRane.Assignments.assignment6and7MethodsInSameProgram;

class Assignment7{
	void evenNumbers(int startIndex, int endIndex)
	{
		System.out.println("Even numbers are:");
		for(int evenNum=startIndex;evenNum<=endIndex;evenNum++)
		{
			if(evenNum%2==0)
			{
			System.out.println("     " +evenNum);
			}
		}
	}
	
	void divisibleNumbers(int startIndex, int endIndex)
	{
		System.out.println("\nDivisible by 5, numbers are:");
		for(int divisibleNum=startIndex;divisibleNum<=endIndex;divisibleNum++)
		{
			if(divisibleNum%5==0)
			{
			System.out.println("     " +divisibleNum);
			}
		}
	}
	
	void divisibleNumbers1(int startIndex, int endIndex)
	{
		System.out.println("\nDivisible by 5 & 3, numbers are:");
		for(int divisibleNum=startIndex;divisibleNum<=endIndex;divisibleNum++)
		{
			if(divisibleNum%5==0 && divisibleNum%3==0)
			{
			System.out.println("     " +divisibleNum);
			}
		}
	}
	
	/*void divisibleNumbers2(int startIndex, int endIndex)
	{
		System.out.println("\nDivisible by 7 or 13, numbers are:");
		for(int divisibleNum=startIndex;divisibleNum<=endIndex;divisibleNum++)
		{
			if(divisibleNum%7==0 || divisibleNum%13==0)
			{
			System.out.println("     " +divisibleNum + " is divisible by " + divisibleNum);
			}
		}
	} */
	
	void divisibleNumbers2(int startIndex, int endIndex)
	{
		for(int divisibleNum=startIndex;divisibleNum<=endIndex;divisibleNum++)
		{
			if(divisibleNum%7==0)
			{
				System.out.println("     " +divisibleNum + " is divisible by " + divisibleNum);
			}
			if(divisibleNum%13==0)
			{
				System.out.println("     " +divisibleNum + " is divisible by " + divisibleNum);
			}
		}
	} 
	
	void sumNum(int startIndex, int endIndex)
	{	
		int sum = 0;
		for(int num=startIndex;num<=endIndex;num++)
		{
			sum = sum + num;
		}
		System.out.println("\nSum is:" +sum);
	}
	
	void difference(int startIndex, int endIndex)
	{
		int even=0;
		int odd=0;
		int difference=0;
		for(int num=startIndex;num<=endIndex;num++)
		{
			if(num%2==0){
				even = even + num;
			}else if(num%2==1){
				odd = odd + num;
			}
			difference = odd - even;
		}
		System.out.println("\nDifference between sum of odd and even numbers:" +difference);
	}
	
	void oddNumbersReverse(int startRange, int endRange)
	{
		System.out.println("\nOdd numbers in reverse order are:");
		for(int oddNum=endRange;oddNum>=startRange;oddNum--)
		{
			if(oddNum%2==1)
			{
			System.out.println("     " +oddNum);
			}
		}
	}
	
	public static void main(String[] args){
		Assignment7 assignment7 = new Assignment7();
		assignment7.evenNumbers(10,15);
		assignment7.divisibleNumbers(10,30);
		assignment7.divisibleNumbers1(5,18);
		assignment7.divisibleNumbers2(5,40);
		assignment7.sumNum(1,5);
		assignment7.difference(3,9);
		assignment7.oddNumbersReverse(10,20);
	}
}
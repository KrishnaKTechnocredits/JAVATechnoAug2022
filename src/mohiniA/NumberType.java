package mohiniA;

class NumberType{

	void evenNumber(int startRange , int endRange)
	{
		System.out.println("Even numbers out of range given are :");
		for (;startRange<=endRange ;startRange++)
		{
			if (startRange%2 ==0)
			System.out.println(startRange);
		}
	}
	
	void divFive(int startRange , int endRange)
	{
		System.out.println("Numbers divisible by 5 out of range given are :");
		for (;startRange<=endRange ;startRange++)
		{
			if (startRange%5 ==0)
			System.out.println(startRange);
		}
	}
	
	void divFiveThree(int startRange , int endRange)
	{
		System.out.println("Numbers divisible by 5 and 3 out of range given are :");
		for (;startRange<=endRange ;startRange++)
		{
			if (startRange%5 ==0 && startRange%3 ==0)
			System.out.println(startRange);
		}
	}
	
	void divSevenThirteen(int startRange , int endRange)
	{
		System.out.println("Numbers divisible by 7 or 13 out of range given are :");
		for (;startRange<=endRange ;startRange++)
		{
			if (startRange%7 ==0 )
				System.out.println(startRange + " is divisible by 7" );
			if (startRange%13 ==0)
				System.out.println(startRange + " is divisible by 13" );
		}
	}
	
	void sumRange(int startRange , int endRange)
	{
		int sum =0;
		for (;startRange<=endRange ;startRange++)
		{
			sum = sum+startRange;
		}
		System.out.println("The sum of all numbers in given range is : " +sum);
	}
		
	void sumOddEven(int startRange , int endRange)
	{
		int evsum =0;
		int oddsum=0;
		for (;startRange<=endRange ;startRange++)
		{
			if (startRange%2 ==0)
			evsum = evsum+startRange;
			else 
			oddsum = oddsum+startRange;
		}
		
		System.out.println("The difference between sum of odd numbers and sum of even numbers in given range is : " + (oddsum-evsum));
	}	
	void oddNumReverse(int startRange , int endRange)
	{
		System.out.println("Odd numbers in reverse out of range given are :");
		for (;endRange>=startRange ;endRange--)
		{
			if (endRange%2 !=0)
			System.out.println(endRange);
		}
	}
	
	public static void main(String[] args){
		NumberType num = new NumberType();
		num.evenNumber(10,15);
		num.divFive(10,30);
		num.divFiveThree(5,18);
		num.divSevenThirteen(5,100);
		num.sumRange(1,5);
		num.sumOddEven(3,9);
		num.oddNumReverse(10,20);
		
	}
}
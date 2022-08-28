package narendraD;

class NumberSystem {
	
	void getEvenNumbers(int startIndex, int endIndex) {
		System.out.println("Even numbers are:");
		for(int index=startIndex; index<=endIndex; index++)
		{
			if (index%2==0)
			{
				System.out.print(" "+index);
			}
		}
	}
	
	void getDivisibleBy5Numbers(int startIndex, int endIndex) {
		System.out.println("\n" + "\n" + "Divisible by 5 numbers are:");
		for(int index=startIndex; index<=endIndex; index++)
		{
			if (index%5==0)
			{
				System.out.print(" "+index);
			}
		}
	}
	
	void getDivisibleBy5And3Numbers(int startIndex, int endIndex) {
		System.out.println("\n" + "\n" + "Divisible by 5 & 3 numbers are:");
		for(int index=startIndex; index<=endIndex; index++)
		{
			if (index%5==0 && index%3==0)
			{
				System.out.print(" "+index);
			}
		}
	}
	
	void getDivisibleBy7OR13Numbers(int startIndex, int endIndex) {
		System.out.println("\n" + "\n" + "Divisible by 7 or 13 numbers are:");
		for(int index=startIndex; index<=endIndex; index++)
		{
			if (index%7==0 || index%13==0)
			{
				if (index%7==0)
				{
					System.out.println(index + " is divisible by 7");
				}
				if (index%13==0)
				{
					System.out.println(index + " is divisible by 13");
				}
				
			}
		}
	}
	
	void getSumOfNumbers(int startIndex, int endIndex) {
		int sum =0;
		
		for(int index=startIndex; index<=endIndex; index++)
		{
			sum = sum+index;		
		}
		System.out.println("\n" + "Sum of numbers are: " + sum);
				
	}
	
	void getDiffBetweenOddAndEvenNumbers(int startIndex, int endIndex) {
		int evensum =0;
		int oddsum = 0;
		
		for(int index=startIndex; index<=endIndex; index++)
		{
			if (index%2==0)
			{
				evensum= evensum+index;
			}
			else
			{
				oddsum= oddsum+index;
			}
					
		}
		if (oddsum > evensum)
		{
			System.out.println("\n" + "Difference between odd and even numbers are: " + (oddsum-evensum));
		}
		else if (oddsum < evensum)
		{
			System.out.println("\n" + "Difference between even and odd numbers are: " + (evensum-oddsum));
		}	
				
	}
	
	void getOddReverseNumbers(int startIndex, int endIndex) {
		System.out.println("\n" + "Odd numbers in reverse order are:");
		for(int index=endIndex; index>=startIndex; index--)
		{
			if (index%2!=0)
			{
				System.out.println(index);
			}
		}
	}
	
	public static void main (String[] args) {
		
		NumberSystem numbersystem = new NumberSystem();
		numbersystem.getEvenNumbers(10,15);
		numbersystem.getDivisibleBy5Numbers(10,30);
		numbersystem.getDivisibleBy5And3Numbers(5,18);
		numbersystem.getDivisibleBy7OR13Numbers(5,40);
		numbersystem.getSumOfNumbers(1,5);
		numbersystem.getDiffBetweenOddAndEvenNumbers(3,9);
		numbersystem.getOddReverseNumbers(10,20);
	}
	
}
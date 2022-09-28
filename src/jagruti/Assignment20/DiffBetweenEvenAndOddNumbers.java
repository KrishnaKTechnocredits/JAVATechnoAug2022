/*
 *Write a method to return difference of sum of all even numbers and odd numbers in given array.
input : {10,11,15,6}
output : 10
Hint : 16 - 26 = 10

 */
package jagruti.Assignment20;

public class DiffBetweenEvenAndOddNumbers 
{
	int sum = 0;
	int oddSum = 0;
	int difference=0;
	
	int evenNumbersSum(int[] numbers)
	{
		for(int index=0; index<numbers.length; index++)
		{
			if (numbers[index]%2 == 0)
			{
				sum = sum + numbers[index];
			}
		}
		return sum;		
	}
	int oddNumbersSum(int[] numbers)
	{
		for(int index=0; index<numbers.length; index++)
		{
			if (numbers[index]%2 == 1)
			{
				oddSum = oddSum + numbers[index];
			}
		}
		return oddSum;		
	}
	public static void main(String[] args)
	{
		DiffBetweenEvenAndOddNumbers object = new DiffBetweenEvenAndOddNumbers();
		int[] numbers = {10,11,15,6};		
		System.out.println("Difference between Sum of even numbers and odd numbers from given aaray : " + (object.oddNumbersSum(numbers) - (object.evenNumbersSum(numbers))));
		
	}

}

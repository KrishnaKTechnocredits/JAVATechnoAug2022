/*Write a method to return sum of all even numbers in given array.
input : {10,11,15,6}
output : 16
*/
package jagruti.Assignment20;

public class SumOfEvenNumbersArray 
{
	int sum = 0;
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
	public static void main(String[] args)
	{
		SumOfEvenNumbersArray object = new SumOfEvenNumbersArray();
		int[] numbers = {10,11,15,6};
		System.out.println("Sum of even numbers from given aaray : " +object.evenNumbersSum(numbers));
		
	}

}

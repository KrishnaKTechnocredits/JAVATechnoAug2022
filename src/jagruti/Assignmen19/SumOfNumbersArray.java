/*1) Write a method to return sum of all numbers in given array.
input : {10,11,15}
output : 36*/

package jagruti.Assignmen19;

public class SumOfNumbersArray 
{
	int sumOfArray(int[] array)
	{
		int sum=0;
		int temp=0;
		System.out.print("Array elements are : ");
		for (int index = 0; index<array.length; index++)
		{
			temp = array[index];
			System.out.print(temp +" ");
			sum = sum + temp;
		}
		return sum;		
	}
	public static void main(String[] args)
	{
		SumOfNumbersArray sumOfNumbersArray = new SumOfNumbersArray();
		int[] array = {10,11,15};
		System.out.println("\nSum of array elements : " + sumOfNumbersArray.sumOfArray(array));
	}
}

package jagruti.Assignmen19;

public class MaxNumberFromArray
{
	int getMaxNumFromArray(int[] number)
	{
		int max= 0;
		for(int index=0; index<number.length;index++)
		{
			if (max<number[index])
			{
				max = number[index];				
			}
		}		
		return max;		
	}
	public static void main(String[]args)
	{
		MaxNumberFromArray maxNumberFromArray = new MaxNumberFromArray();
		int number[] = {11,4,55,23,43};
		System.out.println("Maximum number from array is : "+maxNumberFromArray.getMaxNumFromArray(number));
	}

}

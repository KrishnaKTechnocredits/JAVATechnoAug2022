package jagruti.Assignmen19;
public class MinNumberFromArray 
{
	int getMinNumFromArray(int[] number)
	{
		int min= number[0];
		for(int index=0; index<number.length;index++)
		{
			if (min>number[index])
			{
				min = number[index];				
			}
		}		
		return min;		
	}
	public static void main(String[]args)
	{
		MinNumberFromArray minNumberFromArray = new MinNumberFromArray();
		int number[] = {11,4,55,23,43};
		System.out.println("Minimum number from array is : "+minNumberFromArray.getMinNumFromArray(number));
	}
}

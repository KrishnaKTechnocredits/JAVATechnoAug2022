/*Assignment - 21 : 14th Sep'2022

Return second highest from given array.
input : 
output : 89*/

package chaitanyaMankar;

public class SecondMax 
{
	int maxNumber(int[] numbers)
	{
		int Max = 0;
		int sMax = 0;
		
		for(int i=0;i<numbers.length;i++)  //{10,99,33,44,89,76}
		{
			if(numbers[i] > Max);
			{
				sMax = Max;
				Max = numbers[i];
			}
		}
		return sMax;
	}

	public static void main(String[] args) 
	{
		SecondMax mn = new SecondMax();
		int[] num =  {10,99,33,44,89,76};
		int max = mn.maxNumber(num);
		System.out.println("Second Max: "+max);
	}

}

/*Assignment - 24 : 17th Sep'2022 [program complexity : medium, expected time : 30 mins]

Write a method to replace element with sum of other elements.

input : {12,2,11,17}
output : {30,40,31,25}

Hint : 12 should be replaced with - 2+11+17
          2 should be replaced with - 12 + 11+ 17
          11 should be replaced with - 12+2+17
          17 should be replaced with - 12+2+11 */

package chaitanyaMankar.Array;

public class ReplaceSum 
{
	int[] processData(int[] input)
	{
		int[] output = new int[input.length];
		
		for(int i=0;i<input.length;i++)
		{
			int count = 0;
			for(int j=0;j<input.length;j++)
			{
				if(i!=j)
				{
					count = count + input[j];
				}
			}
			output[i] = count;
		}
		return output;
	}
	public static void main(String[] args) 
	{
		ReplaceSum RS = new ReplaceSum();
		int[] nums = {12,2,11,17};
		int[] arr = RS.processData(nums);
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Output:"+arr[i]);
		}
	}

}

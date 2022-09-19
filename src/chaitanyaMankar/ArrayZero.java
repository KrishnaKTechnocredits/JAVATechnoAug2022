package chaitanyaMankar;

import java.util.Arrays;

public class ArrayZero 
{
	int[] output;
	int[] ReturnArray(int[] arr)
	{
		int[] output = arr;
		int min = 0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(min<arr[i])
			{
				min = arr[i];
				output[i] = min;
			}
			else
			{
				output[i-1] = 0;
			}
		}
		return arr;
	}

	public static void main(String[] args) 
	{
		ArrayZero az = new ArrayZero();
		int[] arr = {10,20,30,22,44,21,92,89}; 
		System.out.println("Input: "+Arrays.toString(arr));
		int[] out = az.ReturnArray(arr);
		System.out.println("Output: "+Arrays.toString(out));
		
	}
}

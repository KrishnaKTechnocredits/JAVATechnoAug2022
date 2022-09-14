package titikshaG;
import java.util.*;

//Maximum number from array
public class Maxnumber {
	int MaxNumber(int arr[])
	{
		int max=arr[0];
		for(int index=1;index<arr.length;index++)
		{
			if(arr[index]>max)
			{
				max=arr[index];
			}
		}
		return max;
	}
	
//Second maximum number 
	int secondNumber(int arr[])
		{
		int max=arr[0];
		int smax=0;
		for(int index=1;index<arr.length;index++)
		{
			if(arr[index]>max)
			{
				max=arr[index];
			}
			else if (arr[index] > smax){
				smax=arr[index];
				}
			}
			return smax;
		}
		
	public static void main(String[] args)
			{
		Maxnumber maxnumber=new Maxnumber();
		int input[]= {10,99,33,44,89,76};
		int output=maxnumber.secondNumber(input);
		System.out.println("Second maximum number is:"+" " +output);
		System.out.println();
		int output2=maxnumber.MaxNumber(input);
		System.out.println("Maximum number from array is:" +" "+output2);
		
		}
}



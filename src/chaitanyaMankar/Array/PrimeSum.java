/*
Assignment - 19 : 9th Sep'2022

1) Write a method to return sum of all numbers in given array.
input : {10,11,15}
output : 36 

2) Write a method to return sum of all prime numbers from given array.
input : {11,14,17,22,44}
output : 28
Hint : (11+17 = 28)

3) Write a method to return max number from array.
input : {11,4,55,23,43}
output : 55

4) Write a method to return min number from array.
input : {11,4,55,23,43}
output : 4

5) Write a method to print middle character of all array elements.
input : {"Ashish","Aditty","Manjiri","Ankita"}
output : Ashish -> h
         Aditty -> i
		 Manjiri -> j
		 Ankita -> k*/

package chaitanyaMankar.Array;
public class PrimeSum 
{
	int getSum(int value[])
	{
		int sum=0;
		for(int i=0;i<value.length;i++)
		{
			sum=sum + value[i];
		}
		return sum;		
	}
	
	int getPrimeSum(int value[])
	{
		int sum = 0;
		boolean flag = true;
		for(int i=0;i<value.length;i++)
		{
			for(int j=2;j<value[i];j++)
			{
				
				if(value[i]%j==0)
				{
					flag=false;
					break;
				}
			}
				if(flag == true)
				{
					sum = sum + value[i];
				}
				else
				{
					flag = true;
				}
		}
		return sum;
	}
	
	int maxNumber(int number[]) 
		{
		int max = 0;
		for(int i=0;i<number.length;i++)
		{
			if(max<number[i])
			{
				max = number[i];
			}
		}
		return max;
		}
		
		int minNumber(int number[])  //{11,14,17,22,44};
		{
			int min = number[0];
			for(int i=0;i<number.length;i++)
			{
				if(number[i]<min)
				{
					min = number[i];
				}
			}
			return min;
	}

		void middleChar(String Names[]) 
		{
			String tname = "";
			int tlength = 0;
			int index = 0;
		 for(int i=0;i<Names.length;i++)
		 {
			tname = Names[i];
			tlength = tname.length();
			if(tlength%2==0)
			{
				index = tlength/2-1;
				char ch = tname.charAt(index);
				System.out.println(Names[i]+"-->"+ch);
			}
			else if(tlength%2!=0)
			{
				index = tlength/2;
				char ch = tname.charAt(index);
				System.out.println(Names[i]+"-->"+ch);
			}
		 }
		}
	public static void main(String[] args) 
	{
		PrimeSum prsum = new PrimeSum();
		
		int arr[] = {10,11,15};
		int sum = prsum.getSum(arr);
		System.out.println("Addition of Array: "+sum);
		
		int arr1[] = {11,14,17,22,44};
		int primeSum = prsum.getPrimeSum(arr1);
		System.out.println("Sum of Prime: "+primeSum);
		
		int arr2[] = {11,14,17,22,44};
		int max = prsum.maxNumber(arr2);
		System.out.println("Max number: "+max);
		
		int arr3[] = {11,14,17,22,44};
		int min = prsum.minNumber(arr3);
		System.out.println("Min number: "+min);
		
		String arr4[] = {"Ashish","Aditty","Manjiri","Ankita"};
		prsum.middleChar(arr4);
		}
}

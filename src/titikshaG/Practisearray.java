//Write a method to return sum of all numbers in given array.
//input : {10,11,15}
//output : 36
package titikshaG;

public class Practisearray {
	int sumOfArray(int[] num)
	{
	int sum=0;
	for(int index=0;index<num.length;index++)
		{
		sum=sum+num[index];
		}
	return sum;
	}
//Write a method to return sum of all prime numbers from given array.
//input : {11,14,17,22,44}
//output : 28
//Hint : (11+17 = 28)

	boolean primeNumber(int num)
	{
		boolean flag=false;
		for(int index=2;index<num/2;index++)
		{
			if(num%2==0)
				{
				flag=true;
				}
			else {
				flag=false;}
		}
		return flag;
	}
	int sumOfPrimeNumber(int[] num)
	{
		int sum=0;
		for(int index=0;index<num.length;index++)
		{
			boolean flag=primeNumber(num[index]);
			if(flag)
			{
			sum=sum+num[index];
			}
		}
		return sum;
	}
//Write a method to return max number from array.
//input : {11,4,55,23,43}
//output : 55
	
	int maxNumber(int[] num) {
		int maxLength=num[0];
		for(int index=0;index<num.length;index++)
		{
			if(num[index]>maxLength) {
			maxLength=num[index];
			}
		}
		return maxLength;
	}
//Write a method to return min number from array.
//input : {11,4,55,23,43}
//output : 4
	
	int minNumber(int[] num)
	{
		int minLength=num[0];
		for(int index=0;index<num.length;index++)
			{
			if(num[index]<minLength)
				minLength=num[index];
			}
		return minLength;
	}
		
	public static void main(String[] args)
	{
		Practisearray practisearray=new Practisearray();
		int[] input=new int[]{10,11,15};
		System.out.println("Sum of array is:"+ " "+practisearray.sumOfArray(input));
		int[] input2=new int[] {11,14,17,22,44};
		System.out.println("Sum ofprime number using array is:"+ " "+practisearray.sumOfPrimeNumber(input2));
		int[] input3=new int[] {11,4,55,23,43};
		System.out.println("Maximum digit of array is:"+ " "+practisearray.maxNumber(input3));
		int[] input4=new int[] {11,4,55,23,43};
		System.out.println("Minimum digit of array is:"+ " "+practisearray.minNumber(input4));
	
	}
}

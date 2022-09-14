
/*
1) Write a method to return sum of all not prime numbers from given array.
input : {11,13,17,22,44}
output : 66
Hint : (22+44 = 66) */


package swapnilMaheshwari.Assignment20;

import java.util.Arrays;

import shridharKumbhar.assignment19Array.SumOfAllNum;

public class ArraysPrograms {
	boolean isNotPrime(int num) {
		int sum = 0;
		boolean flag = false;
		for (int i = 2; i < num / 2; i++) {

			if (num % i == 0) {
				flag = true;
				break;
			}
		}

		if (flag==true)
		{
			return flag;
		}
		
		return flag;
	}
	
	int getNonPrimeSum(int[] arr) {
		int sum=0;
		for (int i=0; i<arr.length;i++) {
			if (isNotPrime(arr[i]) )
			{
				sum=sum+arr[i];
			}
		}
		return sum;
	}

	/*
2) Write a method to return sum of all non prime numbers which
should be divisible by 5 & 7 from given array.
input : {11,35,17,105,44}
output : 140
Hint : (35+105 = 28)
	
	*/
	int getNonPrimeDivisibleBy5and7 (int[] arr) {
		int sum=0;
		for (int i=0; i<arr.length; i++) {
			if (isNotPrime(arr[i]))
				{
				if ( arr[i]%5==0 && arr[i]%7==0 ) {
					sum=sum+arr[i];
				}
			}
		}
		return sum;
	}
	
/*3) Write a method to return sum of all even numbers in given array.
input : {10,11,15,6}
output : 16 */
	
	int getSumOfAllEvenNum (int[] arr) {
		int evenSum=0;
		for (int i=0; i<arr.length; i++) {
			if(arr[i]%2==0) {
				evenSum=evenSum+arr[i];
			}
		}
		return evenSum;
	}
/*4) Write a method to return difference of sum of all even numbers and odd numbers in given array.
			input : {10,11,15,6}
			output : 10
			Hint : 16 - 26 = 10 */
	int getDiffOfSumofAllEvenAndAllOdd(int[] arr) {
		int evenSum=0, oddSum=0,diffOfSum=0;
		for(int i=0; i<arr.length;i++) {
			if (arr[i]%2==0) {
				evenSum=evenSum+arr[i];
			}
			else 
				oddSum=oddSum+arr[i];
			}
			return diffOfSum=oddSum-evenSum;
	}
	
/*
 5) Return count of vowels in a given String.
input : maulik
output : 3

 */
	
int getCountOfVowels (String str) {
	int count=0;
	str=str.toLowerCase();
	for (int i=0; i<str.length();i++) {
		char ch=' ';
		ch=str.charAt(i);
		if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			count++;
		}
	}
	return count;
}
/*
 6) Write a method to count vowels of each name in given array.
input : {"Ashish","Aditty","Manjiri","Ankita"}
output : Ashish -> 2
         Aditty -> 2
		 Manjiri -> 3
		 Ankita -> 3
 */

int[] getCountofVowelesInArray (String[] arr) {
	int[] output = new int[arr.length];
	for (int i=0; i<arr.length;i++) {
	output[i]=getCountOfVowels(arr[i]);
	}
	return output;
}
String getMaxLengthName(String[]name) {
	int maxNameLength= name[0].length();
	String maxLengthName=name[0];
	
	for(int i=1;i<name.length;i++) {
		if(name[i].length()>= maxNameLength) {
			maxNameLength=name[i].length();
			maxLengthName=name[i];
		}
	}
	return maxLengthName;
}

	public static void main(String[] args) {
		int [] input = {11,13,17,22,44};
		ArraysPrograms arraysPrograms = new ArraysPrograms();
		System.out.println("Sum of non prime numers is :" +arraysPrograms.getNonPrimeSum(input));
		int [] input1 = {11,35,17,105,44};
		System.out.println("Sum of non prime numers which are divisible by 5 and 7 :" +arraysPrograms.getNonPrimeDivisibleBy5and7(input1));
		int [] input2 ={10,11,15,6};
		System.out.println("Sum of all even number :" + arraysPrograms.getSumOfAllEvenNum(input2) );
		System.out.println("Difference of Sum of all even and odd numbers :" + arraysPrograms.getDiffOfSumofAllEvenAndAllOdd(input2) );
		String input3 ="maulik";
		System.out.println("Voweles coun in the given string is :"+arraysPrograms.getCountOfVowels(input3));
		String[] input4= {"Ashish","Aditty","Manjiri","Ankita"};
		int [] output=arraysPrograms.getCountofVowelesInArray(input4);
		for (int j=0;j<input4.length;j++) {
		System.out.println(input4[j] + "->" +output[j]);
	}
		String[] input5= {"Ashish","Swapnil","Maulik","Kapil","Technocredits"};
		System.out.println("Max length in the string is :" +arraysPrograms.getMaxLengthName(input5));
}
}
	

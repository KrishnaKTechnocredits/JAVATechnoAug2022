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
		 Ankita -> k
		 
*/		 

package pranjaliV.assignment19;

public class ArrayAssignment {
	
	int getSum(int[] input) {
		int sum = 0;
		for(int index=0; index<=input.length-1; index++) {
			sum =sum+ input[index];
		}
		return sum;
	}
	
	boolean isPrime(int num) {
		boolean flag1 = true;
		//boolean flag2 = false;
		for(int index=2; index<=num/2; index++) {
			if(num%index==0) {
				flag1=false;
				break;
			}
		}
		if(flag1==true) {
			return flag1;
		}
		else {
			flag1=false;
			return flag1;
		}
	}
	
	int getSumPrimeNumbers(int[] input) {
		int sum = 0;
		for(int index=0; index<=input.length-1; index++) {
			if(isPrime(input[index])==true) {
				sum = sum + input[index];
			}
		}
		return sum;
	}
	
	int getMax(int[] input) {
		int max = input[0];
		for(int index=0; index<=input.length-1; index++) {
			if(max<input[index]) {
				max = input[index];
			}
		}
		return max;
	}
	
	int getMin(int[] input) {
		int min =input[0];
		for(int index=0; index<=input.length-1; index++) {
			if(min>input[index]) {
				min = input[index];
			}
		}
		return min;
	}
	
	char getMiddleChar(String name) {
		int length = name.length();
		char ch = name.charAt(0);
		if(length%2==0) {
			ch = name.charAt((length/2)-1);
		}
		else {
			ch = name.charAt(length/2);
		}
		return ch;	
	}
	
	void getStringArray(String[] input) {
		for(int index=0; index<=input.length-1;index++) {
			System.out.println("Middle character of "+input[index]+" is : "+ getMiddleChar(input[index]));
		}
	}
	
	void printInfo1(int[] input) {
		System.out.println("Sum of all numbers in given array is: "+ getSum(input) );
		System.out.println("Sum of all Prime numbers in given array is: "+ getSumPrimeNumbers(input) );
		System.out.println("Max number in given array is: "+ getMax(input) );
		System.out.println("Min number in given array is: "+ getMin(input) );
	}
	

	public static void main(String[] args) {
		ArrayAssignment arrayAssignment = new ArrayAssignment();
		int[] arr1= {10,11,15};
		arrayAssignment.printInfo1(arr1);
		System.out.println("");
		int[] arr2= {11,14,17,22,44};
		arrayAssignment.printInfo1(arr2);
		System.out.println("");
		String[] input = {"Ashish","Aditty","Manjiri","Ankita"};
		arrayAssignment.getStringArray(input);
	}
}

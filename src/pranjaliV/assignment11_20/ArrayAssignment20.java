/*Assignment - 20 : 10th Sep'2022

1) Write a method to return sum of all not prime numbers from given array.//--11mins
input : {11,13,17,22,44}
output : 66
Hint : (22+44 = 66)

2) Write a method to return sum of all non prime numbers //--8mins
and should be divisible by 5 & 7 from given array.
input : {11,35,17,105,44}
output : 140
Hint : (35+105 = 28)

3) Write a method to return sum of all even numbers in given array. //--6mins
input : {10,11,15,6}
output : 16

4) Write a method to return difference of sum of all even numbers and odd numbers in given array. //--10mins
input : {10,11,15,6}
output : 10
Hint : 16 - 26 = 10

5) Return count of vowels in a given String. //8mins
input : maulik
output : 3

6) Write a method to count vowels of each name in given array. //10mins
input : {"Ashish","Aditty","Manjiri","Ankita"}
output : Ashish -> 2
         Aditty -> 2
		 Manjiri -> 3
		 Ankita -> 3
		 
7) Write a method to return name having maximum length. //10mins
input : {"Ashish","Aditty","Manjiri","Ankita","Credits"}
output : Credits*/


package pranjaliV.assignment11_20;

import java.util.Arrays;

public class ArrayAssignment20 {
	
	boolean isPrime(int num) {
		boolean flag = true;
		for(int index=2; index<=num/2; index++) {
			if(num%index==0) {
				flag=false;
				break;
			}
		}
		if(flag==true) {
			return true;
		}
		else {
			return false;
		}
	}
	
	int getSumNotPrime(int[] input) {
		int sum = 0;
		for(int index=0; index<input.length; index++) {
			if(isPrime(input[index])==false) {
				sum = sum + input[index];
			}
		}
		return sum;
	}
	
	int getSumDivisible5And7(int[] input) {
		int sum = 0;
		for(int index=0; index<input.length; index++) {
			if(isPrime(input[index])==false) {
				if(input[index]%5==0 && input[index]%7==0) {
					sum = sum + input[index];
				}
			}
		}
		return sum;
	}
	
	int getSumEvenNum(int[] input) {
		int sumEven = 0;
		for(int index=0; index<input.length; index++) {
			if(input[index]%2==0) {
				sumEven = sumEven+input[index];
			}
		}
		return sumEven;
	}
	
	int getSumOdd(int[] input) {
		int sumOdd = 0;
		for(int index=0; index<input.length; index++) {
			if(input[index]%2!=0) {
				sumOdd = sumOdd + input[index];
			}
		}
		return sumOdd;
	}
	
	int getDifferenceEvenOdd(int[] input) {
		int even = getSumEvenNum(input);
		int odd = getSumOdd(input);
		int diff = 0;
		if(even>odd) {
			diff = even-odd;
		}
		else if(odd>even) {
			diff = odd-even;
		}
		return diff;
	}
	
	int getCountVowels(String name) {
		name = name.toLowerCase();
		char ch = ' ';
		int count = 0;
		for(int index=0; index<name.length(); index++) {
			ch = name.charAt(index);
			if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				count++;
			}
		}
		return count;
	}
	
	int[] getCountVowelsEachElement(String[] input) {
		int[] count = new int[input.length];
		for(int index=0; index<input.length; index++) {
			count[index]=getCountVowels(input[index]);
		}
		return count;
	}
	
	String getMaxLengthName(String[] input) {
		int max = input[0].length();
		String name = "";
		for(int index=0; index<input.length; index++) {
			if(max<input[index].length()) {
				max = input[index].length();
				name = input[index];
			}
		}
		return name;
	}
	
	void printInfo(String[] input) {
		int[] output = getCountVowelsEachElement(input);
		System.out.println("Count of vowels in the each element of given array is : ");
		for(int index=0; index<input.length; index++) {
			System.out.println(input[index] + " -> " + output[index]);
		}
	}
	
	public static void main(String[] args) {
		ArrayAssignment20 array = new ArrayAssignment20();
		int[] input1 = {11,13,17,22,44};
		System.out.println("Input1 : " + Arrays.toString(input1));
		System.out.println("Sum of all not prime numbers from given array is: "+array.getSumNotPrime(input1));
		System.out.println("");
		
		int[] input2 = {11,35,17,105,44};
		System.out.println("Input2 : " + Arrays.toString(input2));
		System.out.println("Sum of all not prime numbers and divisible by 5 & 7 from given array is: "+array.getSumDivisible5And7(input2));
		System.out.println("");
		
		int[] input3 = {10,11,15,6};
		System.out.println("Input3 : " + Arrays.toString(input3));
		System.out.println("Sum of all even numbers in given array is: "+array.getSumEvenNum(input3));
		System.out.println("");
		
		int[] input4 = {10,11,15,6};
		System.out.println("Input4 : " + Arrays.toString(input4));
		System.out.println("Difference of sum of all even numbers and odd numbers in given array is: "+array.getDifferenceEvenOdd(input4));
		System.out.println("");
		
		String name = "Maulik";
		System.out.println("Count of vowels in the String '"+name+"' is :"+ array.getCountVowels(name));
		System.out.println("");
		
		String[] input5 = {"Ashish","Aditty","Manjiri","Ankita"};
		System.out.println("Input5 : " + Arrays.toString(input5));
		array.printInfo(input5);
		System.out.println("");
		
		String[] input6 = {"Ashish","Aditty","Manjiri","Ankita","Credits"};
		System.out.println("Input6 : " + Arrays.toString(input6));
		System.out.println("Name having maximum length given array is: "+array.getMaxLengthName(input6));	
	}
}

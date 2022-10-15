
/***
 * Assignment - 20 : 10th Sep'2022

1) Write a method to return sum of all not prime numbers from given array.
input : {11,13,17,22,44}
output : 66
Hint : (22+44 = 66)

2) Write a method to return sum of all non prime numbers 
and should be divisible by 5 & 7 from given array.
input : {11,35,17,105,44}
output : 140
Hint : (35+105 = 28)

3) Write a method to return sum of all even numbers in given array.
input : {10,11,15,6}
output : 16

4) Write a method to return difference of sum of all even numbers and odd numbers in given array.
input : {10,11,15,6}
output : 10
Hint : 16 - 26 = 10
 * ***/

package mohiniA.StringArray.Assign17_18_19;

import java.util.Arrays;

public class ArrayOperation20 {
	
	int count =0;
	
	
	int getSumofNonPrime(int[] num) {
		int sum=0;    
		for(int index=0;index<num.length;index++) {
			 if(num[index]%2==0) 
				 sum += num[index];
			}
	return sum;
	}
	
	int getSumofNonPrimeAnDivby3and7(int[] num) {
		int sum=0;    
		for(int index=0;index<num.length;index++) {
			 if(num[index]%2==0 &&num[index]%3==0 &&num[index]%7==0) 
				 sum += num[index];
			}
	return sum;
	}
	
	int getSumofEvenNumbers(int[] num) {
		int sum=0;    
		for(int index=0;index<num.length;index++) {
			 if(num[index]%2==0) 
				 sum += num[index];
			}
	return sum;
	}
	
	int getDiffEveOdd(int[] num) {
		int Evsum=0;
		int Oddsum=0;
		for(int index=0;index<num.length;index++) {
			 if(num[index]%2==0) 
				 Evsum += num[index];
			 else
				 Oddsum += num[index];
				 
			}
	return Evsum-Oddsum;
	}
	
	
	public static void main(String[] args) {
	
		int[] input={11,13,17,22,44};
		
		System.out.println("Input Array to find Sum of Non Prime Numbers::"+Arrays.toString(input));
		System.out.println("Sum of Non Prime Numbers is  :: "+new ArrayOperation20().getSumofNonPrime(input));
		System.out.println("----------------------------------------------------------------");
		
		int[] input1={11,35,17,105,44};
		
		System.out.println("Input Array to find Sum of Non Prime Numbers::"+Arrays.toString(input1));
		System.out.println("Sum of Non Prime Numbers is  :: "+new ArrayOperation20().getSumofNonPrime(input1));
		System.out.println("----------------------------------------------------------------");
		
		int[] input2={10,11,15,6};
		System.out.println("Input Array to find Sum of Non Prime Numbers::"+Arrays.toString(input2));
		System.out.println("Sum of Non Prime Numbers is  :: "+new ArrayOperation20().getSumofNonPrime(input2));
		System.out.println("----------------------------------------------------------------");
		
		int[] input3={10,11,15,6};
		System.out.println("Input Array to find Sum of Non Prime Numbers::"+Arrays.toString(input3));
		System.out.println("Sum of Non Prime Numbers is  :: "+new ArrayOperation20().getDiffEveOdd(input3));
		System.out.println("----------------------------------------------------------------");
		
		
	}

}

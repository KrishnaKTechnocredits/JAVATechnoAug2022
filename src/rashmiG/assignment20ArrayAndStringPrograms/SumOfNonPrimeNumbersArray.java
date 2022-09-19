/*Assignment - 20 : 10th Sep'2022
1) Write a method to return sum of all not prime numbers from given array.
input : {11,13,17,22,44}
output : 66
Hint : (22+44 = 66)*/

package rashmiG.assignment20ArrayAndStringPrograms;

import java.util.Arrays;
class SumOfNonPrimeNumbersArray{
	
	boolean isNonPrime(int num){
		if(num>0){
			for(int index=2;index<=num/2||index<=-num/2;index++){
				if(num%index==0){
					return true;
				}
			}
		return false;
		}
		return false;
		
	}
	
	int getSumOfNonPrimeNumbers(int[] input){
		int sum=0;
		for(int index=0;index<=input.length-1;index++){
			boolean isNonPrimeFlag=isNonPrime(input[index]);
			if(isNonPrimeFlag){
				sum=sum+input[index];
			}
		}
		return sum;
	}
	
	public static void main(String[] args){
		int[] input={11,13,17,0,-99,22,44};
		int sum=new SumOfNonPrimeNumbersArray().getSumOfNonPrimeNumbers(input);
		System.out.println(Arrays.toString(input));
		System.out.println("Sum of non prime numbers : "+sum);
	}
}
			
		
				
			

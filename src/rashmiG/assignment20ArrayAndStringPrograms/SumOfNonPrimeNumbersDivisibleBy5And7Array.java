/*Assignment - 20 : 10th Sep'2022
2) Write a method to return sum of all non prime numbers 
and should be divisible by 5 & 7 from given array.
input : {11,35,17,105,44}
output : 140
Hint : (35+105 = 28)*/

package rashmiG.assignment20ArrayAndStringPrograms;

class SumOfNonPrimeNumbersDivisibleBy5And7Array{

	int isDivisibleBy5And7(int num){
		int resultNum=0;
		if(num%5==0 && num%7==0){
			resultNum=num;
		}
		return resultNum;
	}
	
	int getSumOfNonPrimeNosDiisibleBy5And7(int[] input){
		int sum=0;
		for(int index=0;index<=input.length-1;index++){
			sum=sum+isDivisibleBy5And7(input[index]);
		}
		return sum;
	}
	
	public static void main(String[] args){
		int[] input={11,35,17,105,44};
		System.out.println("Sum of non prime numbers divisible by 5 and 7 : "+new SumOfNonPrimeNumbersDivisibleBy5And7Array().getSumOfNonPrimeNosDiisibleBy5And7(input));
	}	
}

	
	
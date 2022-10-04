/*Assignment - 20 : 10th Sep'2022

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

5) Return count of vowels in a given String.
input : maulik
output : 3

6) Write a method to count vowels of each name in given array.
input : {"Ashish","Aditty","Manjiri","Ankita"}
output : Ashish -> 2
         Aditty -> 2
		 Manjiri -> 3
		 Ankita -> 3
		 
7) Write a method to return name having maximum length.
input : {"Ashish","Aditty","Manjiri","Ankita","Credits"}
output : Credits*/
package shrutiArora;

import java.util.Arrays;

public class Assignment20 {
	int getSumOfNonPrime(int[]input) {
		int sum = 0 ;
		for(int index = 0 ; index<input.length;index++) {
			boolean flag = isPrime(input[index]);
			if(!flag) {
				sum+= input[index];
			}
		}
		return sum;
	}
   static private boolean isPrime(int num) {
		boolean isPrime = true;
		for(int index = 2 ; index<=num/2;index++) {
			if(num%index==0) {
				isPrime = false;
			}
		}
		return isPrime;
	}
     int getSumOfNonPrimeAndDivisibilityBy5And7(int[]input1){
	   int sum = 0;
	   for(int index = 0;index<input1.length;index++) {
		   boolean flag = isPrime(input1[index]);
		   if(flag == false && input1[index]%5==0 && input1[index]%7==0) {
			   sum+= input1[index];
		   }
	   }
	   return sum;
   }
   int getEvenNumSumInArray(int[] input2) {
	   int evenSum= 0;
       for(int index = 0;index<input2.length;index++) {
		  if(input2[index]%2==0) {
			  evenSum+= input2[index];
		  }
       }
       return evenSum;
   }
   int getDifferenceOfEvenSumAndOdd(int[]input3) {
	   int difference = 0;
	   int evenSum = getEvenNumSumInArray(input3);
	   int oddSum = 0;
	   for(int index =0 ; index<input3.length;index++) {
		   if(input3[index]%2!=0) {
			   oddSum+= input3[index];
		   }
	   }
	   if(evenSum>oddSum) {
		   difference = evenSum-oddSum;
	   }
	   else {
		   difference = oddSum - evenSum;
	   }
	   return difference;
   }
   int numOfVowelsInString(String str) {
	 str = str.toLowerCase() ;
     int count = 0;
     for(int index =0 ; index<str.length(); index++) {
    	 char ch = str.charAt(index);
    	 if(ch == 'a' ||ch == 'e'||ch== 'i' || ch == 'o' ||ch== 'u') {
    		 count++;
    	 }
     }
     return count;
   }
   int[] countOfVowelInArrayElements(String[] name) {
	   int[] output = new int[name.length];
	   for(int index=0 ; index<name.length ; index++) {
		   output[index] = numOfVowelsInString(name[index]);
	   }
	   return output;
   }
   String getNameOfMaxLength(String[] str) {
	   int maxLength = 0 ;
	   String maxName = "";
	   for(int index = 0 ; index<str.length;index++) {
		   if(maxLength <= str[index].length()) {
			   maxName = str[index];
		   }
	   }
	   return maxName;
   }
   public static void main(String[] args) {
	   Assignment20 assignment20 = new Assignment20();
	   int[] input = {11,13,17,22,44};
	   System.out.println("**********************************************Program-1*************************************");
	   System.out.println(" input: " + Arrays.toString(input));
	   System.out.println(" output: " + assignment20.getSumOfNonPrime(input));
	   System.out.println("****************************************************Program-2*********************************");
	   int[] input1 = {11,35,17,105,44};
	   System.out.println(" input: " + Arrays.toString(input1));
	   System.out.println(" output: " + assignment20.getSumOfNonPrimeAndDivisibilityBy5And7(input1));
	   System.out.println("****************************************************Program-3*********************************");
	   int[]input2 = {10,11,15,6};
	   System.out.println(" input: " + Arrays.toString(input2));
	   System.out.println(" output: " + assignment20.getEvenNumSumInArray(input2));
	   System.out.println("*********************************************************Program-4***********************************");
	   int[] input3 = {10,11,15,6};
	   System.out.println(" input: " + Arrays.toString(input3));
	   System.out.println(" output: " + assignment20.getDifferenceOfEvenSumAndOdd(input3));
	   System.out.println("*********************************************************Program-5***********************************");
	   String str = "maulik";
	   System.out.println(" input: " + str);
	   System.out.println(" Output: " + assignment20.numOfVowelsInString(str));
	   System.out.println("*********************************************************Program-6***********************************");
	   String[] input4 = {"Ashish","Aditty","Manjiri","Ankita"};
	   System.out.println(" input: " + Arrays.toString(input4));
	   int[] countVowel = assignment20.countOfVowelInArrayElements(input4);
	   for(int index= 0; index<input4.length; index++) {
		   System.out.println(input4[index] + " -> " + countVowel[index]);
	   }
	   System.out.println("*********************************************************Program-7***********************************");
	   String[] name = {"Ashish","Aditty","Manjiri","Ankita","Credits"};
	   System.out.println(" input: " + Arrays.toString(name));
	   System.out.println(" Output:" + assignment20.getNameOfMaxLength(name));
   }
}
/*
 * Assignment - 19 : 9th Sep'2022

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
package rahulSaswadkar;

import java.util.Arrays;

public class ArrayProgram1 {
	public static void main(String[] args) {
		ArrayProgram1 arrayProgram1 = new ArrayProgram1();
		
		int[] num1 = {10,11,15};
		int[] num2 = {11,14,17,22,44};
		int[] num3 = {11,4,55,23,43};
		int[] num4 = {11,4,55,23,43};
		String[] str1 = {"Ashish","Aditty","Manjiri","Ankita"};
		
		System.out.println("Sum of all Numbers in given array " +Arrays.toString(num1)+ " is : " + arrayProgram1.m1(num1));
		System.out.println("\nSum of all Prime Numbers in given array " +Arrays.toString(num2)+ " is : " + arrayProgram1.m2(num2));
		System.out.println("\nMaximum Number in given array " +Arrays.toString(num3)+ " is : " + arrayProgram1.m3(num3));
		System.out.println("\nMinimum Number in given array " +Arrays.toString(num4)+ " is : " + arrayProgram1.m4(num4) );
		//System.out.println("\nMaximum Number in given array " +Arrays.toString(num3)+ " is : " + arrayProgram1.m3_1(num3));
		//System.out.println("\nMinimum Number in given array " +Arrays.toString(num4)+ " is : " + arrayProgram1.m4_1(num4) );
		arrayProgram1.m5(str1);
		
	}
	
	int m1(int[] num) {
		int sum = 0;
		for(int index = 0;index < num.length ; index++) {
			sum = sum + num[index];
		}
		return sum;
	}
	
	int m2(int[] num) {
		PrimeWithWhileAndReturn primeWithWhileAndReturn = new PrimeWithWhileAndReturn();
		int sum = 0;
		for(int index = 0;index < num.length ; index++) {
			if(primeWithWhileAndReturn.isPrimeNumber(num[index])) {
				sum = sum + num[index];
			}
		}
		return sum;
	}
	
	int m3(int[] num) {
		int max = 0;
		for(int index = 0;index < num.length ; index++) {
			if(num[index] > max) {
				max = num[index];
			}
		}
		return max;
	}
	
	int m4(int[] num) {
		int min = 100;
		for(int index = 0;index < num.length ; index++) {
			if(num[index] < min) {
				min = num[index];
			}
		}
		return min;
	}
	
	void m5(String str[]) {
		StringProgram1 stringProgram1 = new StringProgram1();
		System.out.println("\nGiven String Array " + Arrays.deepToString(str));
		for(int index = 0 ; index < str.length ; index ++) {
			char c = stringProgram1.getMiddleChar(str[index]);
			System.out.println("Middle Character of Element " + (index+1) + "(" + str[index] + ") of String Array is : " + c);
		}
	}
	
	int m3_1(int[] num) {
		int max = num[0];
		for(int index = 1;index < num.length ; index++) {
			if(num[index] > max) {
				max = num[index];
			}
		}
		return max;
	}
	
	int m4_1(int[] num) {
		int min = num[0];
		for(int index = 1;index < num.length ; index++) {
			if(num[index] < min) {
				min = num[index];
			}
		}
		return min;
	}
	

}

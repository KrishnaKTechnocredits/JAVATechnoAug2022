/*
 * Test 4 - 11th Sep'2022

Expected time : 15 mins
Program 1 :
Write a method to return sum of all the digits present in each elements from given array.
input : {"Ma1he4sh","A9vni","P1uj3a5","Harshal","A4d4itty","Rahul"}
output : Mahesh -> 5
         Avni -> 9
         Puja -> 9
         Harshal -> 0
         Aditty -> 8
         Rahul -> 0

Program 2 : Return count of visible trees. [15 - 20 mins, max - 30 mins]

input : {3,7,5}
output : 2

input : {3,5,11,9,10,13}
output : 4
 */

package rahulSaswadkar.arrayPrograms;

import java.util.Arrays;

public class ArrayProgram4 {
	public static void main(String[] args) {
		ArrayProgram4 arrayProgram4 = new ArrayProgram4();
		String[] str1 = {"Ma1he4sh","A9vni","P1uj3a5","Harshal","A4d4itty","Rahul"};
		
		System.out.println("Program 1 - Sum of digits present in each element of give array \nGiven Array : " + Arrays.toString(str1));
		System.out.println("Sum of all the digits present in each element of given array is as below :");
		arrayProgram4.displayData(str1, arrayProgram4.m1(str1));
		//System.out.println(Arrays.toString(arrayProgram4.m1(str1)));
		
		int[] num1 = {3,7,5};
		int[] num2 = {3,5,11,9,10,13};
		
		System.out.println("\nProgram2 - No. of visible Trees");
		System.out.println("Given Array" + Arrays.toString(num1));
		System.out.println("No. of trees visible is : " + arrayProgram4.countOfVisibleTrees(num1));
		System.out.println("Given Array" + Arrays.toString(num2));
		System.out.println("No. of trees visible is : " + arrayProgram4.countOfVisibleTrees(num2));
		
	}
	
	int[] m1(String[] str1) {
		int[] output = new int[str1.length];
		for(int index=0;index< str1.length;index++) {
			 output[index] = m2(str1[index]);
		}
		return output;
	}
    
	int m2(String str) {
		int sum = 0;
		for(int index=0;index<str.length();index++) {
			if(Character.isDigit(str.charAt(index))){
				sum = sum + Character.getNumericValue(str.charAt(index));
			}
		}
		return sum;
	}
	
	void displayData(String[] str1, int[] outputArr) {
		for(int index = 0;index<str1.length;index++) {
			System.out.println(str1[index] + "-->" + outputArr[index]);
		}
	}
	
	int countOfVisibleTrees(int[] num) {
		int count = 1;
		int maxHeight = num[0];
		for(int index=1;index<num.length;index++) {
			if(num[index] > maxHeight ) {
				maxHeight = num[index];
				count +=1;
			}
		}
		
		return count;
	}
	
}

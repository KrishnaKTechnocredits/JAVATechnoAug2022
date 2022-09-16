/* Test 4 - 11th Sep'2022

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
output : 4 */

package swatiM.tests;
import java.util.Arrays;

public class Test4{

	int getSumOfAllDigitfromStringProg1(String input){
	 
	 int sum = 0;
	 int digit = 0;
	 for(int index = 0;index < input.length();index++){
		char ch = input.charAt(index);
			if(Character.isDigit(ch)){
				digit = Character.getNumericValue(ch);
				sum = sum + digit;
			}
	 
		}
		return sum;
	}

	int[] getSumOfAllDigitfromArrayProg1 (String[] input){
		int[] sum = new int[input.length];
		for(int index=0; index<input.length;index++){
		sum[index] = getSumOfAllDigitfromStringProg1(input[index]);
		}
	return sum;
	}

	void printDigitSumArrayElements(String[] inputArray) {
		int[] resultArray = getSumOfAllDigitfromArrayProg1(inputArray);

		for(int index=0;index<resultArray.length;index++) {
			System.out.println(inputArray[index]+" -> "+resultArray[index]);
		}
	}
	int getVisibleTotalTreeProg2(int[] inputArray){
		int maxheight = inputArray[0];
		int count = 1;
			for(int index = 0;index<inputArray.length;index++){
				if(maxheight<inputArray[index]) {
				maxheight=inputArray[index];
				//System.out.println(maxheight);
				count++;
				}
			}
			return count;	
		
	}
	
	public static void main(String[] args){
		Test4 prog1 = new Test4();
		String[] input = {"Ma1he4sh","A9vni","P1uj3a5","Harshal","A4d4itty","Rahul"};
		System.out.println("Program to  return sum of all the digits present in each elements from given array!\n");

		System.out.println("Input array: "+ Arrays.toString(input)+"\n");
		prog1.printDigitSumArrayElements(input);

	    int[] arr = {3,7,5};
		int[] arr1 = {3,5,11,9,10,13};
		
		Test4 prog2 = new Test4();

		System.out.println("Program to count visible trees!");
		int result = prog2.getVisibleTotalTreeProg2(arr);
		System.out.println("\nInput array: "+Arrays.toString(arr)+"\nVisible tree count: "+result);

		int result1 =prog2.getVisibleTotalTreeProg2(arr1);
		System.out.println("\nInput array: "+Arrays.toString(arr1)+"\nVisible tree count: "+result1);

		
	}
}
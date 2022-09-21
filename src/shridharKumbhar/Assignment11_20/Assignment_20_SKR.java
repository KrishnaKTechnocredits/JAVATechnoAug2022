//Return Sum of not prime number of given array {11,13,17,22,44}
// Return sum of all nonprimenumber and div by 5 & 7
//Sum of even num
//return sum of differnce od even and odd
//count of vowels

package shridharKumbhar.Assignment11_20;

import java.util.Arrays;

public class Assignment_20_SKR {
	
	boolean isPrime(int num) {
		
		for(int index = 2 ; num/2 > index ; index++) {
			if (num%index==0) {
				return false;
			}
		}
		return true;
	}
	
	int getSumOfNotPrimeNo (int[] arr) {
		
		int arrLength = arr.length;
		int sum = 0;
		
		for(int index= 0 ;arrLength > index ; index++) {
			
			if (isPrime(arr[index]) == false){
				sum = sum + arr[index];
			}	
		}
		return sum;
	}
	
	int getSumNonPrimeDiv_5_7 (int [] arr){
		
		
		int sum = 0;
		
		for (int index = 0; arr.length >index ;index++) {
			//isPrime(index)== false  && 
			if (arr[index] !=5 && arr[index] !=7 && arr[index]% 5 ==0 && arr[index]%7 == 0){
				sum = sum + arr[index];
			}
		}
		return sum;
	}
	
	int getEvenNum (int [] arr){
		
		
		int sum = 0;
		
		for (int index = 0; arr.length >index ;index++) {
			if (arr[index]%2 == 0){
				sum = sum + arr[index];
			}
		}
		return sum;
	}
	
	int getEvenOddDiff(int[] arr) {

		int sumOfEven = 0;
		int sumOfOdd = 0;

		for (int index = 0; arr.length > index; index++) {
			if (arr[index] % 2 == 0) {
				sumOfEven = sumOfEven + arr[index];
			} else if (arr[index] % 2 != 0) {
				sumOfOdd = sumOfOdd + arr[index];
			}
		}
		int diff = 0;
		if (sumOfEven > sumOfOdd)
			diff = sumOfEven - sumOfOdd;
		else
			diff =  sumOfOdd - sumOfEven;

		return diff;
	}
	
	int getStringVowelCount(String inputName) {
		
		String name = inputName.toLowerCase();
		int lenght=name.length();
		int count =0;
		
		for (int index =0;index <lenght;index++) {
			
			char ch = name.charAt(index);
			
			if ( ch == 'a' || ch =='e' || ch == 'i' || ch =='o' || ch =='u' ){
				count++;
			}
		}
		return count;
	}
	
	int[] getVowelCount (String [] arr){
		
		int arrLength = arr.length;
		int[] outArray = new int [arrLength];
		int outarrayindex =0;
		
		for (int index = 0; arr.length >index ;index++) {
			String indexString = arr[index];
			int num = getStringVowelCount (indexString);
			outArray[outarrayindex] = num;
			outarrayindex++;
			}
		return outArray;
	}
	
	void info(String[] input){
		int length = input.length;
		int[] output = getVowelCount(input);
		for(int index=0; index< length ;index++) {
			System.out.println(input[index ]+" => "+ output[index]);
		}
	}
	
	String getMaxLengthString(String[] input) {
		
		int maxLength = input[0].length() ;
		String outPut = input[0];
		
		for (int index = 1 ;index < input.length  ;index++) {
			
			if ( maxLength < input[index].length()){
				maxLength = input[index].length();
				outPut = input[index];
			}
		}
		return outPut;
	}
	
	public static void main(String[] args) {
	
		int[] input = {11,13,17,22,44};
		int[] input1 = {11,35,17,105,44};
		int[] input2 = {10,11,15,6};
		int[] input3 = {10,11,15,6};
		String [] input4 = {"Ashish","Aditty","Manjiri","Ankita"};
		String [] input5 = {"Ashish","Aditty","Manjiri","Ankita", "Credits"};

		System.out.println("Sum of non prime number in array  : " + new Assignment_20_SKR().getSumOfNotPrimeNo(input));
		System.out.println("Sum of number div by 5 & 7 : "+ new Assignment_20_SKR().getSumNonPrimeDiv_5_7(input1));
		System.out.println("Sum of even number  : "+ new Assignment_20_SKR().getEvenNum(input2));
		System.out.println("Differnce of even and odd num : "+ new Assignment_20_SKR().getEvenOddDiff(input3));
		
		Assignment_20_SKR array = new Assignment_20_SKR();
		System.out.println(" " );
		System.out.println("Vowels in given array string : " );
		System.out.println("Input4 :" + Arrays.toString(input4));
		array.info(input4);	
		
		System.out.println(" " );
		System.out.println("Return name having maximum length: ");
		System.out.println("Input5 :" + Arrays.toString(input5));
		System.out.println("Output: " + array.getMaxLengthString(input5));
	}
}

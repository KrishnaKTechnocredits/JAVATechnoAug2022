/*Assignment - 19 : 9th Sep'2022

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
		 Ankita -> k*/

package pankajBhatt;

public class Assignment18_9_Sep2022 {
	
	int sumOfNumbersInArray(int[] arr) {
		int sum = 0;
		for( int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	
	int sumOfPrimeNumbersFromArray(int[] arr) {
		int sum = 0;
		for( int i = 0; i < arr.length; i++) {
			if(isPrime(arr[i])) {
				sum += arr[i];
			}
		}
		return sum;
	}

	boolean isPrime(int number) {
		boolean flag = true;
		for(int i = 2; i < number / 2; i++){
			if( number % i == 0 ){
				flag = false;
			}
		}
		return flag;
	}
	
	int MaximumNumberInArray(int[] arr){
		int maximumNumber = arr[0]; 
		for( int i = 0; i < arr.length; i++) {
			if(arr[i] > maximumNumber) {
				maximumNumber = arr[i];
			}
		}
		return maximumNumber;
	}
	
	int minumumNumberInArray(int[] arr){
		int minimumNumber = arr[0]; 
		for( int i = 0; i < arr.length; i++) {
			if(arr[i] < minimumNumber) {
				minimumNumber = arr[i];
			}
		}
		return minimumNumber;
	}
	
	String[] middleCharOfArrayelements(String[] arr) {
		String[] outputArr = new String[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i].length() % 2 == 0) {
				outputArr[i] = arr[i] + " -> " + arr[i].charAt(arr[i].length() / 2 - 1);
			}else {
				outputArr[i] = arr[i] + " -> " +  arr[i].charAt(arr[i].length() / 2);
			}
		}
		return outputArr;
	}
	
	public static void main(String[] args) {
		Assignment18_9_Sep2022 assignment18_9_Sep2022 = new Assignment18_9_Sep2022();
		int[] input = {10, 11, 15};
		System.out.println(assignment18_9_Sep2022.sumOfNumbersInArray(input));
		int[] input1= {11,14,17,22,44};
		System.out.println(assignment18_9_Sep2022.sumOfPrimeNumbersFromArray(input1));
		int[] input2= {11,4,55,23,43};
		System.out.println(assignment18_9_Sep2022.MaximumNumberInArray(input2));
		int[] input3= {11,4,55,23,43};
		System.out.println(assignment18_9_Sep2022.minumumNumberInArray(input3));
		String[] input4= {"Ashish","Aditty","Manjiri","Ankita"};
		String[] outputString = assignment18_9_Sep2022.middleCharOfArrayelements(input4);
		for (int i = 0; i < outputString.length; i++) {
			System.out.println(outputString[i]);
		}
	}
}
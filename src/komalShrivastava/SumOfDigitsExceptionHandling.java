//Assignment 35 - 07 Oct 2022

package komalShrivastava;

public class SumOfDigitsExceptionHandling {

	//method to return sum of all the numbers from given String
	
	int getSumOfNumbers(String input) {
		String arr[] = input.split(" ");
		int sum = 0;
		for(int index=0; index<arr.length; index++) {
			try {
				int num = Integer.parseInt(arr[index]);
				sum = sum + num;
			}
			catch(NumberFormatException ne) {
			}
		}
		if(sum==0) {
			System.out.println("No numbers found in given String");
			return 0;
		} else
			return sum;
	}
	
	int getSumOfDigits(String input) {
		int sum = 0;
		for(int index=0; index<input.length(); index++) {
			char ch = input.charAt(index);
			try {
				int num = Integer.parseInt(String.valueOf(ch));
				sum = sum + num;
			}
			catch(NumberFormatException ne) {
			}
		}
		if(sum==0) {
			System.out.println("No digits found in given String");
			return 0;
		} else
			return sum;
	}
	
	
	public static void main(String[] args) {
		SumOfDigitsExceptionHandling sumOfDigitsExceptionHandling = new SumOfDigitsExceptionHandling();
		String str = "i have 15 years and 3 months of experience";
		
		//get sum of numbers in String
		System.out.println("Input : " + str + "\nSum of numbers : "+ sumOfDigitsExceptionHandling.getSumOfNumbers(str));
		System.out.println("\n");
		
		//get sum of digits in string
		System.out.println("Input : " + str + "\nSum of digits : "+ sumOfDigitsExceptionHandling.getSumOfDigits(str));
		System.out.println("\n");
		
		str = "Komal";
		//get sum of numbers in String
		System.out.println("Input : " + str + "\nSum of numbers : "+ sumOfDigitsExceptionHandling.getSumOfNumbers(str));
		System.out.println("\n");
				
		//get sum of digits in string
		System.out.println("Input : " + str + "\nSum of digits : "+ sumOfDigitsExceptionHandling.getSumOfDigits(str));
	}
}
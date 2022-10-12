/*Assignment - 35 : 7th Oct'2022

Program 1 : return sum of all the numbers from given String.
input : i have 15 years and 3 months of experience.
output : 18
Hint : Exception handling, Interger.parseInt(string str) -> to convert string to int. 
if we couldn't covert string to int for any word, it throws NumberFormatException.*/

package rashmiG.Assignment35_exceptiionHandling;

import java.util.Scanner;

public class SumOfAllNumbersFromString {

	int getSumOfNumbers(String str) {
		String[] input = str.split(" ");
		int sum = 0;
		for (int index = 0; index < input.length; index++) {

			try {

				int num = Integer.parseInt(input[index]);
				sum = sum + num;
			}

			catch (NumberFormatException nf) {

			}
		}
		return sum;
	}

	public static void main(String[] args) {
//		SumOfAllNumbersFromString sumOfNumbers = new SumOfAllNumbersFromString();
//		String str="i have 15 years and 3 months of experience.";
//		System.out.println(str);
//		System.out.println("Sum of numbers from given string : "+sumOfNumbers.getSumOfNumbers(str));
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String input= sc.nextLine();
		System.out.println("Sum of numbers from given string : "+new SumOfAllNumbersFromString().getSumOfNumbers(input));
		sc.close();
	}
}

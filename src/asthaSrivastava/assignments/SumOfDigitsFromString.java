/*Program 1 :
Write a method to return sum of all the digits present in each elements from given array.
input : {"Ma1he4sh","A9vni","P1uj3a5","Harshal","A4d4itty","Rahul"}
output : Mahesh -> 5
         Avni -> 9
         Puja -> 9
         Harshal -> 0
         Aditty -> 8
         Rahul -> 0*/
package asthaSrivastava.assignments;

import java.util.Arrays;

public class SumOfDigitsFromString {

	int getSumOfDigit(String str) { // Program 1
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);

			if (Character.isDigit(ch)) {
				int temp = Character.getNumericValue(ch);
				count = count + temp;

			}
		}
		return count;
	}

	void displayResult(String[] input) {

		for (int index = 0; index < input.length; index++) {
			int sum = getSumOfDigit(input[index]);
			System.out.println(input[index] + "-" + +sum);
		}
	}

	public static void main(String[] args) {
		SumOfDigitsFromString output = new SumOfDigitsFromString();
		String[] input = { "Ma1he4sh", "A9vni", "P1uj3a5", "Harshal", "A4d4itty", "Rahul" };

		System.out.println("Given array is : " + Arrays.toString(input));
		output.displayResult(input);

	}
}

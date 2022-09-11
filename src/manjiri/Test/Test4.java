/*Write a method to return sum of all the digits present in each elements from given array.
input : {"Ma1he4sh","A9vni","P1uj3a5","Harshal","A4d4itty","Rahul"}
output : Mahesh -> 5
         Avni -> 9
         Puja -> 9
         Harshal -> 0
         Aditty -> 8
         Rahul -> 0*/

package manjiri.Test;

public class Test4 {

	private int getSumOfDigitsInString(String input) {
		char ch = ' ';
		int sum = 0;
		for (int index = 0; index < input.length(); index++) {
			ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				sum = sum + Character.getNumericValue(ch);
			}
		}
		return sum;
	}

	int[] getSumOfDigitsInArray(String[] arr) {
		int[] output = new int[arr.length];
		for (int index = 0; index < arr.length; index++) {
			int sumOfDigits = getSumOfDigitsInString(arr[index]);
			output[index] = sumOfDigits;
		}
		return output;
	}

	void display(String[] input, int[] output) {
		for (int index = 0; index < input.length; index++) {
			System.out.println(input[index] + " " + "-> " + output[index]);
		}
	}
}
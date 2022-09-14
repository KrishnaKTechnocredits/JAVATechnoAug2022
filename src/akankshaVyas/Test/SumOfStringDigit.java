/*Write a method to return sum of all the digits present in each elements from given array.
input : {"Ma1he4sh","A9vni","P1uj3a5","Harshal","A4d4itty","Rahul"}
output : Mahesh -> 5
         Avni -> 9
         Puja -> 9
         Harshal -> 0
         Aditty -> 8
         Rahul -> 0
*/

package akankshaVyas.Test;

public class SumOfStringDigit {

	int getsumOfDigitInString(String str) {
		int sum = 0;
		for (int index = 0; index < str.length(); index++) {
			if (Character.isDigit(str.charAt(index))) {
				sum = sum + Character.getNumericValue(str.charAt(index));
			}
		}
		return sum;
	}

	int[] getSumofDigitInStringArray(String[] arr) {
		int[] outputSum = new int[arr.length];
		for (int index = 0; index < arr.length; index++) {
			outputSum[index] = getsumOfDigitInString(arr[index]);
		}
		return outputSum;
	}

	void display() {
		String[] input = { "Ma1he4sh", "A9vni", "P1uj3a5", "Harshal", "A4d4itty", "Rahul" };
		int[] output = new int[input.length];
		for (int index = 0; index < input.length; index++) {
			output = getSumofDigitInStringArray(input);
			System.out.println(input[index] + " -> " + output[index]);
		}

	}

	public static void main(String[] args) {
		new SumOfStringDigit().display();
	}
}

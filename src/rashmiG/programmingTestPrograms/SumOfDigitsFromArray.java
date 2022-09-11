/*Test 4 - 11th Sep'2022

Expected time : 15 mins

Write a method to return sum of all the digits present in each elements from given array.
input : {"Ma1he4sh","A9vni","P1uj3a5","Harshal","A4d4itty","Rahul"}
output : Mahesh -> 5
         Avni -> 9
         Puja -> 9
         Harshal -> 0
         Aditty -> 8
         Rahul -> 0*/

package rashmiG.programmingTestPrograms;

class SumOfDigitsFromArray {

	int getSumOfDigits(String name) {
		int sum = 0;
		for (int index = 0; index < name.length(); index++) {
			if (Character.isDigit(name.charAt(index))) {
				sum = sum + Character.getNumericValue(name.charAt(index));
			}
		}
		return sum;
	}

	int[] getSumOfDigitsArray(String[] input) {
		int[] output = new int[input.length];
		for (int index = 0; index < input.length; index++) {
			output[index] = getSumOfDigits(input[index]);
		}
		return output;
	}

	void display(String[] input, int[] output) {
		for (int index = 0; index < input.length; index++) {
			System.out.println(input[index] + " -> " + output[index]);
		}
	}

	public static void main(String[] args) {
		SumOfDigitsFromArray sumOfDigitsFromArray = new SumOfDigitsFromArray();
		String[] input = { "Ma1he4sh", "A9vni", "P1uj3a5", "Harshal", "A4d4itty", "Rahul" };
		int[] output = sumOfDigitsFromArray.getSumOfDigitsArray(input);
		sumOfDigitsFromArray.display(input, output);
	}
}

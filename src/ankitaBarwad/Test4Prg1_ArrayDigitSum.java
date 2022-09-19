/*Program 1 :
Write a method to return sum of all the digits present in each elements from given array.
input : {"Ma1he4sh","A9vni","P1uj3a5","Harshal","A4d4itty","Rahul"}
output : Mahesh -> 5
         Avni -> 9
         Puja -> 9
         Harshal -> 0
         Aditty -> 8
         Rahul -> 0*/
package ankitaBarwad;

public class Test4Prg1_ArrayDigitSum {

	private int[] getArrayOfAllDigitsSum(String[] inputArray) {
		int[] outputArray = new int[inputArray.length];
		for (int index = 0; index < inputArray.length; index++) {
			outputArray[index] = getDigitsSum(inputArray[index]);
		}
		return outputArray;
	}

	private int getDigitsSum(String string) {
		int sum = 0;
		int numericValue;
		char ch;
		for (int index = 0; index < string.length(); index++) {
			ch = string.charAt(index);
			numericValue = Character.getNumericValue(string.charAt(index));
			if (Character.isDigit(ch)) {
				sum = sum + numericValue;
			}
		}
		return sum;
	}
	
	void printSumOfDigitsInArray(String[] alphaNumeric) {
		int[] digitsSum = getArrayOfAllDigitsSum(alphaNumeric);
		for (int index = 0; index < alphaNumeric.length; index++) {
			System.out.println(alphaNumeric[index] + " -> " + digitsSum[index]);
		}
	}

	public static void main(String[] args) {
		Test4Prg1_ArrayDigitSum arrayDigitSum = new Test4Prg1_ArrayDigitSum();
		String[] alphaNumeric = { "Ma1he4sh", "A9vni", "P1uj3a5", "Harshal", "A4d4itty", "Rahul" };
		arrayDigitSum.printSumOfDigitsInArray(alphaNumeric);
	}

}

package sohail.stringprograms;
//Write a method to return sum of all the digits present in each elements from given array.
//input : {"Ma1he4sh","A9vni","P1uj3a5","Harshal","A4d4itty","Rahul"}
//output : Mahesh -> 5
//       Avni -> 9
//       Puja -> 9
//       Harshal -> 0
//       Aditty -> 8
//       Rahul -> 0

public class SumOfDigitInArray {
	int getSumOfDigit(String input) {
		int sum = 0;
		char[] charArray = input.toCharArray();
		for (int index = 0; index < charArray.length; index++) {
			char ch = charArray[index];
			if (Character.isDigit(ch) == true) {
				sum = sum + Character.getNumericValue(ch);
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		SumOfDigitInArray sumofdigitarray = new SumOfDigitInArray();
		String[] inputArray = { "Ma1he4sh", "A9vni", "P1uj3a5", "Harshal", "A4d4itty", "Rahul" };
		for (int index = 0; index < inputArray.length; index++) {
			int sum = sumofdigitarray.getSumOfDigit(inputArray[index]);
			System.out.println(inputArray[index] + " -> " + sum);
		}
	}
}

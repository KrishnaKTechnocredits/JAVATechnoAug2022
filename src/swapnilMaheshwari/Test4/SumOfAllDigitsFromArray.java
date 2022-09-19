/*Write a method to return sum of all the digits present in each elements from given array.
input : {"Ma1he4sh","A9vni","P1uj3a5","Harshal","A4d4itty","Rahul"}
output : Mahesh -> 5
         Avni -> 9
         Puja -> 9
         Harshal -> 0
         Aditty -> 8
         Rahul -> 0*/

package swapnilMaheshwari.Test4;

public class SumOfAllDigitsFromArray {
	int getSumOfAllDitisInString(String input) {
		int sum = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			boolean flag = Character.isDigit(ch);
			if (flag) {
				sum = sum + Character.getNumericValue(ch);
			}
		}

		return sum;

	}

	int[] getSumofAllDigitsInArrayList(String[] arr) {
		int[] output = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			int sumOfDigits = getSumOfAllDitisInString(arr[i]);
			output[i] = sumOfDigits;
		}
		return output;
	}

	public static void main(String[] args) {
		String[] strInArray = { "Ma1he4sh", "A9vni", "P1uj3a5", "Harshal", "A4d4itty", "Rahul" };

		int[] strOutPut = new SumOfAllDigitsFromArray().getSumofAllDigitsInArrayList(strInArray);

		for (int i = 0; i < strInArray.length; i++) {
			System.out.println(strInArray[i] + "->" + strOutPut[i]);
		}
	}

}

/*Program 1 :
Write a method to return sum of all the digits present in each elements from given array.
input : {"Ma1he4sh","A9vni","P1uj3a5","Harshal","A4d4itty","Rahul"}
output : Mahesh -> 5
         Avni -> 9
         Puja -> 9
         Harshal -> 0
         Aditty -> 8
         Rahul -> 0 */

package sagarY.test4sept11;

import java.util.Arrays;

public class SumOfDigitsOfEachStringInAnArray {

	int[] getSumOfDigits(String[] name) {
		int[] sumArr = new int[name.length];
		for (int i = 0; i <= name.length - 1; i++) {
			sumArr[i] = 0;
			for (int j = 0; j <= (name[i].length()) - 1; j++) {
				if (Character.isDigit(name[i].charAt(j))) {
					sumArr[i] += Character.getNumericValue(name[i].charAt(j));
				}
			}
		}
		return sumArr;
	}

	public static void main(String[] args) {
		System.out.println("Program 1: \nWrite a method to return sum of all the digits\npresent in each elements from given array");
		System.out.println("**************************************************");
		String[] inputArray = { "Ma1he4sh", "A9vni", "P1uj3a5", "Harshal", "A4d4itty", "Rahul" };
		System.out.println("Input: \n" + Arrays.toString(inputArray));
		System.out.println("Output: \nSum of digits for each string in the given array are ");
		int[] outputArray = new SumOfDigitsOfEachStringInAnArray().getSumOfDigits(inputArray);
		for (int i = 0; i <= inputArray.length - 1; i++) {
			System.out.println(" " +inputArray[i] + "=> " + outputArray[i]);
		}
	}
}

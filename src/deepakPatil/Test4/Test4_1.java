/*Expected time : 15 mins
Program 1 :
Write a method to return sum of all the digits present in each elements from given array.
input : {"Ma1he4sh","A9vni","P1uj3a5","Harshal","A4d4itty","Rahul"}
output : Mahesh -> 5
         Avni -> 9
         Puja -> 9
         Harshal -> 0
         Aditty -> 8
         Rahul -> 0

Program 2 : Return count of visible trees. [15 - 20 mins, max - 30 mins]

input : {3,7,5}
output : 2

input : {3,5,11,9,10,13}
output : 4
*/

package deepakPatil.Test4;

public class Test4_1 {

	int getSumOfDigitFromString(String name) {
		int sumOfDigit = 0;
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			if (Character.isDigit(ch)) {
				sumOfDigit = sumOfDigit + Character.getNumericValue(ch);
			}
		}
		return sumOfDigit;
	}

	int[] getSumOfDigitFromNamesFromArray(String[] names) {
		int[] sumOfDigitFromString = new int[names.length];
		for (int i = 0; i < names.length; i++) {
			sumOfDigitFromString[i] = getSumOfDigitFromString(names[i]);
		}

		return sumOfDigitFromString;
	}

	public static void main(String[] args) {
		String[] names = { "Ma1he4sh", "A9vni", "P1uj3a5", "Harshal", "A4d4itty", "Rahul" };
		System.out.println("**Sum of digit from names of given array as below**");
		int[] sumOfDigit = new Test4_1().getSumOfDigitFromNamesFromArray(names);
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i] + " -> " + sumOfDigit[i]);
		}
	}
}

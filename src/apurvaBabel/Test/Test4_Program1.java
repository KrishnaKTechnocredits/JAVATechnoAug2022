/*Test 4 :
Program 1 :
Write a method to return sum of all the digits present in each elements from given array.
input : {"Ma1he4sh","A9vni","P1uj3a5","Harshal","A4d4itty","Rahul"}
output : Mahesh -> 5
         Avni -> 9
         Puja -> 9
         Harshal -> 0
         Aditty -> 8
         Rahul -> 0
*/

package apurvaBabel.Test;

public class Test4_Program1 {

	// Method to return sum of all the digits present in each element from given array
	int getSumOfDigitsInString(String arr) {
		int sum = 0;
		int num;
		for (int index = 0; index < arr.length(); index++) {
			char ch = arr.charAt(index);
			if (Character.isDigit(ch)) {
				num = Character.getNumericValue(ch);
				sum = sum + num;
			}
		}
		return sum;
	}

	int[] getStringElement(String[] input) {
		int[] sum = new int[input.length];
		for (int index = 0; index < input.length; index++) {
			sum[index] = getSumOfDigitsInString(input[index]);
		}
		return sum;
	}

	public static void main(String[] args) {
		Test4_Program1 test4 = new Test4_Program1();
		String[] input = { "Ma1he4sh", "A9vni", "P1uj3a5", "Harshal", "A4d4itty", "Rahul" };
		int[] output = test4.getStringElement(input);
		for (int index = 0; index < input.length; index++) {
			System.out.println(input[index] + " --> " + output[index]);
		}
	}
}

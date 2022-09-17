/*Test 4 - 11th Sep'2022
Expected time : 15 mins
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

package sanket;

public class ArrayTest4 {

	//method to return sum of all the digits present in each elements from given array
	int sumOfDigitInString(String name) {

		int sum = 0;
		char ch = 0;
		for (int index = 0; index <= name.length() - 1; index++) {

			if (Character.isDigit(name.charAt(index))) {
				ch = name.charAt(index);
				sum = sum + Character.getNumericValue(ch);
			}
		}
		return sum;
	}

	//Return count of visible trees
	int getCountVisibleTree(int[] arr) {

		int maxLength = 0;
		int count = 0;

		for (int index = 0; index < arr.length; index++) {

			if (maxLength < arr[index]) {
				maxLength = arr[index];
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {

		ArrayTest4 arrayTest4 = new ArrayTest4();

		String[] arr1 = { "Ma1he4sh", "A9vni", "P1uj3a5", "Harshal", "A4d4itty", "Rahul" };
		System.out.println("Sum of all the digits present in each elements from given array : ");

		for (int index = 0; index < arr1.length; index++) {

			System.out.println(arr1[index] + "--->" + arrayTest4.sumOfDigitInString(arr1[index]));
		}

		int[] input1 = { 3, 7, 5 };
		System.out.println("\n" + "The visible trees from given array input1 = {3,7,5} is "
				+ arrayTest4.getCountVisibleTree(input1));

		int[] input2 = { 3, 5, 11, 9, 10, 13 };
		System.out.println("The visible trees from given array input2 = {3,5,11,9,10,13} is "
				+ arrayTest4.getCountVisibleTree(input2));
	}
}
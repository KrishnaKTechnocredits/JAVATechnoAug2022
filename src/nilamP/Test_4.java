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
output : 4*/
package nilamP;

public class Test_4 {
	int getSumOfDigits(String name) {
		int sum = 0;
		for (int i = 0; i <= name.length() - 1; i++) {
			char ch = name.charAt(i);
			if (Character.isDigit(ch)) {
				int num = Character.getNumericValue(ch);
				sum = sum + num;
			}
		}
		return sum;
	}

	int getVisibilityCount(int[] arr) {
		int count = 0;
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
				count++;
			}
		}
		return count;
	}

	public static void main(String args[]) {
		Test_4 t4 = new Test_4();
		String[] names = { "Ma1he4sh", "A9vni", "P1uj3a5", "Harshal", "A4d4itty", "Rahul" };
		for (int i = 0; i < names.length; i++) {
			System.out.println(" Sum of digits in " + names[i] + " >  " + t4.getSumOfDigits(names[i]));

		}
		System.out.println("================================");
		int[] arr1 = { 3, 7, 5 };
		System.out.println("Count of Visible trees: " + t4.getVisibilityCount(arr1));
		int[] arr2 = { 3, 5, 11, 9, 10, 13 };
		System.out.println("Count of Visible trees : " + t4.getVisibilityCount(arr2));
	}
}

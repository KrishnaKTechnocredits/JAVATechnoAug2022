package shubhamG;

import java.util.Arrays;

/*Write a method to return sum of all the digits present in each elements from given array.
input : {"Ma1he4sh","A9vni","P1uj3a5","Harshal","A4d4itty","Rahul"}
output : Mahesh -> 5
         Avni -> 9
         Puja -> 9
         Harshal -> 0
         Aditty -> 8
         Rahul -> 0
*/         
public class Test4 {

	int getSumOfIntegersFromArray(String str) {
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				int num = Character.getNumericValue(ch);
				sum = sum + num;
			}
		}
		return sum;
	}

	void getSumofAlldigit(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int sum1 = getSumOfIntegersFromArray(arr[i]);
			System.out.println(arr[i] + " -> " + sum1);
		}
	}

	public static void main(String[] args) {
		Test4 test4 = new Test4();

		String[] str1 = { "Ma1he4sh", "A9vni", "P1uj3a5", "Harshal", "A4d4itty", "Rahul" };
		System.out.println("Given Input Array is: " + Arrays.toString(str1) + "\n");
		System.out.println("Sum of digits present in strings are -");
		test4.getSumofAlldigit(str1);
	}

}

package namratamishra.stringOperations;
/*
Write a method to return sum of digits in a given string.
input : "Te8chno3cred7it9s"
output : 27
Hint : ch = Character.charAt(index);
Character.isDigit(ch);
int num = Character.getNumericValue(ch); '9'
*/

import java.util.Scanner;

class CountDgtSum {
	int getCountDgtSum(String str) {
		int sum = 0;
		for (int index = 0; index <= str.length() - 1; index++) {
			char ch = str.charAt(index);
			boolean flag = Character.isDigit(ch);
			if (flag) {
				int num = Character.getNumericValue(ch);
				sum = sum + num;

			}
		}
		return sum;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name for finding the sum of digit in given name");
		String name = sc.nextLine();
		System.out.println("sum of digits in given name: " + name + " is : " + new CountDgtSum().getCountDgtSum(name));
		sc.close();
	}
}
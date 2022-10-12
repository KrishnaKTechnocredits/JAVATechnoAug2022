package saroj;

import java.util.Scanner;
import java.util.Arrays;

public class Assignment34 {

	void checkAnagram(String name1, String name2) {
		if (name1.length() != name2.length()) {
			System.out.println("Word is not an Anagram");
		} else if (name1.length() == name2.length()) {
			boolean flag = true;
			char[] ch = name1.toCharArray();
			char[] ch1 = name2.toCharArray();
			Arrays.sort(ch);
			Arrays.sort(ch1);
			for (int index = 0; index < ch.length; index++) {
				if (ch[index] != ch1[index]) {
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.println("Word is Anagaram");
			} else
				System.out.println("Word is not an Anagram");
		}
	}

	int getFactorial(int num) {
		int result = 1;
		for (int index = 1; index <= num; index++) {
			result = result * index;
		}
		return result;
	}

	void getFibonacci(int num) {
		int temp = 0;
		int num1 = 0;
		int num2 = 1;
		System.out.print(num1 + " ");
		System.out.print(num2 + " ");
		for (int index = 1; index < num - 1; index++) {
			temp = num2;
			num2 = num1 + num2;
			num1 = temp;
			System.out.print(num2 + " ");
		}
	}

	public static void main(String[] args) {
		Assignment34 assignment33 = new Assignment34();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 1st string: ");
		String str = sc.next();
		System.out.println("Enter 2nd string: ");
		String str1 = sc.next();
		assignment33.checkAnagram(str, str1);

		System.out.println("======================================");

		System.out.println("Enter number: ");
		int fact = sc.nextInt();
		System.out.println("Factorial of " + fact + " is: ");
		System.out.println(assignment33.getFactorial(fact));
		System.out.println("======================================");

		System.out.println("Enter number: ");
		int fabNum = sc.nextInt();
		System.out.println("Fibonacci of " + fabNum + " is: ");
		assignment33.getFibonacci(fabNum);
		sc.close();
	}
}

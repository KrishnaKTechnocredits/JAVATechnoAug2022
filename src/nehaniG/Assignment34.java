package nehaniG;

import java.util.Scanner;

public class Assignment34 {

	void fibonacciSeries(int num) {
		int num1 = 0;
		int num2 = 1;
		System.out.println(num1 + " ");
		System.out.println(num2 + " ");
		for (int index = 0; index < num - 2; index++) {
			int temp = num2;
			num2 = num1 + num2;
			num1 = temp;
			System.out.println(num2 + " ");
		}
	}

	int factorial(int num) {
		int fact = 1;
		while (num > 0) {
			fact *= num;
			num--;
		}
		return fact;
	}

	int getFreqOfch(int ch, String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				count++;
			}
		}
		return count;
	}

	String isAnagram(String str1, String str2) {
		int len1 = str1.length();
		int len2 = str2.length();
		if (len1 != len2) {
			return "Not Anagram";
		} else {
			for (int i = 0; i < len1; i++) {
				char ch = str1.charAt(i);
				int countch1 = getFreqOfch(ch, str1);
				int countch2 = getFreqOfch(ch, str2);
				if (countch1 != countch2)
					return "Not Anagram";
			}
		}
		return "Anagram";
	}

	public static void main(String[] args) {
		System.out.println("Enter Number : ");
		Scanner sc = new Scanner(System.in);
		int input1 = sc.nextInt();

		Assignment34 assignment34 = new Assignment34();
		System.out.println("Fibonacci Series : ");
		assignment34.fibonacciSeries(input1);

		System.out.println("Factorial Input : ");
		int input2 = sc.nextInt();
		
		System.out.println(assignment34.factorial(input2));
		
		
		
		
		
		System.out.println("Enter String 1 : ");
		String name1 = sc.next();
		System.out.println("Enter String 2 : ");
		String name2 = sc.next();

		System.out.println(assignment34.isAnagram(name1, name2));

	}
}

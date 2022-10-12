/*Assignment - 34 : 2nd Oct'2022

Program 1 : 
How to check if two given String is the anagram of each other (using scanner class)?
Input1: catc
Input2: actc
Output: anagram

Program 2 : 
Write a method to return factorial of user defined given number (using scanner class).

input : 5
outut : 120

Program 3 : 
Print fibonacci series till Nth number.
input : 8
output : 0 1 1 2 3 5 8 13
*/

package pranjaliV.assignment34;

import java.util.Scanner;

public class ArrayEx34 {
	
	int getFrequency(String input, char target) {
		int charFreq = 0;
		for(int index=0; index<input.length(); index++) {
			char ch = input.charAt(index);
			if(ch==target) {
				charFreq++;
			}
		}
		return charFreq;
	}
	
	void isAnagram(String input1,String input2) {
		boolean isAna = true;
		int countCh1 = 0 ;
		int countCh2 = 0 ;
		if(input1.length()==input2.length()) {
			for(int index=0; index<input1.length();index++) {
				char ch = input1.charAt(index);
				countCh1 = getFrequency(input1,ch);
				countCh2 = getFrequency(input2,ch);
				if(countCh1!=countCh2) {
					isAna = false;
					System.out.println(input1 + " and " + input2 + " are not Anagram");
					break;
				}
			}
			if(isAna) {
				System.out.println(input1 + " and " + input2 + " are Anagram");
			}
		}
		else {
			System.out.println(input1 + " and " + input2 + " are not Anagram");
		}
		
	}
	
	void printFactorial(int n) {
		/*
		 5! = 1*2*3*4*5
		 factorial = 1 * 1 = 1
		 		   = 1 * 2 = 2 -- factorial =  factorial * num 
		 		   = 2 * 3 = 6
		 		   = 6 * 4 = 24
		 		   = 24 * 5 = 120
		 */
		int num = 1;
		int factorial = 1;
		while (num<=n) {
			factorial = factorial * num;
			num++;
		}
		System.out.print("Factorial of " + n + " is : " + factorial);
	}
	
	void printFibonacii(int num) {
		int index=0;
		int sum1 = 0;
		int sum2 = 1;
		int temp = 0;
		System.out.print("Fibonacci series of " +num+ " is : " );
		while(index<num) {
			System.out.print(sum1 + " ");
			temp = sum1 + sum2;
			sum1 = sum2;
			sum2=temp;		
			index++;
		}
	}

	public static void main(String[] args) {
		ArrayEx34 ex34 = new ArrayEx34();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("---To find if two Strings are Anagram---");
		System.out.println("Enter 1st String Input : ");
		String input1 = sc.nextLine();
		System.out.println("Enter 2nd String Input : ");
		String input2 = sc.nextLine();
		ex34.isAnagram(input1,input2);
		
		System.out.println(" ");
		System.out.println("---To print Factorial of a number---");
		System.out.println("Enter Number to calculate factorial : ");
		int input3 = sc.nextInt();
		ex34.printFactorial(input3);
		System.out.println(" ");
		
		System.out.println(" ");
		System.out.println("---To print Fibonacci series---");
		System.out.println("Enter Number to calculate Fibonacci series : ");
		int input4 = sc.nextInt();
		ex34.printFibonacii(input4);
		sc.close(); 
	}

}

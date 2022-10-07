/*
 * Assignment - 34 : 2nd Oct'2022

Program 1 : How to check if two given String is the anagram of each other (using scanner class)?

Input1: catc
Input2: actc

Output: anagram

Program 2 : Write a method to return factorial of user defined given number (using scanner class).
input : 5
outut : 120

Program 3 : Print fibonacci series till Nth number.
input : 8
output : 0 1 1 2 3 5 8 13
 */
package akankshaVyas.Arraypkg;

import java.util.Arrays;
import java.util.Scanner;

public class Ass34AnagFactFebocci {

	boolean getAnagramString(String str1, String str2) {
boolean flag=true;
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();

		Arrays.sort(arr1);
		Arrays.sort(arr2);
		for (int index = 0; index < arr1.length; index++) {
			if (arr1[index] != arr2[index]) {
							flag= false;
							break;
							}
		}
		return flag;

	}
	void printFactorial(int num) {
		System.out.println("Factorial of " + num + " is - " );
		int fact=1;
		while(num>=1) {
			fact=fact*num;
			num--;
			}
		System.out.println(fact);
	}
	
	void printFabonacci(int n) {
		System.out.println("Fabonacci series till " + n +" num");
		int num1=0,num2=1;
		System.out.print(num1 + " ");
		System.out.print(num2 + " ");
		for(int index=0;index<n-2;index++){
			int temp=num2;
			num2=num1+num2;
			num1=temp;
			System.out.print(num2 + " ");
					}
	}
	
	void display(String str1, String str2) {
		if(getAnagramString(str1,str2)) {
				System.out.println("It is anagram string");}
		else {
		System.out.println("It is not anagram string");}
		
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter num for factorial : ");
		int num=sc.nextInt();
		Ass34AnagFactFebocci ass34AnagFactFebocci=new Ass34AnagFactFebocci();
		ass34AnagFactFebocci.printFactorial(num);
		System.out.println("======================================");
		System.out.println("Enter Nth 5num for Fabonacci : ");
		 num=sc.nextInt();
		ass34AnagFactFebocci.printFabonacci(num);
		System.out.println("\n ===================================================");
		System.out.println("Enter Strings 1,2,3,4 :");
		String str1=sc.next();
		String str2=sc.next();
		String str3=sc.next();
		String str4=sc.next();
		ass34AnagFactFebocci.display(str1, str2);
		System.out.println(ass34AnagFactFebocci.getAnagramString(str3, str4));
		sc.close();
	}
	
}

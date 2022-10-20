/* Assignment - 34 : 2nd Oct'2022

Program 1 : How to check if two given String is the anagram of each other (using scanner class)?

Input1: catc
Input2: actc

Output: anagram

Program 2 : Write a method to return factorial of user defined given number (using scanner class).
input : 5
outut : 120

Program 3 : Print fibonacci series till Nth number.
input : 8
output : 0 1 1 2 3 5 8 13*/
package shrutiArora;
import java.util.*;
public class Assignment34 {
	boolean isAnagram(String str1, String str2) {
		System.out.println("input1: " + str1);
		System.out.println("input2: " + str2);
        char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		if(arr1.length == arr2.length) {
			for(int index = 0; index < arr1.length; index++) {
				if (arr1[index] != arr2[index]) { 
					return false;
				}
			}
			return true;
		}
		else {
			return false;
		}	
	}

   int getFactorialOfNum(int num) {
	   System.out.println("factorial of a number: " + num);
        int fact = 1;
	    while(num>0) {
		   fact *= num;
		   num--;
	   }
	   return fact;
   }
   void printFibonacciSeries(int num) {
	   System.out.print("Fibonacci series till " + num + " : ");
       int num1 = 0 ;
	   int num2 = 1;
	   System.out.print(num1 + " ");
	   System.out.print(num2 + " ");
	   for(int index = 0 ; index<= num-2 ; index++) {
		   int temp = num2;
		   num2 = num1 + num2;
		   num1 = temp;
		   System.out.print(num2 + " ");
	   }
   }
   public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   Assignment34 a34 = new Assignment34();
	   System.out.println("***********************************************************Program-1********************************************************");
	   System.out.println("Enter first String ");
	   String str1 = sc.next();
	   System.out.println("Enter second String ");
	   String str2 = sc.next();
	   boolean flag = a34.isAnagram(str1, str2);
	   if(flag) {
		   System.out.println("Anagram");
	   }
	   else {
		   System.out.println("not Anagram");
	   }
	   System.out.println("************************************************************************Program-2*******************************************************");
	   int num = sc.nextInt();
	   int fact = a34.getFactorialOfNum(num);
	   System.out.println(fact);
	   System.out.println("************************************************************************Program-3*******************************************************");
	   int term = sc.nextInt();
	   a34.printFibonacciSeries(term);
   }
}
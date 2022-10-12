package priyankaD.assignments_31_40;
import java.util.Arrays;
import java.util.Scanner;

public class Assignment_34 {
/*Program 1 : How to check if two given String is the anagram of each other (using scanner class)?
				Input1: catc
				Input2: actc
				Output: anagram*/
		boolean isAnagram (String str1, String str2) {
			char[] arr1=str1.toCharArray();
			char[]arr2=str2.toCharArray();
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			for(int index=0;index<arr1.length;index++) {
				if(arr1[index]!=arr2[index]) {
					System.out.println(str1+" and "+str2+" are not anagram strings.");
					return false;
					}
				}
			     System.out.println(str1+" and "+str2+" are anagram strings.");
				return true;
			}
/*Program 2 : Write a method to return factorial of user defined given number (using scanner class).
		input : 5
		outut : 120*/
		int getFactorial(int num) {
			   int fact=1;
			   for(int index=1;index<=num;index++) {
				   fact=fact*index;
			   }
			   System.out.println("Factorial of "+num+" is->"+ fact);
			   return fact;
		   }
/*Program 3 : Print fibonacci series till Nth number.
		   input : 8
		   output : 0 1 1 2 3 5 8 13*/
		 void printFibonacciSeries(int n) {
			   System.out.println("output fibonacci series->");
			   int num1=0;
			   int num2=1;
			   System.out.print(num1+" ");
			   System.out.print(num2+" ");
			   for(int index=1;index<=n-2;index++) {
				   int temp=num2;
				   num2=num1+num2;
				   num1=temp;
				   System.out.print(num2+" ");
			   }
		   }

	  public static void main(String[]args) {
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Find whether strings are anagram-");
		  System.out.println("Input1-");
		  String str1=sc.next();
		  System.out.println("Input2-");
		  String str2=sc.next();
		  
		  Assignment_34 assignment=new Assignment_34();
		  assignment.isAnagram(str1,str2);
		  System.out.println("----------------------------------");
		  System.out.println("Find Factorial of number-");
		  System.out.println("Input-");
		  int num=sc.nextInt();
		  assignment.getFactorial(num);
		  System.out.println("-----------------------------------");
		  System.out.println("Print Fibonacci Seriess-");
		  System.out.println("Input->");
		  int n=sc.nextInt();
		  assignment.printFibonacciSeries(n);
		  sc.close();
	  }
}

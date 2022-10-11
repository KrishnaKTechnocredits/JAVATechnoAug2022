/*
 * Assignment-27 : 23rd Sep'2022
 
Program - 1. Write a program to print unique character of each name in given string array.
 
 String[] arr = {"Maulik", "Kanani","Mahesh", "Kanani"};
  
  Name is Maulik :
  M
  a
  u
  l
  i
  k
  ----------------------
  Name is Kanani : 
  K
  i

Program - 2.  Write a program to print 1st unique character of each name in given string array.
 
 String[] arr = {"Maulik", "KananiK", "akanksha"};
 
 Name is Maulik : M
 -------------------
 Name is KananiK : i
 -------------------
 Name is akanksha : n 
 */

package rahulSaswadkar.arrayPrograms;

import java.util.Arrays;

public class ArrayProgram11 {
	public static void main(String[] args) {
		ArrayProgram11 arrayProgram11 = new ArrayProgram11();
		
		String[] arr1 = {"Maulik", "Kanani","Mahesh", "Kanani"};
		String[] arr2 = {"Maulik", "KananiK", "akanksha"};
		
		arrayProgram11.printUniqueCharOfStr(arr1);
		arrayProgram11.printFirstUniqueCharOfStr(arr2);
	}
	
	void printUniqueCharOfStr(String[] arr) {
		System.out.println("Program 1 - Print unique character of each name in given string array" );
		System.out.println("\nGiven Array of String is " + Arrays.toString(arr));
		for(int index = 0 ; index < arr.length ; index++) {
			System.out.println("Name is \"" + arr[index] + "\" : " );
			for(int innerIndex = 0; innerIndex < arr[index].length() ; innerIndex++) {
				if(arr[index].indexOf(arr[index].charAt(innerIndex))  == arr[index].lastIndexOf(arr[index].charAt(innerIndex))     ) {
					System.out.println(arr[index].charAt(innerIndex));
				}
				
			}
			System.out.println("--------------------------------------------------------");
		}
		System.out.println("===========================================Program 1 Output Ends===============================================\n\n");
	}
	
	void printFirstUniqueCharOfStr(String[] arr) {
		System.out.println("Program 2 - Print First unique character of each name in given string array" );
		System.out.println("\nGiven Array of String is " + Arrays.toString(arr));
		for(int index = 0 ; index < arr.length ; index++) {
			System.out.print("Name is \"" + arr[index] + "\" : " );
			for(int innerIndex = 0; innerIndex < arr[index].length() ; innerIndex++) {
				if(arr[index].indexOf(arr[index].charAt(innerIndex))  == arr[index].lastIndexOf(arr[index].charAt(innerIndex))     ) {
					System.out.println(arr[index].charAt(innerIndex));
					break;
				}
				
			}
			System.out.println("--------------------------------------------------------");
		}
		System.out.println("===========================================Program 2 Output Ends===============================================");
	}

}

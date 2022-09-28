/*
 * Assignment-27 : 23rd Sep'2022
  1. Write a program to print unique character of each name in given string array.
 
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
  I

2.  Write a program to print 1st unique character of each name in given string array.
 
 String[] arr = {"Maulik", "KananiK", "akanksha"};
 
 Name is Maulik : M
 -------------------
 Name is KananiK : i
 -------------------
 Name is akanksha : n 

 */
package harshalRane.Assignments.assignment27;

import java.util.Arrays;

public class Assignment27 {
	void printUniqueCharFromArray(String[] input) {

		for(int index=0;index<input.length;index++) {
			for(int innerIndex=0;innerIndex<input[index].length();innerIndex++) {
				char ch = input[index].charAt(innerIndex);
				
				int index1 = input[index].indexOf(ch);
				int index2 = input[index].lastIndexOf(ch);	
				
				if(index1 == index2) {
					System.out.println(ch);
				}
			}
			System.out.println("----");
		}
	}
	
	void printFirstUniqueCharFromArray(String[] input) {

		for(int index=0;index<input.length;index++) {
			for(int innerIndex=0;innerIndex<input[index].length();innerIndex++) {
				char ch = input[index].charAt(innerIndex);
				
				int index1 = input[index].indexOf(ch);
				int index2 = input[index].lastIndexOf(ch);	
				
				if(index1 == index2) {
					System.out.println(ch);
					break;
				}
			}
			System.out.println("-----");
		}
	}
	
	
	public static void main(String[] args) {
		Assignment27 assignment27 = new Assignment27();
		String[] input = {"Maulik", "Kanani","Mahesh", "Kanani"};
		String[] input1 =  {"Maulik", "KananiK", "akanksha"};
		
		System.out.println(Arrays.toString(input));
		System.out.println("*** Unique Characters From given array ***");
		assignment27.printUniqueCharFromArray(input);
		
		System.out.println(Arrays.toString(input1));
		System.out.println("*** First Unique Character From given array ***");
		assignment27.printFirstUniqueCharFromArray(input1);
	}
}

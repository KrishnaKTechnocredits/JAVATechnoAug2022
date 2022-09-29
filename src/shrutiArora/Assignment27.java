/* Assignment-27 
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
  i
  2.  Write a program to print 1st unique character of each name in given string array.
 
 String[] arr = {"Maulik", "KananiK", "akanksha"};
 
 Name is Maulik : M
 -------------------
 Name is KananiK : i
 -------------------
 Name is akanksha : n 


*/
package shrutiArora;

import java.util.Arrays;

public class Assignment27 {
	void printAllUniqueCharacter(String[] arr) {
		for(int index = 0 ; index<arr.length;index++) {
			System.out.println("Name: " + arr[index]);
		
         for(int innerIndex = 0 ;innerIndex< arr[index].length();innerIndex++) {
		    	char ch = arr[index].charAt(innerIndex);
		    	if(arr[index].indexOf(ch)== arr[index].lastIndexOf(ch)) {
		    		System.out.println(ch);
		    	}
         }
		}
	}
	void printFirstUniqueCharacter(String[] arr) {
		for(int index = 0 ; index<arr.length;index++) {
			System.out.println(arr[index]);
		
         for(int innerIndex = 0 ;innerIndex< arr[index].length();innerIndex++) {
		    	char ch = arr[index].charAt(innerIndex);
		    	if(arr[index].indexOf(ch)== arr[index].lastIndexOf(ch)) {
		    		System.out.println(ch);
		    		break;
		    	}
         }
		}
	}
	public static void main(String[] args) {
		Assignment27 assignment27 = new Assignment27();
		System.out.println("********************************************************Assignment27******************************");
		String[] arr =  {"Maulik", "Kanani","Mahesh", "Kanani"};
		String[] name = {"Maulik", "KananiK", "akanksha"};
		System.out.println(Arrays.toString(arr));
		assignment27.printAllUniqueCharacter(arr);
		System.out.println(Arrays.toString(name));
		assignment27.printFirstUniqueCharacter(name);
	}
}
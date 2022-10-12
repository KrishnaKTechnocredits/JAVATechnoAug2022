/*Assignment-27 : 23rd Sep'2022?*
 
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
 
package deepakPatil.Assignment27EnhanceForIndexOf;

import java.util.Arrays;

public class Assignment27 {

	void printUniqueChar(String[] input) {
		System.out.println("Given string array is: " + Arrays.toString(input));
		for (String name : input) {
			System.out.println("Unique characher from '" + name + "' as below");
			for (int index = 0; index < name.length(); index++) {
				if (name.indexOf(name.charAt(index)) == name.lastIndexOf(name.charAt(index))) {
					System.out.println(name.charAt(index));
				}
			}
			System.out.println("***************************************");
		}
	}

	void printFirstUniqueChar(String[] input) {
		System.out.println("\nGiven string array is: " + Arrays.toString(input));
		for (String name : input) {
			System.out.println("First unique character from '" + name + "' is:");
			for (int index = 0; index < name.length(); index++) {
				if (name.indexOf(name.charAt(index)) == name.lastIndexOf(name.charAt(index))) {
					System.out.println(name.charAt(index));
					break;
				}
			}
			System.out.println("***************************************");
		}
	}

	public static void main(String[] args) {
		String[] arr1 = { "Maulik", "Kanani", "Mahesh", "Kanani" };
		String[] arr2 = {"Maulik", "KananiK", "akanksha"};
		Assignment27 assignment27 = new Assignment27();
		assignment27.printUniqueChar(arr1);
		assignment27.printFirstUniqueChar(arr2);
	}
}
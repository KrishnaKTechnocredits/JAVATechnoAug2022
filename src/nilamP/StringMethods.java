/*Assignment-27 
  1. Write a program to print unique character of each name in given string array.
 
 String[] arr = {"Maulik", "Kanani","Mahesh", "Kanani"};
  
  Name is Maulik :
  M
  a
  u
  l
  i
  k
  
  2.  Write a program to print 1st unique character of each name in given string array.
 
 String[] arr = {"Maulik", "KananiK", "akanksha"};
 
 Name is Maulik : M
 -------------------
 Name is KananiK : i
 -------------------
 Name is akanksha : n */

package nilamP;

import java.sql.Array;
import java.util.Arrays;

public class StringMethods {

	static void getUniqueChar(String[] arr) {
		for (String name : arr) {
			System.out.println(name + " :");
			// name = name.toUpperCase();

			for (int index = 0; index < name.length(); index++) {
				char ch = name.charAt(index);
				int i = name.indexOf(ch);
				int j = name.lastIndexOf(ch);
				if (i == j) {
					System.out.println(ch);

				}
			}
		}
	}

	void getFirstUnique(String[] arr) {
		for (String name : arr) {
			System.out.println(name + " :");
			// name = name.toUpperCase();

			for (int index = 0; index < name.length(); index++) {
				char ch = name.charAt(index);
				int i = name.indexOf(ch);
				int j = name.lastIndexOf(ch);
				if (i == j) {
					System.out.println(ch);
					break;
				}
			}
		}

	}

	public static void main(String[] args) {
		StringMethods sm = new StringMethods();
		String[] input = { "Maulik", "Kanani", "Mahesh", "Kanani" };
		System.out.println("Input : :" + Arrays.toString(input));
		sm.getUniqueChar(input);
		String[] input1 = { "Maulik", "KananiK", "akanksha" };
		System.out.println("Input :" + Arrays.toString(input1));
		sm.getFirstUnique(input1);
	}
}

/*Program - 2.  Write a program to print 1st unique character of each name in given string array.
 
 String[] arr = {"Maulik", "KananiK", "akanksha"};
 
 Name is Maulik : M
 -------------------
 Name is KananiK : i
 -------------------
 Name is akanksha : n  
 */

package sagarY.Assignment_27;
import java.util.Arrays;

public class PrintFirstUniqChar {

	void printFirstUniqChar(String[] arr) { 
		
		for (String name : arr) { // used enhanse for loop to iterate whole array
			System.out.println("The name is: " + name);
			name = name.toLowerCase(); // it will lower case String so that to verify char uniqueness
			for (int index = 0; index < name.length(); index++) {   //to iterate till name length
				if (name.indexOf(name.charAt(index)) == name.lastIndexOf(name.charAt(index))) {
					System.out.println("First Unique Char of the String is: \n" + name.charAt(index));
					break;
				}

			}
			System.out.println("***********************************");
		}
	}

	public static void main(String[] args) {
		System.out.println("Program 2-Write a program to print 1st unique \r\n"
				+ "character of each name in given string array");
		String[] arr = { "Maulik", "Kananik", "Maheshm", "Aashvi" }; // Defined String Array
		System.out.println("********************************************");
		System.out.println("Given Array is: " + Arrays.toString(arr)); //print array
		System.out.println("********************************************");
		PrintFirstUniqChar printChar = new PrintFirstUniqChar();
		printChar.printFirstUniqChar(arr);
	}

}

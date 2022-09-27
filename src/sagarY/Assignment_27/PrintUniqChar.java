/*Program - 1. Write a program to print unique character of each name in given string array.
 
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
 */

package sagarY.Assignment_27;
import java.util.Arrays;

public class PrintUniqChar {

	void printUniqChar(String[] arr) {        
		
		for (String name : arr) {			//used enhanse for loop
			System.out.println(name);	
			name = name.toLowerCase();		//it will lower case String so that to verify char uniqueness
			for (int index = 0; index < name.length(); index++) {
				if (name.indexOf(name.charAt(index)) == name.lastIndexOf(name.charAt(index)))
					System.out.println(name.charAt(index));
			}
			System.out.println("***********************************");
		}
	}

	public static void main(String[] args) {
		System.out.println("Program - 1. Write a program to print unique \ncharacter "
				+ "of each name in given string array");
		String[] arr = { "Maulik", "Kanani", "Mahesh", "Aashvi" };
		System.out.println("********************************************");
		System.out.println("Given Array is: " + Arrays.toString(arr));
		System.out.println("********************************************");
		PrintUniqChar newPrint =  new PrintUniqChar();
		newPrint.printUniqChar(arr);
	}

}

/* Assignment-27 : 23rd Sep'2022
 
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

package pujaSah.assignments20_30;

public class UniquLettersInWords {

	// Program 1: print unique character of each name in given string array.
	void displayUniqueLettersInEachString(String[] inArr) {
		for (String name : inArr) {
			System.out.println(name);
			for (int index = 0; index < name.length(); index++) {
				if ((name.indexOf(name.charAt(index)) == name.lastIndexOf(name.charAt(index)))) {
					System.out.println(name.charAt(index));
				}
			}
		}
	}

	// Program 2: print 1st unique character of each name in given string array.
	void displayFirstUniqueLetterInEachString(String[] inArr) {
		for (String name : inArr) {
			System.out.println(name);
			for (int index = 0; index < name.length(); index++) {
				if ((name.indexOf(name.charAt(index)) == name.lastIndexOf(name.charAt(index)))) {
					System.out.println(name.charAt(index));
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		String[] arr1 = { "Maulik", "Kanani", "Mahesh", "Kanani" };
		String[] arr2 = { "Maulik", "KananiK", "akanksha" };

		System.out.println("Unique character of each name in given string array are:");
		new UniquLettersInWords().displayUniqueLettersInEachString(arr1);

		System.out.println("First unique character of each name in given string array are:");
		new UniquLettersInWords().displayFirstUniqueLetterInEachString(arr2);
	}
}

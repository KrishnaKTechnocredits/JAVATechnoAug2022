/*Assignment-27 :
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

package apurvaBabel.Assignment21to30;

public class Assignment27 {
	// Print unique character of each name from given string array
	void printUniqueCharacters(String[] arr) {
		System.out.println("Unique characters from each name :");

		for (String name : arr) {
			System.out.println("Name is " + name + ":");
			name = name.toUpperCase();

			for (int index = 0; index < name.length(); index++) {
				char ch = name.charAt(index);
				int i = name.indexOf(ch);
				int j = name.lastIndexOf(ch);

				if (i == j) {
					System.out.println(ch);
				}
			}
			System.out.println("------------------------------");
		}
	}

	// Print first unique character of each name from given string array
	void printFirstUniqueCharacter(String[] arr) {
		System.out.println("\n\nFirst unique character from each name :");

		for (String name : arr) {
			System.out.println("Name is " + name + ":");
			name = name.toUpperCase();

			for (int index = 0; index < name.length(); index++) {
				char ch = name.charAt(index);
				int i = name.indexOf(ch);
				int j = name.lastIndexOf(ch);

				if (i == j) {
					System.out.println(ch);
					break;
				}
			}
			System.out.println("------------------------------");
		}
	}

	public static void main(String[] args) {
		Assignment27 assignment27 = new Assignment27();
		String[] arr = { "Maulik", "Kanani", "Mahesh", "Apurva" };
		assignment27.printUniqueCharacters(arr);
		String[] arr2 = { "Maulik", "Kananik", "Akanksha", "Apurva" };
		assignment27.printFirstUniqueCharacter(arr2);
	}
}

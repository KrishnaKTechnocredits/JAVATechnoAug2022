/*Assignment-27 : 23rd Sep'2022
 
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

package asthaSrivastava.assignments;

public class UniqueChar {

	// method to find unique character
	void getUniqueChar(String[] arr) {
		String name = "";
		for (int index = 0; index < arr.length; index++) {
			name = arr[index];
			System.out.println(arr[index]);

			for (int i = 0; i < name.length(); i++) {
				char ch = name.charAt(i);
				if (name.indexOf(ch) == name.lastIndexOf(ch)) {
					System.out.println(ch);
				}
			}
		}
	}
	
	// method to find 1st unique character
		void getFirstUniqueChar(String[] arr) {
			String name = "";
			System.out.println("-----------");
			for (int index = 0; index < arr.length; index++) {
				name = arr[index];
				System.out.println(arr[index]);

				for (int i = 0; i < name.length(); i++) {
					char ch = name.charAt(i);
					if (name.indexOf(ch) == name.lastIndexOf(ch)) {
						System.out.println(ch);
						break;
					}
				}
			}
		}

	public static void main(String[] args) {
		UniqueChar test = new UniqueChar();
		String[] arr = { "Maulik", "Kanani", "Mahesh", "Kanani" };
		test.getUniqueChar(arr);
		
		String[] arr1 = {"Maulik", "KananiK", "akanksha"};
		test.getFirstUniqueChar(arr1);

	}

}

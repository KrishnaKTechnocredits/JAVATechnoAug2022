/*Assignment-27 : 23rd Sep'2022 */

package swatiM.assignment.arrayPrograms;

public class AssignmentUniqueCharacter27 {

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
  i */
	void printAllUniqueCharacter(String[] input) {
		for (String name : input) {
			System.out.println("\n The name is - " + name); // print each string from array 
			for (int index = 0; index < name.length(); index++) {
				// char ch = name.charAt(index); // get character from input string and store it in char
				if ((name.indexOf(name.charAt(index))) == (name.lastIndexOf(name.charAt(index)))) //Compare index of char with last index of char 
				{ 
					System.out.println(name.charAt(index)); // print character of index 
				}

			}

		}
	}
	
/*	Program - 2.  Write a program to print 1st unique character of each name in given string array.
	 
	 String[] arr = {"Maulik", "KananiK", "akanksha"};
	 
	 Name is Maulik : M
	 -------------------
	 Name is KananiK : i
	 --------------------
	 Name is akanksha : n */	
	
	void printFirstUniqueCharacter(String[] input) {
		for(String name : input) {
			System.out.println("\n The name is -  " +name);// print each string from array 
			for(int index=0 ; index < name.length() ; index++) {
				if(name.indexOf(name.charAt(index))== (name.lastIndexOf(name.charAt(index)))) //Compare index of char with last index of char 
				{
					System.out.println(name.charAt(index));// print character of index 
					break;
				}
				
			}
		}
		
		
	}

	public static void main(String[] args) {

		System.out.println("/*Program - 1. Write a program to print unique character of each name in given string array.\r\n"
				+ " \r\n"
				+ " String[] arr = {\"Maulik\", \"Kanani\",\"Mahesh\", \"Kanani\"};  ");
		
		String[] arr1 = { "Maulik", "Kanani", "Mahesh", "Kanani" };

		new AssignmentUniqueCharacter27().printAllUniqueCharacter(arr1);
		
		System.out.println("Program - 2.  Write a program to print 1st unique character of each name in given string array.\r\n"
				+ "	 \r\n"
				+ "	 String[] arr = {\"Maulik\", \"KananiK\", \"akanksha\"};  ");
		
		String[] arr2 = {"Maulik", "KananiK", "akanksha"};

		new AssignmentUniqueCharacter27().printFirstUniqueCharacter(arr2);
		
		
		
	}

}

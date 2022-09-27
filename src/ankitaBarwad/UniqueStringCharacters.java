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
 Name is akanksha : n */
package ankitaBarwad;

public class UniqueStringCharacters {

	void printUniqueStringCharacter(String[] stringInput) {
		System.out.println("*Unique characters of each names*\n");
		for (int index = 0; index < stringInput.length; index++) {
			String name = stringInput[index];
			System.out.println((index + 1) + ")Name is " + name + " :");
			for (int innerIndex = 0; innerIndex < name.length(); innerIndex++) {
				if (name.indexOf(name.charAt(innerIndex)) == name.lastIndexOf(name.charAt(innerIndex))) {
					System.out.println(name.charAt(innerIndex));
				}
			}
			System.out.println("-------------------------------");
		}
		System.out.println("-------------------------------");
	}

	void printFirstUniqueStringCharacter(String[] stringInput) {

		System.out.println("*1st unique character of each names*\n");
		for (int index = 0; index < stringInput.length; index++) {
			String name = stringInput[index];
			System.out.print((index + 1) + ")Name is " + name + " : ");
			for (int innerIndex = 0; innerIndex < name.length(); innerIndex++) {
				if (name.indexOf(name.charAt(innerIndex)) == name.lastIndexOf(name.charAt(innerIndex))) {
					System.out.println(name.charAt(innerIndex));
					break;
				}
			}
			System.out.println("-------------------------------");
		}
		System.out.println("-------------------------------");
	}

	public static void main(String[] args) {

		UniqueStringCharacters uniqueStringCharacters = new UniqueStringCharacters();
		String[] arr1 = { "Maulik", "Kanani", "Mahesh", "Kanani" };
		uniqueStringCharacters.printUniqueStringCharacter(arr1);
		String[] arr2 = { "Maulik", "KananiK", "akanksha" };
		uniqueStringCharacters.printFirstUniqueStringCharacter(arr2);
	}

}

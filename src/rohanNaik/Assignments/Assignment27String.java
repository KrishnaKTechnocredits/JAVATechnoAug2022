/*1. Write a program to print unique character of each name in given string array.
 
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
package rohanNaik.Assignments;

public class Assignment27String {

	void startingUniqueCharacter(String[] input) {
		String[] arr = input;
		for(int index = 0; index<input.length; index++) {
			String str = arr[index];
			str = str.toLowerCase();
			int i = 0;
			while(str.length() > 0) {
				char ch = str.charAt(0);
				int originallength = str.length();
				String replaceElement = Character.toString(ch);
				str = str.replace(replaceElement, "");
				int newLength = str.length();
				int difference = originallength - newLength;
				if(difference==1){
					System.out.println(replaceElement);
					break;
				}
			}
			System.out.println("=====================");
		}
		
	}

	void uniqueCharacter(String[] input) {
		String[] arr = input;
		for (int index = 0; index < input.length; index++) {
			String str = arr[index];
			str = str.toLowerCase();

			while (str.length() > 0) {
				char ch = str.charAt(0);
				int originallength = str.length();
				String replaceElement = Character.toString(ch);
				str = str.replace(replaceElement, "");
				int newLength = str.length();
				int difference = originallength - newLength;
				if (difference == 1)
					System.out.println(replaceElement);
			}
			System.out.println("=====================");
		}

	}

	public static void main(String[] args) {
		Assignment27String obj = new Assignment27String();
		String[] input = { "Maulik", "Kanani", "Mahesh", "Kanani" };
		obj.uniqueCharacter(input);
		System.out.println("********************************");
		String[] input1 = { "Maulik", "KananiK", "akanksha" };
		obj.startingUniqueCharacter(input1);

	}

}

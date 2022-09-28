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

package smitaVetal.Assignment20_30;

public class Assignment27 {

	// enhanced for loop for giving each word from string
	void getStringFromArray(String[] arr) {

		System.out.println("Print all unique character from string array");
		for (String word : arr) {
			getUniqueChar(word);
			System.out.println("-----------");
		}
	}

	// method to get all unique characters from word
	void getUniqueChar(String word) {
		System.out.println("Word is  -> " + word);
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (word.indexOf(ch) == word.lastIndexOf(ch)) {
				System.out.println(ch);
			}
		}
	}

	// method to get each word from array string using enhanced for loop
	void getString2FromArray(String[] arr) {
		System.out.println("Print only one unique character from string array");
		for (String word : arr) {
			getOneUniqueChar(word);
			System.out.println("-----------");
		}
	}

	// method to get only one unique character from word
	void getOneUniqueChar(String word) {
		System.out.println("Word is  -> " + word);
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (word.indexOf(ch) == word.lastIndexOf(ch)) {
				System.out.println(ch);
				break;
			}
		}
	}

	public static void main(String[] args) {
		Assignment27 A27 = new Assignment27();
		String[] input = { "Maulik", "Kanani", "Mahesh", "Kanani" };
		A27.getStringFromArray(input);
		String[] arr = { "Maulik", "KananiK", "akanksha" };
		A27.getString2FromArray(arr);
	}

}

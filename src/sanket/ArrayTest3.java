/*Test - 3 : 10th Sep'2022

Program 1 : (20 mins)
Return middle character of max length String from given array.
input : {"Krishna","Maulik","Aashvi","Technocredits","Harsh"}
output : c

Program 2: (40 mins)
Write a method to return middle character of each elements from given array.
input : {"Mahesh","Avni","Puja","Harshal","Aditty","Rahul"}
output : Mahesh -> h
              Avni -> v
              Harshal -> s
              Aditty -> i
              Rahul -> h
 */

package basic;

public class ArrayTest3 {

	// This will calculate the highest character count in string.
	char getMiddleCharacter(String[] name) {
		int maxLength = name[0].length();
		String maxName = name[0];

		for (int index = 1; index < name.length; index++) {
			if (maxLength < name[index].length()) {
				maxLength = name[index].length();
				maxName = name[index];
			}
		}

		System.out.println("String have maximum length is : " + maxName);

		// From this onwards we will get the middle character of above maxLength
		// string.
		int length = maxName.length();
		int index = 0;

		if (length % 2 == 0)
			index = length / 2 - 1;
		else
			index = length / 2;

		char ch = maxName.charAt(index);
		return ch;
	}

	// This method will accept the string array as input and give the middle
	// character of each string in form of array.
	char[] getMiddleCharFromName(String[] arr) {
		char[] ch = new char[arr.length];
		int index2 = 0;

		for (int index = 0; index < arr.length; index++) {
			if (arr[index].length() % 2 == 0)
				index2 = arr[index].length() / 2 - 1;
			else
				index2 = arr[index].length() / 2;

			ch[index] = arr[index].charAt(index2);
		}
		return ch;
	}

	public static void main(String[] args) {
		String[] arr = {
				"Krishna",
				"Maulik",
				"Aashvi",
				"Technocredits",
				"Harsh"
		};
		ArrayTest3 arrayTest3 = new ArrayTest3();
		char ch = arrayTest3.getMiddleCharacter(arr);
		System.out.println(
				"Middle character of max length String from given array : " + ch);

		System.out.println("\n");

		String[] arr2 = {
				"Mahesh",
				"Avni",
				"Puja",
				"Harshal",
				"Aditty",
				"Rahul"
		};
		char[] ch2 = arrayTest3.getMiddleCharFromName(arr2);

		for (int index = 0; index < arr2.length; index++) {

			System.out.println("Middle character of " + arr2[index] + " ---> " + ch2[index] + ".");		
		}
	}
}
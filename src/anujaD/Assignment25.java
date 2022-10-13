/*Assignment - 25 : 20th Sep'2022
Program 1: Print all the repeated word in given string.
String str = "Maulik Puja Himss Jay Himss Jay Titiksha Swati";
output : Hindavi 
         Shubham 
*/
/*
	 * Program 2: Print all the non repeated word in given string. String str =
	 * "Maulik Puja Himss Jay Himss Jay Himss Swati"; output : Maulik
	 * Puja Titiksha Swati
	 */


package anujaD;

public class Assignment25 {
	
	void getRepeatedString(String name) {
		System.out.println("Input string is \n" + name + "\n\nRepeated words from given string are : ");
		String word[] = name.split(" ");
		for (int index = 0; index < word.length; index++) {
			for (int j = index + 1; j < word.length; j++) {
				if ((word[index]).equals(word[j]))
					System.out.println(word[j]);
			}
		}
	}

	
	void getNonRepeatedString(String name) {

		String word[] = name.split(" ");
		for (int index = 0; index < word.length; index++) {
			boolean flag = true;
			for (int j = 1; j < word.length; j++) {
				if (index != j) {
					if ((word[index].equals(word[j])) && (index != j)) {
						flag = false;
					}
				}
			}
			if (flag)
				System.out.println(word[index]);
		}
	}

	public static void main(String[] args) {
		Assignment25 assignment_25 = new Assignment25();
		String name = "Maulik Sanvi Anuja Aditi Anuja Aditi Titiksha Swati";
		assignment_25.getRepeatedString(name);
		System.out.println("*******************************************************************");
		System.out.println("Non repeated words from given string are below:  ");
		assignment_25.getNonRepeatedString(name);
	}

}

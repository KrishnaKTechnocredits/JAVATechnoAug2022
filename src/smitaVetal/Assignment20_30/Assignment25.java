/*Assignment - 25 : 20th Sep'2022

Program 1: Print all the repeated word in given string.
String str = "Maulik Puja Hindavi Shubham Hindavi Shubham Titiksha Swati";
output : Hindavi 
         Shubham 

Program 2: Print all the non repeated word in given string.
String str = "Maulik Puja Hindavi Shubham hindavi Shubham Titiksha Swati";
output : Maulik 
         Puja
         Titiksha
         Swati */

package smitaVetal.Assignment20_30;

public class Assignment25 {
	
	//method to Print all the repeated word in given string.
	void getRepeatedWords(String name) {
		System.out.println("Input string is " + name + "\n\nRepeated words from given string are ");
		String word[] = name.split(" ");
		for (int i = 0; i < word.length; i++) {
			for (int j = i + 1; j < word.length; j++) {
				if ((word[i]).equals(word[j]))
					System.out.println(word[j]);
			}
		}
	}

	//method to Print all the non-repeated word in given string.
	void getNonRepeatedWords(String name) {

		String word[] = name.split(" ");
		for (int i = 0; i < word.length; i++) {
			boolean flag = true;
			for (int j = 1; j < word.length; j++) {
				if (i != j) {
					if ((word[i].equals(word[j])) && (i != j)) {
						flag = false;
					}
				}
			}
			if (flag)
				System.out.println(word[i]);
		}
	}

	public static void main(String[] args) {
		Assignment25 array = new Assignment25();
		String name = "Maulik Puja Hindavi Shubham Hindavi Shubham Titiksha Swati";
		array.getRepeatedWords(name);
		System.out.println("======================================================");
		System.out.println("Non repeated words from given string are below  ");
		array.getNonRepeatedWords(name);
	}

}

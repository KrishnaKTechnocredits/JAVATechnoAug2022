/*  Assignment - 25 : 20th Sep'2022

Program 1: Print all the repeated word in given string.
String str = "Maulik Puja Hindavi Shubham Hindavi Shubham Titiksha Swati";
output : Hindavi 
         Shubham 

Program 2: Print all the non repeated word in given string.
String str = "Maulik Puja Hindavi Shubham hindavi Shubham Titiksha Swati";
output : Maulik 
         Puja
         Titiksha
         Swati   */

package pujaSah.assignments20_30;

public class RepeatedWordsInfo {

	// Method to print repeated words in a string
	void DisplayRepeatedWords(String str) {
		String[] name = str.split(" ");
		for (int i = 0; i < name.length; i++) {
			for (int j = i + 1; j < name.length; j++) {
				if (name[i].equals(name[j])) {
					System.out.println(name[i]);
				}
			}
		}
	}

	// Method to print unique words in a string
	void DisplayUniqueWords(String str) {
		String[] name = str.split(" ");
		for (int i = 0; i < name.length; i++) {
			int count = 1;
			for (int j = 1; j < name.length; j++) {
				if (name[i].equals(name[j]) && (i != j)) {
					count++;
					break;
				}
			}
			if (count == 1) {
				System.out.println(name[i]);
			}
		}
	}

	public static void main(String[] args) {
		RepeatedWordsInfo repeatedWordsInfo = new RepeatedWordsInfo();
		String str = "Maulik Puja Hindavi Shubham Hindavi Shubham Titiksha Swati";
		System.out.println("Input String: " + str + "\n");

		System.out.println("Repeated words are: ");
		repeatedWordsInfo.DisplayRepeatedWords(str);

		System.out.println("==============================");

		System.out.println("Unique words are: ");
		repeatedWordsInfo.DisplayUniqueWords(str);
	}

}

//Assignment - 25 : 20th Sep'2022
//Program 1: Print all the repeated word in given string.
//String str = "Maulik Puja Hindavi Shubham Hindavi Shubham Titiksha Swati";
//output : Hindavi 
//       Shubham
package sohail.stringprograms;

public class RepetedWords {

	void getRepetedWords(String inputString) {
		int count = 0;
		inputString.toLowerCase();
		String[] word = inputString.split(" ");
		System.out.println("Repeted Words are: ");
		for (int outerIndex = 0; outerIndex < word.length; outerIndex++) {
			count = 1;
			for (int innerIndex = outerIndex + 1; innerIndex < word.length; innerIndex++) {
				if (word[outerIndex].equals(word[innerIndex])) {
					count++;
					word[innerIndex] = "0";
				}
			}
			if (count > 1 && word[outerIndex] != "0")
				System.out.print(" " + word[outerIndex]);
		}

	}

	public static void main(String[] args) {
		RepetedWords repetedwords = new RepetedWords();
		String inputString = "Maulik Puja Hindavi Shubham Hindavi Shubham Titiksha Swati";
		System.out.println("Given String is: " + inputString);
		repetedwords.getRepetedWords(inputString);
	}

}

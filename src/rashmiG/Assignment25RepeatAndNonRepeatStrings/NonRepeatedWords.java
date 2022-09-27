/*Assignment - 25 : 20th Sep'2022

Program 2: Print all the non repeated word in given string.
String str = "Maulik Puja Hindavi Shubham hindavi Shubham Titiksha Swati";
output : Maulik 
         Puja
         Titiksha
         Swati */

package rashmiG.Assignment25RepeatAndNonRepeatStrings;

public class NonRepeatedWords {

	void nonRepeatedWords(String input) {

		String[] inputArray = input.split(" ");
		for (int index = 0; index < inputArray.length; index++) {
			boolean flag = true;
			for (int j = 0; j < inputArray.length; j++) {

				if (index != j) {
					String word = inputArray[index];
					String targetWord = inputArray[j];
					if (word.equals(targetWord)) {

						flag = false;
					}
				}
			}
			if (flag) {
				System.out.println(inputArray[index]);
			}
		}
	}

	public static void main(String[] args) {

		String input = "Maulik Puja Hindavi Shubham Hindavi Shubham Titiksha Swati";
		new NonRepeatedWords().nonRepeatedWords(input);
	}

}

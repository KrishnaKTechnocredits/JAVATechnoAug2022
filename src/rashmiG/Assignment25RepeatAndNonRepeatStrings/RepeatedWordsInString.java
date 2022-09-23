//Assignment - 25 : 20th Sep'2022
//
//Program 1: Print all the repeated word in given string.
//String str = "Maulik Puja Hindavi Shubham Hindavi Shubham Titiksha Swati";
//output : Hindavi 
//         Shubham 

package rashmiG.Assignment25RepeatAndNonRepeatStrings;

class RepeatedWordsInString {

	void printRepeatedWords(String input) {

		String[] inputArray = input.split(" ");
		for (int index = 0; index < inputArray.length; index++) {
			String word = inputArray[index];
			for (int j = 0; j < inputArray.length; j++) {

				if (index != j && index < j) {
					String targetWord = inputArray[j];
					if (word.length() == targetWord.length()) {
						boolean repeatWordFlag = true;

						for (int i = 0; i < word.length(); i++) {
							if (word.charAt(i) == targetWord.charAt(i)) {
								continue;

							} else {
								repeatWordFlag = false;
								break;
							}
						}
						if (repeatWordFlag) {
							System.out.println(inputArray[index]);
						}

					}

				}
			}

		}

	}

	public static void main(String[] args) {

		String input = "Maulik Puja Hindavi Shubham Hindavi Shubham Titiksha Swati";
		new RepeatedWordsInString().printRepeatedWords(input);
	}
}

package saroj.arrayPrograms;

public class Assignment25 {

	void findRepeatedWord(String str) {
		String[] input = str.split(" ");
		for (int index = 0; index < input.length; index++) {
			int strLength = str.length();
			String word = str.replaceAll(input[index], "");
			int diffLength = strLength - word.length();
			if (diffLength > input[index].length()) {
				str = str.replaceAll(input[index], "");
				System.out.println(input[index]);
			}
		}
	}

	void nonRepeatedWord(String word) {
		String[] arr = word.split(" ");
		for (int index = 0; index < arr.length; index++) {
			int wordLength = word.length();
			String replacedWord = word.replaceAll(arr[index], "");
			int difference = wordLength - replacedWord.length();
			if (difference == arr[index].length()) {
				System.out.println(arr[index]);
			}
		}
	}

	public static void main(String[] args) {
		Assignment25 assignment25 = new Assignment25();
		String str1 = "Maulik Puja Hindavi Shubham Hindavi Shubham Titiksha Swati";
		assignment25.findRepeatedWord(str1);
		System.out.println("------------------------------------");
		assignment25.nonRepeatedWord(str1);
	}
}

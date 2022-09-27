package akankshaVyas.Arraypkg;

public class StringWord {

	String getWordFromString(String str) {
		String max = "";
		String[] arr = str.split(" ");
		for (int index = 0; index < arr.length - 1; index++) {
			if (arr[index].length() < arr[index + 1].length()) {
				arr[index] = arr[index + 1];
				max = arr[index];
			}
		}
		return max;
	}

	void printDigtWordFromString(String str) {
		System.out.println("The digit word is- ");
		String[] arr = str.split(" ");
		for (int index = 0; index < arr.length; index++) {
			if (getDigitWord(arr[index])) {
				System.out.println(arr[index]);
			}
		}
	}

	boolean getDigitWord(String str) {

		for (int index = 0; index < str.length() - 1; index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {

		System.out.println("The max word in given string is - "
				+ new StringWord().getWordFromString("Good morning friends this is technocredits") + "\n");
		new StringWord().printDigtWordFromString("Good mor9ning fr3iends t2hi2s is technocredits");

	}
}

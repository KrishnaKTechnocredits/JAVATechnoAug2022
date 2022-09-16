package pujaSah.assignments20_30;

public class MaxLengthWord {

	String getMaxLengthWord(String inStr) {
		String[] outArr = inStr.split(" ");
		String maxLengthWord = outArr[0];
		for (int index = 1; index < outArr.length; index++) {
			if (outArr[index].length() > maxLengthWord.length()) {
				maxLengthWord = outArr[index];
			}
		}
		return maxLengthWord;
	}

	public static void main(String[] args) {
		MaxLengthWord obj = new MaxLengthWord();

		String inputString = "Good morning friends this is technocredits";
		System.out.println("InputString: " + inputString + "\n");

		System.out.println("The maximum length word is: " + obj.getMaxLengthWord(inputString));
	}
}

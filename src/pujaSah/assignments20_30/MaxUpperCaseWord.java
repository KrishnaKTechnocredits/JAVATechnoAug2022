package pujaSah.assignments20_30;

public class MaxUpperCaseWord {

	String getWordWithMaxUpperCaseLetters(String inArr) {
		String[] outArr = inArr.split(" ");
		String maxUpperCaseWord = " ";
		int maxCount = 0;
		for (int i = 0; i < outArr.length; i++) {
			int count = 0;
			for (int j = 0; j <= outArr[i].length() - 1; j++) {
				if (Character.isUpperCase(outArr[i].charAt(j))) {
					count++;
				}
				if (count > maxCount) {
					maxCount = count;
					maxUpperCaseWord = outArr[i];
				}
			}
		}
		return maxUpperCaseWord;
	}

	public static void main(String[] args) {
		MaxUpperCaseWord obj = new MaxUpperCaseWord();

		String inStr = "Good Mor9niNg FR3ienDs t2hi2s Is tEchnocredits";
		System.out.println("Input String: " + inStr + "\n");
		
		System.out.println("Word with maximum uppercase characters is: " + obj.getWordWithMaxUpperCaseLetters(inStr));
	}
}

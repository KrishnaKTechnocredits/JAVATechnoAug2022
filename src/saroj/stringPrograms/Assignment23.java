package saroj.stringPrograms;

public class Assignment23 {

	String getMaxLengthWord(String text) {
		String str = " ";
		String[] arr = text.split(" ");
		for (int index = 0; index < arr.length; index++) {
			if (arr[index].length() > str.length()) {
				str = arr[index];
			}
		}
		return str;
	}

	void getWordWithDigit(String text1) {
		String[] arr1 = text1.split(" ");

		for (int index1 = 0; index1 < arr1.length; index1++) {
			String word = arr1[index1];
			for (int index2 = 0; index2 < word.length(); index2++) {
				char ch = word.charAt(index2);
				if (Character.isDigit(ch)) {
					System.out.println(word);
					break;
				}
			}
		}
	}

	int countOfUpperCase(String word) {
		int count = 0;
		for (int index = 0; index < word.length(); index++) {
			char ch = word.charAt(index);
			if (Character.isUpperCase(ch)) {
				count++;
			}
		}
		return count;
	}

	void getWordWithMaxUpperCase(String text) {
		String[] arr = text.split(" ");
		int max = 0;
		String word1 = " ";
		for (int index = 0; index < arr.length; index++) {
			String word = arr[index];
			int count = countOfUpperCase(word);
			if (count > max) {
				max = count;
				word1 = arr[index];
			}
		}
		System.out.println(word1);
	}

	boolean isUpperIsDigit(String word) {
		boolean flag = true;
		for (int index = 0; index < word.length(); index++) {
			char ch = word.charAt(index);
			if (Character.isDigit(ch) || Character.isUpperCase(ch)) {
				flag = false;
			}
		}
		return flag;
	}

	void getWordHavingNoDigitNoUpperCase(String text) {
		String[] arr = text.split(" ");
		for (int index = 0; index < arr.length; index++) {
			String word = arr[index];
			boolean flag = isUpperIsDigit(word);
			if (flag) {
				System.out.println(word);
			}

		}

	}

	public static void main(String[] args) {
		Assignment23 assignment23 = new Assignment23();
		String str = "Good morning friends this is technocredits";
		String word = assignment23.getMaxLengthWord(str);
		System.out.println("In " + str + "\n Maximum length word is: " + word);
		System.out.println("-------------------------------------------");
		String str1 = "Good mor9ning fr3iends t2hi2s is technocredits";
		System.out.println("In " + str1 + "\nword with digit is: ");
		assignment23.getWordWithDigit(str1);
		System.out.println("-------------------------------------------");
		String str2 = "Good Mor9niNg FR3ienDs t2hi2s Is tEchnocredits";
		System.out.println("In " + str2 + "\nword with maxiumm upper case is: ");
		assignment23.getWordWithMaxUpperCase(str2);
		System.out.println("-------------------------------------------");
		String str3 = "Good mor9ning techno fr3iends t2Hi2s is tEchnocredits";
		System.out.println("In " + str3 + "\nword with no digit and no upper case is: ");
		assignment23.getWordHavingNoDigitNoUpperCase(str3);
	}
}

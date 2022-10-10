package nehaniG;

public class Assignment23 {
	String getMaxLengthWord(String input) {
		String[] arr = input.split(" ");
		String maxLengthWord = arr[0];
		for (int index = 0; index < arr.length; index++) {
			if (maxLengthWord.length() < arr[index].length()) {
				maxLengthWord = arr[index];
			}

		}
		return maxLengthWord;

	}

	String atleastOneDigit(String input) {
		String[] arr = input.split(" ");
		String outputString = "";
		for (int index = 0; index < arr.length; index++) {
			for (int j = 0; j < arr[index].length(); j++) {
				if (Character.isDigit(arr[index].charAt(j))) {
					outputString += arr[index] + " ";
					break;
				}
			}
		}
		return outputString;
	}

	String getMaximumUppercase(String name) {
		String[] arr = name.split(" ");
		String maxUppercase = "";
		int maxCount = 0;
		for (int index = 0; index < arr.length; index++) {
			int count = 0;
			for (int j = 0; j < arr[index].length(); j++) {
				if (Character.isUpperCase(arr[index].charAt(j))) {
					count++;
				}
			}
			if (maxCount < count) {
				maxCount = count;
				maxUppercase = arr[index];
			}
		}
		return maxUppercase;
	}

	String noNumAndUpperChar(String input) {
		String[] arr = input.split(" ");
		String outputString = "";
		for (int index = 0; index < arr.length; index++) {
			boolean isValidWord = true;
			for (int j = 0; j < arr[index].length(); j++) {
				if (Character.isDigit(arr[index].charAt(j)) || Character.isUpperCase(arr[index].charAt(j))) {
					isValidWord = false;
					break;
				}

			}
			if (isValidWord) {
				outputString += arr[index] + " ";
			}
		}
		return outputString;
	}

	public static void main(String[] args) {
		Assignment23 assignment23 = new Assignment23();
		String input1 = "Good morning friends this is technocredits";
		System.out.println("Max length word from given array is --> " + assignment23.getMaxLengthWord(input1));

		String input2 = "Good mor9ning fr3iends t2hi2s is technocredits";
		System.out.println(
				"Sentance having atleast one digit from given array is --> " + assignment23.atleastOneDigit(input2));

		String input3 = "Good Mor9niNg FR3ienDs t2hi2s Is tEchnocredits";
		System.out.println(
				"Maximum Uppercase character from given array is --> " + assignment23.getMaximumUppercase(input3));

		String input4 = "Good mor9ning techno fr3iends t2Hi2s is tEchnocredits";
		System.out.println("Sentance having no number and chracter from given array is --> "
				+ assignment23.noNumAndUpperChar(input4));
	}
}

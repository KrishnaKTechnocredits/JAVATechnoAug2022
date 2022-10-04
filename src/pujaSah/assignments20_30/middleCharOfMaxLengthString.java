package pujaSah.assignments20_30;

public class middleCharOfMaxLengthString {
	String getMaxLengthString(String[] arr) {
		int size = arr.length;
		int maxLength = 0;
		String maxLenStr = " ";
		int i = 0;
		maxLength = arr[i].length();
		maxLenStr = arr[i];
		for (int j = i + 1; j < size - 1; j++) {
			if (arr[j].length() > maxLength) {
				maxLength = arr[j].length();
				maxLenStr = arr[j];
				i = j;
			}
		}
		return maxLenStr;
	}

	char getMiddleCharInAString(String[] arr) {
		String str = getMaxLengthString(arr);
		int length = str.length();
		char ch = ' ';
		if (length % 2 == 0) {
			ch = str.charAt(length / 2 - 1);
		} else {
			ch = str.charAt(length / 2);
		}
		return ch;
	}

	public static void main(String[] args) {
		String[] array = { "Krishna", "Maulik", "Aashvi", "Technocredits", "Harsh" };
		System.out.println("The middle char from max length string in given array is "
				+ new middleCharOfMaxLengthString().getMiddleCharInAString(array));
	}
}

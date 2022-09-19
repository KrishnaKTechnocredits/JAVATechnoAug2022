//Method for return reverse name
//method to return even character from given string
//even position character from given string in reverse
//Count of digit in given string
//sum of all digts in given string

package shridharKumbhar.Assignment11_20;

public class Assignment_17_Shridhar {

	String getReverseName(String name) {

		String reverseName = "";
		for (int index = name.length() - 1; index >= 0; index--) {
			char character = (name.charAt(index));
			reverseName = reverseName + character;
		}
		return reverseName;

	}

	String getEvenCharName(String name) {

		String evenCharName = "";
		int nameLenght = name.length() - 1;

		for (int index = 0; index <= nameLenght; index++) {

			if (index % 2 != 0) {
				char character = (name.charAt(index));
				evenCharName = evenCharName + character;
			}
		}
		return evenCharName;

	}

	String getEvenCharReverse(String name) {

		String evenCharName = "";
		int nameLenght = name.length() - 1;

		for (int index = 0; index <= nameLenght - 1; index++) {

			if (index % 2 != 0) {
				char character = (name.charAt(index));
				evenCharName = evenCharName + character;
			}

		}

		String reverseName = "";
		int lenghtEven = evenCharName.length();

		for (int index1 = lenghtEven - 1; index1 >= 0; index1--) {
			char character = evenCharName.charAt(index1);
			reverseName = reverseName + character;
		}

		return reverseName;

	}

	int getDigitCount(String name) {

		int totalCount = 0;

		for (int index = 0; index < name.length(); index++) {
			char digit = name.charAt(index);
			if (Character.isDigit(digit)) {
				totalCount++;
			}
		}
		return totalCount;
	}

	int getDigitSum(String name) {

		int totalDigitSum = 0;

		for (int index = 0; index < name.length(); index++) {
			char digit = name.charAt(index); // Character is class....and we are calling method directly over class by
												// dot so method is static.
			if (Character.isDigit(digit)) {
				totalDigitSum = totalDigitSum + Character.getNumericValue(digit); // totalDigitSum = totalDigitSum + digit; 
																				 // digit will return aski
																					//Character.getNumericValue(digit): value of character
			}
		}
		return totalDigitSum;
	}

	public static void main(String[] args) {
		System.out.println("reverse string of  given string: " + (new Assignment_17_Shridhar().getReverseName("Shridhar")));
		System.out.println("Even character in given string: " + (new Assignment_17_Shridhar().getEvenCharName("Technocredits")));
		System.out.println("revers of even character in given string: " + (new Assignment_17_Shridhar().getEvenCharReverse("Technocredits")));
		System.out.println("Total count of digits: " + (new Assignment_17_Shridhar().getDigitCount("Te8chn4ocr4e5dit2s")));
		System.out.println("Sum of all digits: " + (new Assignment_17_Shridhar().getDigitSum("Te8chn4ocr4e5dit2s")));
	}
}


/*Return middle character of max length String from given array.
input : {"Krishna","Maulik","Aashvi","Technocredits","Harsh"}
output : c
*/
package deepakPatil;

public class ProgTest3_1 {

	char getMiddleChar(String name) {
		char middleCh;
		int nameLength = name.length();
		if (name.length() % 2 == 0)
			middleCh = name.charAt(nameLength / 2 - 1);
		else
			middleCh = name.charAt(nameLength / 2);

		return middleCh;
	}

	String getMaxLenghtString(String[] arr1) {
		int stringLength = arr1[0].length();
		String maxLengthString = "";
		for (int i = 1; i < arr1.length; i++) {
			if (arr1[i].length() > stringLength)
				maxLengthString = arr1[i];
		}
		return maxLengthString;
	}

	char getMiddleCharOfMaxLenghtString(String[] arr2) {
		String maxLengthName = getMaxLenghtString(arr2);
		char middleChar = getMiddleChar(maxLengthName);
		return middleChar;
	}

	public static void main(String[] args) {
		ProgTest3_1 progTest3_1 = new ProgTest3_1();

		String[] names = { "Krishna", "Maulik", "Aashvi", "Technocredits", "Harsh" };
		System.out.println("Maximum length string from given array is '" + progTest3_1.getMaxLenghtString(names)
				+ "' and it's middle character is '" + progTest3_1.getMiddleCharOfMaxLenghtString(names) + "'");
	}
}

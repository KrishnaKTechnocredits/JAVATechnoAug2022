package nehaniG;

public class Test3 {
	char maxLengthString(String[] inputArray) {
		String maxLengthName = inputArray[0];
		for (int index = 0; index < inputArray.length; index++) {
			if (maxLengthName.length() < inputArray[index].length()) {
				maxLengthName = inputArray[index];
			}
		}
		int length = maxLengthName.length();
		if (length % 2 == 0) {
			return maxLengthName.charAt(length / 2 - 1);
		}
		
		return maxLengthName.charAt(length / 2);
	}

	public static void main(String[] args) {

		Test3 test3 = new Test3();

		String[] name = { "Krishna", "Maulik", "Aashvi", "Technocredits", "Harsh" };
		System.out.println("\nMiddle character of maximum array element : ");
		System.out.println(test3.maxLengthString(name));

	}

}

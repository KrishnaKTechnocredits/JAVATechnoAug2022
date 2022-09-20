package harshalRane.Tests;

public class MiddleCharFromArray {
	char[] getMiddleChar(String[] input) {
		char[] output = new char[input.length];

		for (int index = 0; index < input.length; index++) {
			int arrIndex = 0;
			int maxLength = input[index].length();

			if (maxLength % 2 == 0) {
				arrIndex = maxLength / 2 - 1;
			} else {
				arrIndex = maxLength / 2;
			}
			output[index] = input[index].charAt(arrIndex);
		}
		return output;
	}

	public static void main(String[] args) {
		MiddleCharFromArray middleCharFromArray = new MiddleCharFromArray();
		String[] input = { "Mahesh", "Avni", "Puja", "Harshal", "Aditty", "Rahul" };
		char[] ch = middleCharFromArray.getMiddleChar(input);
		for (int index = 0; index < ch.length; index++) {
			System.out.println(input[index] + "---" + ch[index]);
		}
	}
}

package pujaSah.assignments11_20;

public class middleCharInEachStringOfAnArray {

	char[] getMiddleCharOfEachString(String[] inArr) {
		int size = inArr.length;
		char[] outArr = new char[size];
		int length = 0;
		for (int i = 0; i < size - 1; i++) {
			length = inArr[i].length();
			if (length % 2 == 0) {
				outArr[i] = inArr[i].charAt(length / 2 - 1);
			} else {
				outArr[i] = inArr[i].charAt(length / 2);
			}
		}
		return outArr;
	}

	void displayOutput(String[] inArr) {
		int size = inArr.length;
		char[] outArr = new char[size];
		outArr = getMiddleCharOfEachString(inArr);
		for (int i = 0; i < size - 1; i++) {
			System.out.println(inArr[i] + "->" + outArr[i]);
		}
	}

	public static void main(String[] args) {
		String[] inputArray = { "Mahesh", "Avni", "Puja", "Harshal", "Aditty", "Rahul" };
		System.out.println("The middle character in each string of given array is: ");
		new middleCharInEachStringOfAnArray().displayOutput(inputArray);
	}
}

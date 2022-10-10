package nikeshM.StringArrayCode;

//Program 3: Write a method to return word having maximum uppercase.
//
//String input = "Good Mor9niNg FR3ienDs t2hi2s Is tEchnocredits";
//output : FR3ienDs
public class WordUpperCase {

	int getWordUpperCase(String input) {
		int length = input.length();
		int upperCaseCount = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isUpperCase(ch)) {
				upperCaseCount++;
			}

		}
		return upperCaseCount;
	}

	String printWordUpperCase(String name) {
		int maxCount = 0;
		String tempString = "";
		String[] arr = name.split(" ");
		for (int index = 0; index < arr.length; index++) {
			int tempCount = getWordUpperCase(arr[index]);
			if (maxCount<tempCount) {
				maxCount=tempCount;
				tempString = arr[index];
			}
		}
		return tempString;
	}
	public static void main(String[] args) {
		WordUpperCase uppercase = new WordUpperCase();
		String input = "Good Mor9niNg FR3ienDs t2hi2s Is tEchnocredits";
		uppercase.printWordUpperCase(input);
		System.out.println(uppercase.printWordUpperCase(input));
	}
}

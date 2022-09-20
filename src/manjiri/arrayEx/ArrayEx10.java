package manjiri.arrayEx;

public class ArrayEx10 {

	String getMaximumLengthWordRevLoop(String input) {
		int maxLength = 0;
		String maxString = "";

		String[] inputArr = input.split(" ");
		for (int index = (inputArr.length) - 1; index >= 0; index--) {
			int wordLength = inputArr[index].length();
			if (maxLength < wordLength) {
				maxLength = wordLength;
				maxString = inputArr[index];
			}
		}
		return maxString;
	}

	String getLastMaximumLengthWordRevLoop(String input) {
		int maxLength = 0;
		String maxString = "";

		String[] inputArr = input.split(" ");
		for (int index = (inputArr.length) - 1; index >= 0; index--) {
			int wordLength = inputArr[index].length();
			if (maxLength <= wordLength) {
				maxLength = wordLength;
				maxString = inputArr[index];
			}
		}
		return maxString;
	}

	private int getMaximumWordLength(String[] inputArr) {
		int maxLength = 0;

		for (int index = 0; index < inputArr.length; index++) {
			if (maxLength <= inputArr[index].length()) {
				maxLength = inputArr[index].length();
			}
		}
		return maxLength;
	}


	String getnthMaximumLengthWordFromStringRevLoop(String input, int num) {
		int maxLength = 0;
		int count = 0;
		String maxString = "";

		String[] inputArr = input.split(" ");
		maxLength = getMaximumWordLength(inputArr);
		for (int index = (inputArr.length) - 1; index >= 0; index--) {
			if (inputArr[index].length() == maxLength) {
				maxString = inputArr[index];
				count++;
				
				if(count == num)
					break;
			}
		}
		return maxString;
	}

	public static void main(String[] args) {
		String input = "Good morning!!!!!! friends this is technocredits";
		System.out.println("Reverse Maximum Length String: " + new ArrayEx10().getMaximumLengthWordRevLoop(input));
		System.out.println(
				"Reverse Last Maximum Length String: " + new ArrayEx10().getLastMaximumLengthWordRevLoop(input));

		String input1 = "Good morning!!!!!! friends this is technocredits this is august22batch which is awesome!!!!!!";
		System.out.println("Reverse Second Maximum Length String: "
				+ new ArrayEx10().getnthMaximumLengthWordFromStringRevLoop(input1, 2));
	}
}

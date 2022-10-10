/*Assignment - 35 : 7th Oct'2022

Program 2: return sum of all the digits from given String.
input : i have 15 years and 3 months of experience.
output : 9
Hint : Using Exception handling*/

package rashmiG.Assignment35_exceptiionHandling;

public class SumOfAllDigitsFromString {

	// Approach 1 cannot handle String str = "i have 15 years and 3 months of
	// experience. m89";

//	int getSumOfAllDigits(String str) {
//		int sum = 0;
//		String[] input = str.split(" ");
//		for (int index = 0; index < input.length; index++) {
//			try {
//				int num = Integer.parseInt(input[index]);
//				while (num > 0) {
//					int r = num % 10;
//					sum = sum + r;
//					num = num / 10;
//				}
//
//			} catch (NumberFormatException nf) {
//
//			}
//		}
//		return sum;
//	}

	// Approach 2 handles all strings
	int getSumOfDigitsApproach2(String str) {
		int sum = 0;
		String[] input = str.split(" ");
		for (int index = 0; index < input.length; index++) {
			for (int innerIndex = 0; innerIndex < input[index].length(); innerIndex++) {
				try {
					char ch = input[index].charAt(innerIndex);
					int num = Integer.parseInt(Character.toString(ch));// int num=Integer.parseInt(String.valueOf(ch));
					sum = sum + num;
				} catch (NumberFormatException nf) {

				}
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		String str = "i have 15 years and 3 months of experience.m89";
		System.out.println("Input : " + str);
		// System.out.println("Approach 1");
		// System.out.println("Output : Sum of digits from given string : " + new
		// SumOfAllDigitsFromString().getSumOfAllDigits(str));
		System.out.println("Approach 2");
		System.out.println("Output : Sum of digits from given string : "
				+ new SumOfAllDigitsFromString().getSumOfDigitsApproach2(str));
	}
}

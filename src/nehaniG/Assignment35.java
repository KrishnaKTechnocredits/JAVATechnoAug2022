package nehaniG;

public class Assignment35 {
	int getSumOfAllNumbers(String str) {
		int sum = 0;
		String[] arr = str.split(" ");
		for (int i = 0; i < arr.length; i++) {
			try {
				sum += Integer.parseInt(arr[i]);
			} catch (NumberFormatException ex) {
			}
		}
		return sum;
	}

	int getSumOfAllDigits(String str) {
		int sum = 0;
		String[] arr = str.split(" ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length(); j++) {
				try {
					sum += Integer.parseInt(String.valueOf(arr[i].charAt(j)));
				} catch (NumberFormatException ex) {
				}
			}
		}

		return sum;
	}

	public static void main(String[] args) {
		Assignment35 assignment35 = new Assignment35();
		String input = "i have 15 years and 3 months of experience.";
		System.out.println("Sum of all numbers in given string is--> " + assignment35.getSumOfAllNumbers(input));

		System.out.println(
				"Sum of all individual numbers in given string is--> " + assignment35.getSumOfAllDigits(input));
	}
}

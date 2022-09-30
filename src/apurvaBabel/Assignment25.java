package apurvaBabel;

public class Assignment25 {

	// Method to print all the repeated word in given string
	void repeatedWordsFromString(String input) {
		String[] arr = input.split(" ");
		System.out.println("Repeated words from the given string are ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if ((arr[i]).equals(arr[j])) {
					System.out.println(arr[i]);
				}
			}
		}
	}

	// Method to print all the non repeated word in given string
	void nonRepeatedWordsFromString(String input) {
		String[] arr = input.split(" ");
		System.out.println("\nNon repeated words from given string are ");
		for (int i = 0; i < arr.length; i++) {
			boolean flag = true;
			for (int j = 1; j < arr.length; j++) {
				if ((arr[i]).equals(arr[j]) && i != j) {
					flag = false;
				}
			}
			if (flag) {
				System.out.println((arr[i]));
			}
		}
	}

	public static void main(String[] args) {
		Assignment25 assignment25 = new Assignment25();
		String input = "Maulik Puja Hindavi Shubham Hindavi Shubham Titiksha Swati";
		assignment25.repeatedWordsFromString(input);
		assignment25.nonRepeatedWordsFromString(input);
	}
}

//Program 4: Write a method to print all the words having no digits and uppercase.
//String input = "Good mor9ning techno fr3iends t2Hi2s is tEchnocredits";
//output : techno
//         is
package maheshSantoki.arrayExamples;

public class HavingNoDigitUppercase {
	int getStringNoDigitUpper(String str) {
		int count = 0;
		String output = " ";
		int length = str.length();
		for (int i = 0; i < length; i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch) || Character.isUpperCase(ch)) {
				count++;
			}
		}
		return count;
	}

	void splitSentence(String input) {
		String[] arr = input.split(" ");
		String str = " ";
		System.out.println("Words Having no digit and uppercase : ");
		for (int i = 0; i < arr.length; i++) {
			int count = getStringNoDigitUpper(arr[i]);
			if (count == 0) {
				System.out.println(arr[i]);
			}
		}
	}

	public static void main(String[] args) {
		HavingNoDigitUppercase nodigitnouppercase = new HavingNoDigitUppercase();
		String input = "Good mor9ning techno fr3iends t2Hi2s is tEchnocredits";
		System.out.println(input);
		nodigitnouppercase.splitSentence(input);

	}
}

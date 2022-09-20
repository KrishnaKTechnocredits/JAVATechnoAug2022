//Program 2: Write a method to print all the words having atleast one digit.
//
//String input = "Good mor9ning fr3iends t2hi2s is technocredits";
//output : mor9ning
//         fr3iends
//         t2hi2s	
package maheshSantoki.arrayExamples;

public class HavingDigitInString {
	String getStringHavingAtleastOneDigit(String str) {
		int count = 0;
		String output = " ";
		int length = str.length();
		for (int i = 0; i < length; i++) {
			if (Character.isDigit(str.charAt(i))) {
				count++;
			}
		}
		if (count >= 1)
			output = str;
		return output;
	}

	void splitSentence(String input) {
		String[] arr = input.split(" ");
		String str = " ";
		System.out.println("Words Having digit : ");
		for (int i = 0; i < arr.length; i++) {
			str = getStringHavingAtleastOneDigit(arr[i]);
			System.out.println(str);
		}
	}

	public static void main(String[] args) {
		HavingDigitInString havedigitinstring = new HavingDigitInString();
		String input = "Good mor9ning fr3iends t2hi2s is technocredits";
		System.out.println(input);
		havedigitinstring.splitSentence(input);
	}
}

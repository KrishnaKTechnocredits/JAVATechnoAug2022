//Program 1:
//Write a method to return maximum length word from given input.
//String input = "Good morning friends this is technocredits";
//output : technocredits
package akankshaSharma.AllAssignments;

public class Assignment23Program1 {

	String getMaxLengthWord(String input) {
		String[] arr = input.split(" ");
		String maxLenWord = arr[0];

		for (int index = 1; index < arr.length; index++) {
			String word = arr[index];
			if (word.length() > maxLenWord.length()) {
				maxLenWord = arr[index];
			}
		}
		return maxLenWord;
	}

	public static void main(String[] args) {
		Assignment23Program1 p1 = new Assignment23Program1();
		String input = "Good morning friends this is technocredits";
		System.out.println("Given String is: " + input);
		System.out.println("-------------------------");
		System.out.println("Max length word from given string is: \n" + p1.getMaxLengthWord(input));
	}
}

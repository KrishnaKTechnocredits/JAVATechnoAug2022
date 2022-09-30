/*Program 2: Write a method to print all the words having atleast one digit.

String input = "Good mor9ning fr3iends t2hi2s is technocredits";
output : mor9ning
         fr3iends
         t2hi2s	*/

package gauravSahu;

public class Assignment23B {

	void getStringwithInt(String[] input) {
		String word = "";
		for (int index = 0; index < input.length; index++) {
			word = input[index];
			for (int i=0; i < word.length(); i++) {
				char ch = word.charAt(i);
				if(Character.isDigit(ch)) {
					System.out.println(word);
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		Assignment23B a23 = new Assignment23B();
		String input = "Good mor9ning fr3iends t2hi2s is technocredits";
		String[] arr = input.split(" ");
		a23.getStringwithInt(arr);
	}
}

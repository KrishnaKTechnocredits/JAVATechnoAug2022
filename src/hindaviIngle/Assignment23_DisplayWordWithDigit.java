/*
 * 	/*
	 * Program 2: Write a method to print all the words having atleast one digit.

String input = "Good mor9ning fr3iends t2hi2s is technocredits";
output : mor9ning
         fr3iends
         t2hi2s	
	 */

package hindaviIngle;

public class Assignment23_DisplayWordWithDigit {
	boolean isWordContainsDigit(String name) {
		boolean flag = false;
		for (int index = 0; index < name.length(); index++) {
			if (Character.isDigit(name.charAt(index))) {
				flag = true;
			}
		}
		return flag;
	}

	void printWordsHavingDigit(String name) {
		String[] output = name.split(" ");
		for (int index = 0; index < output.length; index++) {
			boolean flag = isWordContainsDigit(output[index]);
			if (flag) {
				System.out.println(output[index]);
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment23_DisplayWordWithDigit a1 = new Assignment23_DisplayWordWithDigit();
		String input = "Good mor9ning fr3iends t2hi2s is technocredits\n";
		System.out.println("Input string is-->" + input);
		System.out.println("Output is: ");
		a1.printWordsHavingDigit(input);
	}
}

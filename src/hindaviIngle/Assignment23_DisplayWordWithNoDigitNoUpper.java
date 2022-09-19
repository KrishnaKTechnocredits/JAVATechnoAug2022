
/*
 * Program 3: Write a method to return word having maximum uppercase.

String input = "Good Mor9niNg FR3ienDs t2hi2s Is tEchnocredits";
output : FR3ienDs	
 */
package hindaviIngle;

public class Assignment23_DisplayWordWithNoDigitNoUpper {
	void printWordWithNoDigitNoUppercase(String name) {
		String[] output = name.split(" ");
		for (int index = 0; index < output.length; index++) {
			boolean flag = true;
			for (int j = 0; j < output[index].length(); j++) {
				if (Character.isUpperCase(output[index].charAt(j)) || Character.isDigit(output[index].charAt(j))) {
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.println(output[index]);

			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment23_DisplayWordWithNoDigitNoUpper assignment23 = new Assignment23_DisplayWordWithNoDigitNoUpper();
		String input = "Good mor9ning techno fr3iends t2Hi2s is tEchnocredits";
		System.out.println("String with No Digit and No Uppercase :\n ");
		assignment23.printWordWithNoDigitNoUppercase(input);
	}

}

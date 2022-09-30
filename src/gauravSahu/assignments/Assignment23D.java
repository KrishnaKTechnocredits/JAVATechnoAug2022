/*Program 4: Write a method to print all the words having no digits and uppercase.
String input = "Good mor9ning techno fr3iends t2Hi2s is tEchnocredits";
output : techno
         is
*/

package gauravSahu;

public class Assignment23D {

	void getString(String[] input) {
		for (int index = 0; index < input.length; index++) { // array parse
			if (isReqStr(input[index])) {
				System.out.println(input[index]);
			}
		}
	}

	boolean isReqStr(String input) {
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isDigit(ch) || Character.isUpperCase(ch)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Assignment23D a23 = new Assignment23D();
		String input = "Good mor9ning techno fr3iends t2Hi2s is tEchnocredits";
		String[] arr = input.split(" ");
		a23.getString(arr);

	}

}

/*
 * Program 4 : Return a reverse String [Use : StringBuilder].

 */
package hindaviIngle.Collections;

public class Assignment40_Program4 {
	StringBuilder getReverseString(String input) {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.reverse();
		return stringBuilder;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment40_Program4 reverseStringInplaceReverse = new Assignment40_Program4();
		String input = "technocredits";
		System.out.println("Reverse String using String Builder");
		System.out.println("Input: " + input);
		System.out.println("Output: " + reverseStringInplaceReverse.getReverseString(input));
	}

}

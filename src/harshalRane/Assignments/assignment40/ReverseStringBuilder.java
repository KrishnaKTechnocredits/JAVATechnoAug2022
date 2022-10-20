/*
 * Assignment 40
 * Program 4 : Return a reverse String [Use : StringBuilder].
 */
package harshalRane.Assignments.assignment40;

public class ReverseStringBuilder {
	StringBuilder getReverseString(String input) {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.reverse();
		return stringBuilder;
	}

	public static void main(String[] args) {
		ReverseStringInplaceReverse reverseStringInplaceReverse = new ReverseStringInplaceReverse();
		String input = "technocredits";
		System.out.println("Reverse String using String Builder");
		System.out.println("Input: " + input);
		System.out.println("Output: " + reverseStringInplaceReverse.getReverseString(input));
	}
}


/******
 * Assignment 40
 * Program 4 : Return a reverse String [Use : StringBuilder].
 */
package mohiniA.ArrayMap.Assignment40;

public class ReverseStringBuilder {
	
	String getReverseString(String input) {
		StringBuilder sb = new StringBuilder(input);
		sb.reverse();
		return sb.toString();
	}

	public static void main(String[] args) {
		ReverseStringBuilder obj40 = new ReverseStringBuilder();
		String input = "technocredits";
		System.out.println("Reverse String using String Builder");
		System.out.println("Input: " + input);
		System.out.println("Output: " + obj40.getReverseString(input));
	}

}

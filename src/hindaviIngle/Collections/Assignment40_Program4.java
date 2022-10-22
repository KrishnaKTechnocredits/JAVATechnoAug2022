/*
 * Program 4 : Return a reverse String [Use : StringBuilder].

 */
package hindaviIngle.Collections;

public class Assignment40_Program4 {
	StringBuilder getReverseString(String input) {
		StringBuilder stringBuilder = new StringBuilder(input);
		stringBuilder.reverse();
		return stringBuilder;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment40_Program4 p4 = new Assignment40_Program4();
		String input = "technocredits";
		System.out.println("Reverse String using String Builder");
		System.out.println("Input: " + input);
		System.out.println("Output: " +p4.getReverseString(input));
	}

}

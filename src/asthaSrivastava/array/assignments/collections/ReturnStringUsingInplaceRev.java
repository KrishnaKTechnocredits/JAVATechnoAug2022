/*Program 3 : Return a reverse String [Method : inplace reverse].*/
package asthaSrivastava.array.assignments.collections;

public class ReturnStringUsingInplaceRev {
//method to return reverse String
	String getReverseString(String input) {
		for (int i = 0, j = input.length() - 1; i < j; i++, j--) {
			char ch1 = input.charAt(i);
			char ch2 = input.charAt(j);
			if (i == 0)
				input = ch2 + input.substring(i + 1, j) + ch1;
			else
				input = input.substring(0, i) + ch2 + input.substring(i + 1, j) + ch1 + input.substring(j + 1);
		}
		System.out.println("Reverse String of given string " + input + " is : " + input);
		return input;
	}

	public static void main(String[] args) {
		String str = "Technocredits";
		new ReturnStringUsingInplaceRev().getReverseString(str);
	}
}

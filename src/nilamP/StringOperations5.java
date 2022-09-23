package nilamP;



public class StringOperations5 {
	void getReplaceChar(String input) {

		while (input.length() > 0) {
			char ch = input.charAt(0);
			String str = Character.toString(ch);
			int originalLength = input.length();
			input = input.replace(str, "");
			int newLength = input.length();
			System.out.println(ch + " ->" + (originalLength - newLength));

		}
	}
	public static void main(String[] args) {
		StringOperations5 so = new StringOperations5();
		String input = "technocredits";
		System.out.println("input : " + input);
		System.out.println("the frequency is: ");
		so.getReplaceChar(input);
	}
}

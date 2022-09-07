package akankshaSharma.return_type_assignment;

class Assignment16 {
	String str;
	String characterString;

	String getLength(String name) { // to get the length of given string.
		str = name;
		return str;
	}

	char getMiddleCharacter(String name) { // to get the middle character of string.
		characterString = name;
		int length = name.length();
		int index = 0;
		if (length % 2 == 0) {
			index = length / 2 - 1;
		} else {
			index = length / 2;
		}
		return name.charAt(index);
	}

	public static void main(String[] args) {
		Assignment16 assignment16 = new Assignment16();
		String ans = assignment16.getLength("Akanksha Sharma");
		System.out.println("Length of given String " + assignment16.str + " is " + ans.length() + "\n");

		char ch = assignment16.getMiddleCharacter("Technocredits");
		System.out.println("Middle character of String " + assignment16.characterString + " is " + ch);
	}
}
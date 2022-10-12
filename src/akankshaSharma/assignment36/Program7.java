//Program 7 : 
//WAP to return String by encrypting all characters from given string by its next character.

//input : aPd%3zZ
//output : bQ%e3aA

package akankshaSharma.assignment36;

public class Program7 {
	String processedString(String str) {
		String output = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (ch == 'Z') {
				output = output + 'A';
			} else if (ch == 'z') {
				output = output + 'a';
			} else {
				if ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)) {
					ch++;
				}
				output = output + ch;
			}
		}
		return output;
	}

	public static void main(String[] args) {
		Program7 test = new Program7();
		String input = "aPd%3zZ";
		String output = test.processedString(input);
		System.out.println(output);
	}

}

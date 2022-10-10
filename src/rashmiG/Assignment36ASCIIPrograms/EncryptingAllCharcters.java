/*Assignment - 36 : 9th Oct'2022

Program 7 : 
WAP to return String by encrypting all characters from given string by its next character.

input : aPd%3zZ
output : bQe%3aA*/

package rashmiG.Assignment36ASCIIPrograms;

public class EncryptingAllCharcters {

	String getProcessedString(String input) {
		String output = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch == 'Z') {
				output += 'A';
			} else if (ch == 'z') {
				output += 'a';
			} else {
				if (ch >= 65 && ch <= 90 || ch >= 97 && ch <= 122) {
					ch++;
				}
				output += ch;
			}
		}
		return output;
	}

	void display(String input) {
		String output = getProcessedString(input);
		System.out.println(input + " --> " + output);
	}

	public static void main(String[] args) {
		EncryptingAllCharcters encryption = new EncryptingAllCharcters();
		encryption.display("aPd%3zZ");
		encryption.display("827@Z0()Sa");
	}
}
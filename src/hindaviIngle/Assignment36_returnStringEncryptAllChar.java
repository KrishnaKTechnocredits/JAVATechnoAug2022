/*
 * Program 7 : 
WAP to return String by encrypting all characters from given string by its next character.

input : aPd%3zZ
output : bQe%3aA
 */
package hindaviIngle;

public class Assignment36_returnStringEncryptAllChar {

	String encryptedString(String name) {
		String output = "";
		System.out.println("Input :" + name);
		for (int index = 0; index < name.length(); index++) {
			char ch = name.charAt(index);
			if (name.charAt(index) == 'z') {
				output = output + 'a';
			} else if (name.charAt(index) == 'Z') {
				output = output + 'A';
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
		// TODO Auto-generated method stub
		Assignment36_returnStringEncryptAllChar a36 = new Assignment36_returnStringEncryptAllChar();
		String output = a36.encryptedString("aPd%3zZ");
		System.out.println("Output :" + output);
	}

}

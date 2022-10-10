/*
 * Program 1 : 
WAP to return String by encrypting all characters from given string by its next character.

input : apdz
output : bqea
 */
package hindaviIngle;

public class Assignment36_encryptAllChar {
	String encryptString(String name) {
		System.out.println("Input : " + name);
		String output = "";
		for (int index = 0; index < name.length(); index++) {
			char ch = name.charAt(index);
			if (ch == 'z') {
				output = output + 'z';
			} else {
				ch = (char) (ch + 1);
				output = output + ch;
			}
		}
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment36_encryptAllChar a36 = new Assignment36_encryptAllChar();
		String output = a36.encryptString("apdz");
		System.out.println("output : " + output);
	}

}

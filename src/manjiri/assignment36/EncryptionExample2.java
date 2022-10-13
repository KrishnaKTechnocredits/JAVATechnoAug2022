/*Program 7 : 
WAP to return String by encrypting all characters from given string by its next character.
input : aPd%3zZ
output : bQe%3aA*/

package manjiri.assignment36;

public class EncryptionExample2 extends StringEncryption {

	String getEncryptedString(String str) {
		String outputString = "";
		for (int index = 0; index < str.length(); index++) {

			char ch = str.charAt(index);
			if (ch == 'Z') {
				ch = 'A';
			} else if (ch == 'z') {
				ch = 'a';
			} else {
				if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
					ch++;
				}
			}
			outputString += ch;
		}
		return outputString;
	}

	void display(String input) { // overloaded method
		String output = super.getEncryptedString(input); // calling parent class method
		display(input, output);
	}

	static void display(String input, String output) { // overloaded method
		System.out.println("Input String is: " + input);
		System.out.println("--------------------------");
		System.out.println("Encrypted String is: " + output);
	}

	public static void main(String[] args) {
		String input = "aPd%3zZ";
		StringEncryption se = new EncryptionExample2(); // Dynamic Polymorphism
		String output = se.getEncryptedString(input); // getEncryptedString() of child will be called
		display(input, output);

		String input1 = "apdz";
		EncryptionExample2 se1 = new EncryptionExample2();
		se1.display(input1);
	}
}

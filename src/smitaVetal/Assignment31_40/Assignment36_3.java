/*Program 1 : 
WAP to return String by encrypting all characters from given string by its next character.

input : apdz
output : bqea
*/
package smitaVetal.Assignment31_40;

public class Assignment36_3 {

	String getEncryption(String input) {
		String output = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch == 'z') {
				output += 'a';
			} else {
				ch++;
				output += ch;
			}
		}
		return output;
	}

	public static void main(String[] args) {
		Assignment36_3 prog = new Assignment36_3();
		System.out.println("Program to return String by encrypting all characters from given string by its next character.\nInput : aweqzsd\nOutput : bxfrate\n");
		String output = prog.getEncryption("aweqzsd");
		System.out.println(output);
		
		String output1 = prog.getEncryption("3@#$%^&DFGHJKfggggb09876");
		System.out.println(output1);
	}
}

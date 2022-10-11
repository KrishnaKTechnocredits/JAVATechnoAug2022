/*Assignment - 36 : 9th Oct'2022

Program 1 : 
WAP to return String by encrypting all characters from given string by its next character.

input : apdz
output : bqea*/

package rashmiG.Assignment36ASCIIPrograms;

public class EncryptionOfCharacters {

	String getEncryptedString(String input) {
		String output = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch == 'z') {
				output = output + 'a';
			} else {
				ch++;
				output = output + ch;
			}
		}
		return output;
	}

	public static void main(String[] args) {
		EncryptionOfCharacters encryption = new EncryptionOfCharacters();
		String str1 = "apdz";
		String str2 = "appPMZ&&%@zzZ89";
		System.out.println(str1 + " --> " + encryption.getEncryptedString(str1));
		System.out.println(str2 + " --> " + encryption.getEncryptedString(str2));
	}
}

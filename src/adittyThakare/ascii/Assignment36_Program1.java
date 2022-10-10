/*Assignment - 36 : 9th Oct'2022

Program 1 : 
WAP to return String by encrypting all characters from given string by its next character.

input : apdz
output : bqea*/
package adittyThakare.ascii;

public class Assignment36_Program1 {
	String getEncryptedString(String str) {
		String strOutput = new String();
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (ch == 'Z') {
				strOutput = strOutput + 'A';
			} else if (ch == 'z') {
				strOutput = strOutput + 'a';
			} else {
				int asciiNum = ch + 1;
				char op = (char) asciiNum;
				strOutput = strOutput + op;
			}
		}
		return strOutput;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment36_Program1 assignment36_Program1 = new Assignment36_Program1();
		String input = "apdz";
		System.out.println("Input String: " + input);
		System.out.println("Encrypted string: " + assignment36_Program1.getEncryptedString(input));
	}

}

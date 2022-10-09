/*Program 7 : 
WAP to return String by encrypting all characters from given string by its next character.

input : aPd%3zZ
output : bQe%3aA

if(ch =='Z'){
	output = output + 'A';
}else if(ch =='z'){
	output = output + 'a';
}else{
	if((ch>=65 && ch<=90) || (ch>=97 && ch<=122)){
		ch++;
	}
	output = output + ch;
}*/
package adittyThakare.ascii;

public class Assignment36_Program7 {
	String getEncryptedCharactersWithNextCharacter(String str) {
		String encryptedString = "";

		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (ch == 'Z') {
				encryptedString = encryptedString + 'A';
			} else if (ch == 'z') {
				encryptedString = encryptedString + 'a';
			} else {
				if ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)) {
					ch++;
				}
				encryptedString = encryptedString + ch;
			}
		}
		return encryptedString;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment36_Program7 assignment36_Program7 = new Assignment36_Program7();
		String str = "aPd%3zZ";
		System.out.println("Input String: " + str);
		System.out.println("Encrypted String: " + assignment36_Program7.getEncryptedCharactersWithNextCharacter(str));

	}

}

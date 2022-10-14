/*Program 7 : 
WAP to return String by encrypting all characters from given string by its next character.

input : aPd%3zZ
output : bQ%e3aA

if(ch =='Z'){
	output = output + 'A';
}else if(ch =='z'){
	output = output + 'a';
}else{
	if((ch>=65 && ch<=90) || (ch>=97 && ch<=122)){
		ch++;
	}
	output = output + ch;
}
*/
package smitaVetal.Assignment31_40;

public class Assignment36_7 {

	String getEncryptedChar(String input) {
		String output = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
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
		String output = new Assignment36_7().getEncryptedChar("aPd%3zZ");
		System.out.println(output);
	}

}

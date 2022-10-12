/*Program 1 : 
WAP to return String by encrypting all characters from given string by its next character.

input : apdz
output : bqea


Program 7 : 
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
}


*/
package asthaSrivastava.ascii;

public class NextCharacter {
	// method to return String by encrypting all characters from given string by its
	// next character
	String getNextChar(String str) {
		String output = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'Z') {
				output = output + 'A';
			} else if (ch == 'z') {
				output = output + 'a';
			} else {
				ch++;
				output = output + ch;
			}
		}
		return output;
	}

	String getNextCharFromGivenString(String str) {
		String output = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (ch == 'Z') {
				output = output + 'A';
			} else if (ch == 'z') {
				output = output + 'a';
			} else if (ch >= 65 && ch <= 90 || (ch >= 97 && ch <= 122))
				ch++;
			output = output + ch;
		}
		return output;
	}

	public static void main(String[] args) {
		NextCharacter test = new NextCharacter();
		String str = "apdz";
		System.out.println("Output of " + str + " is: " + test.getNextChar(str));

		String input = "aPd%3zZ";
		System.out.println("\nOutput of " + input + " is: " + test.getNextCharFromGivenString(input));
	}
}

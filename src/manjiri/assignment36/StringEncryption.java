/*Program 1 : 
WAP to return String by encrypting all characters from given string by its next character.

input : apdz
output : bqea*/

package manjiri.assignment36;

public class StringEncryption {
	
	String getEncryptedString(String input){
		String outputString = "";
		
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if(ch == 'z') { // if char is 'z' then replace by 'a'
				ch = 'a';
			}else { // for any other char replace by next char
				ch++;
			}
			outputString += ch;
		}	
		return outputString;	
	}
	
	public static void main(String[] args) {
		String input = "apdz";
		
		System.out.println("Input String is: " + input);
		System.out.println("--------------------------");
		
		System.out.println("Encrypted String is: " + new StringEncryption().getEncryptedString(input));
	}
}

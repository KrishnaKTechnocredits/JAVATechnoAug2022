package ashishBramhe;

public class A18_StringOperations {

	String rearrangeStringDigitCharacter(String str) {
		String rearrangedString = "", digitString = "", characterString = "";
		System.out.print("\n Input String : " + str);
		for(int i=0; i<str.length(); i++){
			if(Character.isDigit(str.charAt(i)))
				digitString += str.charAt(i);
			else
				characterString += str.charAt(i);
		}
		rearrangedString = digitString + characterString;
		return rearrangedString;
	}
	
	String rearrangeStringUpperDigitLower(String str) {
		String rearrangedString = "", upperCaseString = "", digitString = "", lowerCaseString = "";
		char ch = '\0';
		System.out.print("\n Input String : " + str);
		for(int i=0; i<str.length(); i++) {
			ch = str.charAt(i);
			if(Character.isUpperCase(ch))
				upperCaseString += ch;
			else if(Character.isDigit(ch))
				digitString += ch;
			else if(Character.isLowerCase(ch))
				lowerCaseString += ch;
		}
		rearrangedString = upperCaseString + digitString + lowerCaseString;
		return rearrangedString;
	}
	
	int getFrequencyOfCharFromString(String str, char ch) {
		int count = 0;
		System.out.print("\n Frequency of character " + ch + " in string : " + str + " : ");
		for(int i=0;i<str.length(); i++) {
			if(str.charAt(i) == ch)
				count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A18_StringOperations stringOperations = new A18_StringOperations();
		System.out.println("\n Re-arranged string with all digits and characters : " + stringOperations.rearrangeStringDigitCharacter("Neha123Ashish"));
		System.out.println("\n Re-arranged string with Upper case , digits and lower case characters : " + stringOperations.rearrangeStringUpperDigitLower("neha123ASHISH"));
		System.out.print(stringOperations.getFrequencyOfCharFromString("TECHNOCREDITS", 'E') + " times");
	}
}

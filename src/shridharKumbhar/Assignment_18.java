//rearrange string format 
//AllDigitAllCharacter
//Uppercase letters + digit + lowercase letters
//frequesncy of given character "t"

package shridharKumbhar;

public class Assignment_18 {
	
	String getrearrangedDigitChar(String name) {
		
		String allString = "";
		String allDigit = "";
		
		for (int index = 0; index< name.length(); index++ ) {
			char ch = name.charAt(index);
			if (Character.isDigit(ch)) {
				allDigit= allDigit+ ch;
			}else if(Character.isLetter(ch)) {
				allString = allString + ch;
			}
		} return (allDigit + allString);	
	}
	
	String getrearrangedUpperDigitLower(String name) {
		
		String upperCase = "";
		String allDigit = "";
		String lowerCase = "";
		
		for (int index = 0; index< name.length(); index++ ) {
			char ch = name.charAt(index);
			if (Character.isDigit(ch)) {
				allDigit= allDigit+ ch;
			}else if (Character.isUpperCase(ch)){
				upperCase = upperCase + ch;
			}else if (Character.isLowerCase(ch))
				lowerCase = lowerCase + ch;
		}
		return (upperCase + allDigit + lowerCase);	
	}
	
	int getTargetCharCount(String name , char target) {
		
		name = name.toLowerCase();
		target = Character.toLowerCase(target);
		int count = 0;
		
		for (int index =0 ; index < name.length() ; index++) {
			if (name.charAt(index)== target) {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		System.out.println("Digit Character rearrangement: "+ new Assignment_18().getrearrangedDigitChar("te2cH4no"));
		System.out.println("Digit Character rearrangement: "+ new Assignment_18().getrearrangedUpperDigitLower("te2cDH4oCe892Di0t"));
		
		String inputStr = "teTcDHT4C9t2D0t";
		char inputCharacter = 'T';
		System.out.println("Total count of " + inputCharacter + " in "+ inputStr + " is:  " + (new Assignment_18().getTargetCharCount(inputStr , inputCharacter)));
	}
}

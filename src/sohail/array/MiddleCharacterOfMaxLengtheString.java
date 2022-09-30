//Return middle character of max length String from given array.
//input : {"Krishna","Maulik","Aashvi","Technocredits","Harsh"}
//output : c

package sohail.array;

public class MiddleCharacterOfMaxLengtheString {


	String getMaxlengthString(String[] s){
		String max=s[0];
		int length=s[0].length();
		for(int index=1;index<s.length;index++) {
			char [] temp=s[index].toCharArray();
			if (length<s[index].length()) {
				max=s[index];
				length=s[index].length();				
			}
		}

		return max;
	}

	char getMiddleCharacter(String max) {
		int charIndex = max.length() / 2;
		if (max.length() % 2 == 0) {
			charIndex = charIndex - 1;
		}
		return max.toCharArray()[charIndex];
	}
	public static void main(String[] args) {

		String [] arrayInput= {"Krishna","Maulik","Aashvi","Technocredits","Harsh"};
		MiddleCharacterOfMaxLengtheString middlechar=new MiddleCharacterOfMaxLengtheString();
		String maxString = middlechar.getMaxlengthString(arrayInput);
		char result= middlechar.getMiddleCharacter(maxString);
		System.out.println(maxString+ " -> " + result);

	}

}

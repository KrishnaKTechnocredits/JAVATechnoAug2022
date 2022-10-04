//2. return middle character from given name.
// Hint : char getMiddleChar(String name)

// input : Maulik
// output : Middle character in name Maulik is u

// input : Technocredits
// output : Middle character in name Technocredits is c

package sohail.prime_number;

public class ReturnStringMiddleChar {
	
	char getNameMiddleChar(String str) {		
		int index=0;
		char  charat = 0;
		int stringlength=str.length();
		
		if (stringlength % 2 == 0 ) {
		index=str.length()/2-1;
		charat =  str.charAt(index);
		System.out.println("Middle character is  "+charat);		
		}
		else {
			index=str.length()/2;
			charat =  str.charAt(index);
			System.out.println("Middle character is  "+charat);	
		}
		return charat;
		}	

	public static void main(String[] args) {
		ReturnStringMiddleChar returnstringmiddlechar= new ReturnStringMiddleChar();
		returnstringmiddlechar.getNameMiddleChar("Maulik");
	}
}

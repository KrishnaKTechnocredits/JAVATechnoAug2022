//Assignment 16(2) 6th Sep
//2. return middle character from given name.
// Hint : char getMiddleChar(String name)

// input : Maulik
// output : Middle character in name Maulik is u

// input : Technocredits
// output : Middle character in name Technocredits is c

package shivaniLikhia;

public class MiddleCharacter {
	
	char getMiddleChar(String name) {
		int length = name.length();
		int index=0;
		
		if(index%2==0) {
			index = length/2-1;
		}
		else {
			index = length/2;
		}
		return name.charAt(length);
	}
	
	public static void main(String[] args) {
		String name = "Maulik";
		int index = name.length()/2-1;
		char ch = name.charAt(index);
		System.out.println("Middle character in name " +name+ " is : " +ch );
		name = "Technocredits";
		index = name.length()/2;
		ch = name.charAt(index);
		System.out.println("Middle character in name " +name+ " is : " +ch );	
		}
}

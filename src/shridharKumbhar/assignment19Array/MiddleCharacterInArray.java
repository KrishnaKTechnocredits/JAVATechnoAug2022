//middle character of array element {"Ashish","Aditty","Manjiri","Ankita"}
package shridharKumbhar.assignment19Array;

public class MiddleCharacterInArray {
	
	char getMiddleCharacter(String name) {
		
		int length = name.length() ;
		char character ;
		
		if (length%2 ==0) {
			character = name.charAt(length/2 -1 );	
		}else {
			character = name.charAt(length/2);
		}
		return character ;
	}
	
	void middleCharacter(String[] array) {
		
		for(int index=0 ; index< array.length ; index++ ) {
			System.out.println("Middle character of "+array[index] +": "+getMiddleCharacter(array[index]));
		}
		
	} 
	
	public static void main(String[] args) {
		String[] array = {"Ashish","Aditty","Manjiri","Ankita"};
		new MiddleCharacterInArray(). middleCharacter(array);
	}

}

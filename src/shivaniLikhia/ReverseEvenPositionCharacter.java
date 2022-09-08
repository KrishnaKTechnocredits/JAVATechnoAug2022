//Program 3 : Write a method to return even position characters from given String in reverse.
//input : technocredits
//output : tdrohe

package shivaniLikhia;


public class ReverseEvenPositionCharacter {
	
	String getRevEvenPositionChar(String name) {
		int nameLength = name.length();
		String reverseEvenName = "";
		for (int index=nameLength-1;index>=0;index--) {
			if(index%2!=0) {
				reverseEvenName = reverseEvenName + name.charAt(index); 
			}
		}
		return reverseEvenName;
	}
	
	public static void main(String[] args) {
		System.out.println(new ReverseEvenPositionCharacter().getRevEvenPositionChar("technocredits"));
	}
}

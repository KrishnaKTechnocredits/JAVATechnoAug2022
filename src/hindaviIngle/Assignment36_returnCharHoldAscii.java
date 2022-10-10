/*
 Program 5 : 
Return character holding given Ascii value.
	
input : 69
output : E
 */
package hindaviIngle;

public class Assignment36_returnCharHoldAscii {

	char getCharHoldAscii(int ascii) {
		System.out.println("Input :" + ascii);
		char ch = (char) ascii;
		return ch;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment36_returnCharHoldAscii a36 = new Assignment36_returnCharHoldAscii();
		char ch = a36.getCharHoldAscii(69);
		System.out.println("Output :" + ch);
	}

}

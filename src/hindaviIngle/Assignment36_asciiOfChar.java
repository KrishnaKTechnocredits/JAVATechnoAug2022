
/*
 * 
Program 2 : 
WAP to return ascii of given character.

input : C
output : 67
 */
package hindaviIngle;

public class Assignment36_asciiOfChar {

	int asciiOfChar(char ch) {
		int ascii = ch;// it will consider ascii value of char ch
//		System.out.println(ch+"------>"+ascii);
		return ascii;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment36_asciiOfChar a36 = new Assignment36_asciiOfChar();
		int output = a36.asciiOfChar('C');
		System.out.println("ASCII of char : " + 'C' + "------>" + output);

	}

}

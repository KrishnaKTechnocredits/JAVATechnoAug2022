//Program 5 : 

//Return character holding given Ascii value.

//input : 69
//output : E

package akankshaSharma.assignment36;

public class Program5 {
	char printAscii(int ascii) {
		char ch = (char) ascii;
		return ch;
	}

	public static void main(String[] args) {
		Program5 test = new Program5();
		int ascii = 69;
		char result = test.printAscii(ascii);
		System.out.println(ascii + " ----> " + result);
	}

}

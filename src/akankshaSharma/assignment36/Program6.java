//Program 6 :
 
//Print all characters having ascii value 91 ot 96.

//output : 91 -> [
//        92 -> \
//       93 -> ]
package akankshaSharma.assignment36;

public class Program6 {
	char printAscii(int ascii) {
		char ch = (char) ascii;
		return ch;
	}

	public static void main(String[] args) {
		Program6 test = new Program6();
		for (int i = 91; i <= 96; i++) {
			char ch = test.printAscii(i);
			System.out.println(i + " ----> " + ch);
		}
	}

}

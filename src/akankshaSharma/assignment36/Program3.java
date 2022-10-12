/*Program 3 :
//WAP to print ascii value of A->Z.

//output : A -> 65
//        B -> 66*/

package akankshaSharma.assignment36;

public class Program3 {

	int printAscii(char ch) {
		int ascii = ch;
		return ascii;
	}

	public static void main(String[] args) {
		Program3 test = new Program3();
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			int result = test.printAscii(ch);
			System.out.println(ch + " ----> " + result);
		}
	}
}

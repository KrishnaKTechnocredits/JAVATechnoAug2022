/*Program 3 : WAP to print ascii value of A->Z.
*/

package sagarY.Assignment_36;

public class Program_3 {
	
	void printAsciiValueOfAtoZ() {
		System.out.println("Ascii value of 'A' to 'Z' :");
		for(char c = 'A'; c<='Z';c++) {
			int asciiValue = c;
			System.out.println("\t"+c +"--"+asciiValue);
		}
	}
	public static void main(String[] args) {
		System.out.println("Program 3 : WAP to print ascii value of A->Z");
		System.out.println("--------------------------------------------");
		Program_3 prg3 = new Program_3();
		prg3.printAsciiValueOfAtoZ();
	}

}

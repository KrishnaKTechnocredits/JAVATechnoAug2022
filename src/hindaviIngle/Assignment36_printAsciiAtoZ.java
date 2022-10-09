/*
 * Program 3 : 
WAP to print ascii value of A->Z.

output : A -> 65
         B -> 66
		 .
		 .
		 Z -> 90
 */
package hindaviIngle;

public class Assignment36_printAsciiAtoZ {

	void printAsciiOfAtoZ() {
		for (int ascii = 65; ascii <= 90; ascii++) {
			char ch = (char) (ascii);
			System.out.println(ch + "--->" + ascii);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment36_printAsciiAtoZ a36 = new Assignment36_printAsciiAtoZ();
		a36.printAsciiOfAtoZ();
	}
}

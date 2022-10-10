/*Assignment - 36 : 9th Oct'2022
Program 3 : 
WAP to print ascii value of A->Z.

output : A -> 65
         B -> 66
		 .
		 .
		 Z -> 90*/

package rashmiG.Assignment36ASCIIPrograms;

public class AsciiValueFromAtoZ {

	void printAsciiValue() {
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			int ascii = ch;
			System.out.println(ch + " --> " + ascii);
		}
	}

	public static void main(String[] args) {
		new AsciiValueFromAtoZ().printAsciiValue();
	}
}
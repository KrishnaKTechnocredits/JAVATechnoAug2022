/*
 Program 3 : 
WAP to print ascii value of A->Z.

output : A -> 65
         B -> 66
		 .
		 .
		 Z -> 90

 */

package swapnilMaheshwari.AsciiValuePrograms;

public class PrintAsciiValueOfAllCharacters {
	void printAsciiForAtoZ() {
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			int asc = ch;
			System.out.println(ch + "-> " + asc);
		}
	}

	public static void main(String[] args) {
		new PrintAsciiValueOfAllCharacters().printAsciiForAtoZ();
	}
}

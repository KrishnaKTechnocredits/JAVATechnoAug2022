/*Program 6 : Print all characters having ascii value 91 ot 96.

output : 91 -> [
         92 -> \
         93 
*/

package sagarY.Assignment_36;

import java.util.Scanner;

public class Program_6 {
	
	void  printCharHoldAscii() {
		
		for(int index = 91;index<=96;index++) {
			char ch = (char)index;
			System.out.println(index +"--"+ch);	
		}
		
	}
	public static void main(String[] args) {
		System.out.println("Program 6 : Print all characters having \nascii value 91 ot 96.");
		System.out.println("----------------------------------");
		Program_6 prg6= new Program_6();
		System.out.println("OUTPUT: Ascii value of '91' to '96' is\n");
		prg6.printCharHoldAscii();
	}

}

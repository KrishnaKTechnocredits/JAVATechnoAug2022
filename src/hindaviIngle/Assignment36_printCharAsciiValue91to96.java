/*
 * Program 6 : 
Print all characters having ascii value 91 ot 96.

output : 91 -> [
         92 -> \
         93 -> ]		 

 */
package hindaviIngle;

public class Assignment36_printCharAsciiValue91to96 {

	void printCharHavingAscii() {
		for (int ascii = 91; ascii <= 96; ascii++) {
			char ch = (char) ascii;
			System.out.println(ascii + "--------->" + ch);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment36_printCharAsciiValue91to96 a36 = new Assignment36_printCharAsciiValue91to96();
		a36.printCharHavingAscii();
	}

}

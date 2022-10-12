/*Program 6 : 
Print all characters having ascii value 91 ot 96.

output : 91 -> [
         92 -> \
         93 -> ]		 
*/
package adittyThakare.ascii;

public class Assignment36_Program6 {
	void printCharactersForAsciiFrom91To96() {

		for (int index = 91; index <= 96; index++) {
			char ch = (char) index;
			System.out.println(index + " -> " + ch);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment36_Program6 assignment36_Program6 = new Assignment36_Program6();
		System.out.println("Characters having ASCII value from 91 to 96!");
		assignment36_Program6.printCharactersForAsciiFrom91To96();
	}

}

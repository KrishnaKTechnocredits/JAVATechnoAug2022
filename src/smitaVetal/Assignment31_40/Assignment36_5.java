/*Program 5 : 
Return character holding given Ascii value.

input : 69
output : E
*/
package smitaVetal.Assignment31_40;

public class Assignment36_5 {

	void getCharValue(int input) {

		char ch = (char) input;
		System.out.println("Character holding Ascii value " +input+ " is : " +ch);
	}

	public static void main(String[] args) {
		Assignment36_5 prog = new Assignment36_5();
		prog.getCharValue(69);
	}
}

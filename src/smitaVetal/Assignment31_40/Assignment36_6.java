/*Program 6 : 
Print all characters having ascii value 91 ot 96.

output : 91 -> [
         92 -> \
         93 -> ]
*/
package smitaVetal.Assignment31_40;

public class Assignment36_6 {

	void getAsciiPrint(int startIndex, int endIndex) {
		for (int index = startIndex; index <= endIndex; index++) {
			char ch = (char)index;
			System.out.println(ch);
		}
	}

	public static void main(String[] args) {
		new Assignment36_6().getAsciiPrint(90,96);
	}
}

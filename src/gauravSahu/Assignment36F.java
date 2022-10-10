/*Program 6 : 
Print all characters having ascii value 91 ot 96.

output : 91 -> [
         92 -> \
         93 -> ]		 
*/
package gauravSahu;

public class Assignment36F {

	void getCharater() {
		for(int i = 91;i<=96;i++ ) {
			System.out.println("Character of value " + i + " is " + (char)i);
		}
	}

	public static void main(String[] args) {
		Assignment36F a36 = new Assignment36F();
		a36.getCharater();
	}
}

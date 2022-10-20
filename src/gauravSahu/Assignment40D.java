/*Program 4 : Return a reverse String [Use : StringBuilder].*/
package gauravSahu;

public class Assignment40D {
	
	void getReverseNameUsingStringBuilder(String input) {
		StringBuilder output = new StringBuilder(input);
		StringBuilder reverseString = output.reverse();
		System.out.println("Rverse string using String Builder  :  " + reverseString);
	}
	
	public static void main(String[] args) {
		Assignment40D a40  = new Assignment40D();
		String input  = "Gaurav";
		System.out.println("Input String  : " + input);
		a40.getReverseNameUsingStringBuilder(input);
	}

}

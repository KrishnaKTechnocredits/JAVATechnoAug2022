/*Program 4 : Return a reverse String [Use : StringBuilder].*/

package ankitaBarwad;

public class A40_ReverseStringUsingStringBuilder {
	
	String getReverseString(){
		StringBuilder name = new StringBuilder("technocredits");
		System.out.println("Input String is: " + name);
		return name.reverse().toString();
	}
	
	public static void main(String[] args) {
		System.out.println("Program 4 : Return a reverse String [Use : StringBuilder]");
		String reversename = new A40_ReverseStringUsingStringBuilder().getReverseString();
		System.out.println("Reverse String is: " + reversename);
	}
}

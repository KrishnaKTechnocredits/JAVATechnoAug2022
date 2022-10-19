/*Program 4 : Return a reverse String [Use : StringBuilder].*/

package manjiri.assignment40;

public class ReverseStringUsingStringBuilder {
	
	String getReverseString(){
		StringBuilder name = new StringBuilder("technocredits");
		System.out.println("Input String is: " + name);
		System.out.println("---------------------------------");
		return name.reverse().toString();
	}
	
	public static void main(String[] args) {
		String reversename = new ReverseStringUsingStringBuilder().getReverseString();
		System.out.println("Reverse String is: " + reversename);
	}
}

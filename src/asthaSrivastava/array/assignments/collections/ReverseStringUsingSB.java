/*Program 4 : Return a reverse String [Use : StringBuilder].
*/
package asthaSrivastava.array.assignments.collections;

public class ReverseStringUsingSB {

	String reverseStringUsingStringBuffer(String str) {
		StringBuffer sb = new StringBuffer(str);
		System.out.println("Reverse of given String " + str + " is " + sb.reverse().toString());
		return str;
	}

	public static void main(String[] args) {
		String str = "Technocredits";
		new ReverseStringUsingSB().reverseStringUsingStringBuffer(str);
	}
}

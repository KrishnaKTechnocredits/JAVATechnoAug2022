/*Assignment 40 : 16th Oct'2022

Program 4 : Return a reverse String [Use : StringBuilder].*/

package rashmiG.ReverseStringDifferentApproaches;

public class ReverseStringUsingStringBuider {

	String reverString(String input) {
		return new StringBuilder(input).reverse().toString();

//		StringBuilder sb = new StringBuilder(input);
//		sb.reverse();
//		String rev = sb.toString();
//		return rev;
	}

	public static void main(String[] args) {
		String str = "RashmiIr";
		System.out.println("Input: " + str);
		System.out.println("Reversed string :" + new ReverseStringUsingStringBuider().reverString(str));
	}
}
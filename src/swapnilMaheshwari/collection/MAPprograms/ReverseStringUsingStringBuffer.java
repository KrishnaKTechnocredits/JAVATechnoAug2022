/*
Program 4 : Return a reverse String [Use : StringBuilder].
Input : technocredits
Output: stiderconhcet
 */
package swapnilMaheshwari.Collection.MAPprograms;

public class ReverseStringUsingStringBuffer {
	StringBuffer getReverseStringUsingStringBuffer(String str) {
		StringBuffer strBuffer=new StringBuffer(str);
		return strBuffer.reverse();

	}	
public static void main(String[] args) {
	String input= "technocredits";
	System.out.println("Input :"+input);
	System.out.println("Output :"+new ReverseStringUsingStringBuffer().getReverseStringUsingStringBuffer(input));
}
}

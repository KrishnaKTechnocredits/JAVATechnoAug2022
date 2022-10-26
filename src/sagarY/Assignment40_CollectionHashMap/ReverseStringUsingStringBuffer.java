/*Program 4 : Return a reverse String using StringBuilder. 
 */


package sagarY.Assignment40_CollectionHashMap;

import java.util.Scanner;

public class ReverseStringUsingStringBuffer {
	
	StringBuffer reverseStringUsingStringBuffer(String name) {

		StringBuffer reverseName = new StringBuffer(name);
		reverseName.reverse();
		
		return reverseName;
	}
	
	public static void main(String[] args) {
		System.out.println("Program 4 : Return a reverse String using StringBuffer");
		System.out.println("=======================================================");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String to replace:");
		String name = sc.next();		
		ReverseStringUsingStringBuffer reverse = new ReverseStringUsingStringBuffer();
		StringBuffer output = reverse.reverseStringUsingStringBuffer(name);
		System.out.println("\nReverse string is: '"+output+"'");
	}
	

}

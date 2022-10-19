/*Program 3 : Return a reverse String [Method : inplace reverse].
 
 */


package sagarY.Assignment40_CollectionHashMap;

import java.util.Scanner;

public class ReverseStringUsingInplace {
	
	String reverseStringUsingInplace(String name) {
		
		for(int index=0, innerIndex=name.length()-1; index<innerIndex;index++,innerIndex--) {
			char ch1= name.charAt(index);
			char ch2 = name.charAt(innerIndex);
			
			name = name.substring(0, index)+ch2 +name.substring(index+1,innerIndex) + ch1 +name.substring(innerIndex+1); 
		}
		return name;
	}
	
	public static void main(String[] args) {
		System.out.println("Program 3 : Return a reverse String \n[Method : inplace reverse]");
		System.out.println("========================================");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String to replace: '");
		String name = sc.next();		
		ReverseStringUsingInplace reverse = new ReverseStringUsingInplace();
		String output = reverse.reverseStringUsingInplace(name);
		System.out.println("\nReverse of the string is: '"+output+"'");
	}
	

}

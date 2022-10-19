/*
 * Assignment 40
 * Program 3 : Return a reverse String [Method : inplace reverse]
 */
package harshalRane.Assignments.assignment40;

public class ReverseStringInplaceReverse {
	String getReverseString(String input) {
		for(int i=0,j=input.length()-1;i<j;i++,j--) {
			char ch1 = input.charAt(i);
			char ch2 = input.charAt(j);
			if(i==0) {
				input = ch2 + input.substring(i+1,j) + ch1;
			}else {
				input = input.substring(0,i)+ch2+input.substring(i+1,j)+ch1+input.substring(j+1);
			}
		}
		return input;
	}
	
	public static void main(String[] args) {
		ReverseStringInplaceReverse reverseStringInplaceReverse = new ReverseStringInplaceReverse();
		String input = "technocredits";
		System.out.println("Reverse String using Inplace Replacement");
		System.out.println("Input: "+input);
		System.out.println("Output: "+reverseStringInplaceReverse.getReverseString(input));
	}
}

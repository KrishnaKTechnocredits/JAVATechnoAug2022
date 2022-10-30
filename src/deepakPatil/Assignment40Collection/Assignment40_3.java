/*Assignment 40 : 16th Oct'2022
Program 3 : Return a reverse String [Method : inplace reverse].
*/

package deepakPatil.Assignment40Collection;

public class Assignment40_3 {
	
	String getInplaceReverseString(String input) {
		char startChar=0;
		char endChar=0;
		
		for(int i=0,j=input.length()-1;i<j;i++,j--) {
			startChar=input.charAt(i);
			endChar=input.charAt(j);
			if(i==0)
				input=endChar+input.substring(i+1, j)+startChar;
			else
				input=input.substring(0,i)+endChar+input.substring(i+1,j)+startChar+input.substring(j+1,input.length());
		}
		return input;
	}
	
	public static void main(String[] args) {
		String input="technocredits";
		System.out.println("Given string is: " +input);
		System.out.println("Reverse String using inplace replacement: "+new Assignment40_3().getInplaceReverseString(input));
	}
}

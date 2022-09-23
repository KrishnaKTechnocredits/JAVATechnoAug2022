/*Assignment - 26 : 21st Sep'2022

find out frequency of each character from given input using single while loop.
String str = "technocreditst";
*/

package sanket;

public class ArrayOperationsEx7 {
	
	void getFrequencyOfEachCharacter(String name) {
		
		int originalLength = 0;
		int newLength = 0;
		
		while(name.length()>0) {
			
			char ch = name.charAt(0);
			String str = Character.toString(ch);
			originalLength = name.length();
			name = name.replace(str,"");
			newLength = name.length();
			System.out.println(ch + "-->" + (originalLength-newLength));
		}
	}
	
	public static void main(String[] args) {
		
		String input = "technocreditst";
		System.out.println("The input string is " + input);
		System.out.println("The frequency of each character in given string is : ");
		ArrayOperationsEx7 arrayOperation = new ArrayOperationsEx7();
		arrayOperation.getFrequencyOfEachCharacter(input);
	}
}

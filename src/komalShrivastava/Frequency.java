//Assignment 26: Find out frequency of each character from given input using single while loop.

package komalShrivastava;

public class Frequency {

	// method to find character frequency 
	
	static void getFrequency(String str) {
		while(str.length()>0) {
			char ch = str.charAt(0);						//get the latest 0th index character
			int originalLength = str.length(); 				// get the latest original length
			str = str.replace(Character.toString(ch),"");	// replace the character in rest of the string
			int newLength = str.length();					// get the latest new length of string
			System.out.println(ch + " --> " + (originalLength-newLength)); 
		}
	}
		
	public static void main(String[] args) {
		String str = "technocredits";
		System.out.println("Frequency of each character in " + str + " : \n");
		getFrequency(str);
	}
}
/*Write a method to find whether given String is pallindrome.
input : radar
output : radar is pallindrom
input : aabcbaa
output : aabcbaa is pallindrom
input : abcabc
output : abcabc is not a pallindrom*/

package manjiri.StringEx.assignment31;

public class CheckPallindormString {
	
	void CheckPallindrom(String input) {
		
		//Convert String to lowercase
		input = input.toLowerCase();
		
		//To store reverse String
		String outputString = "";
		
		//To get reverse String
		for(int index = input.length()-1; index >= 0; index--) {
				outputString += input.charAt(index);
		}
		
		//Check if input String and Reverse String are equal
		if(input.equals(outputString))
			System.out.println(input + " " + "is pallindrom");
		else
			System.out.println(input + " " + "is not pallindrom");
	}
	
	public static void main(String[] args) {
		CheckPallindormString checkPallindrom = new CheckPallindormString();
		checkPallindrom.CheckPallindrom("Radar");
		checkPallindrom.CheckPallindrom("aAbcbaa");
		checkPallindrom.CheckPallindrom("abcaBc");
	}
	

}

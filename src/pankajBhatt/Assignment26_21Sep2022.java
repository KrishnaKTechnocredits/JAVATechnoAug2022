/*Assignment - 26 : 21st Sep'2022

find out frequency of each character from given input using single while loop.
String str = "technocreditst";	*/

package pankajBhatt;

public class Assignment26_21Sep2022 {
	
	void getFrequency(String str) {
		while(str.length() > 0 ) {
			int length = str.length();
			char ch = str.charAt(0);
			str = str.replace(Character.toString(ch), "");
			int newLength = str.length();
			int frequency = length - newLength;
			System.out.println(ch + " frequency -> "+ frequency);
		}
	}

	public static void main(String[] args) {
		Assignment26_21Sep2022 assignment26_21Sep2022 = new Assignment26_21Sep2022();
		String str = "technocreditst";	
		assignment26_21Sep2022.getFrequency(str);
	}
}

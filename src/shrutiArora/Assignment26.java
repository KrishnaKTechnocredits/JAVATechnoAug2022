/*Assignment - 26 : 21st Sep'2022

find out frequency of each character from given input using single while loop.
String str = "technocreditst";*/
package shrutiArora;
public class Assignment26 {
	void findFrequencyOfEachChar(String str) {
		System.out.println("String str: " + str);
		System.out.println("Output: ");
		while(str.length()>0) {
			String ch = String.valueOf(str.charAt(0));
			int ol = str.length();
			str = str.replace(ch, "");
			int  nl = str.length();
			System.out.println(ch + " -> " + (ol-nl));
		}
	}
	public static void main(String[] args) {
		Assignment26 assignment26 = new Assignment26();
		String str = "technocreditst";
		assignment26.findFrequencyOfEachChar(str);
		
	}
}
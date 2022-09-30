/*find out frequency of each character from given input using single while loop.
String str = "technocreditst";
*/

package gauravSahu.assignments;

public class Assignment26 {
	void getRepChar(String str) {
		
		while(str.length()>=1) {
			char ch= str.charAt(0);
			String str1 = Character.toString(ch);
			int length = str.length();
			str = str.replace(str1,"");
			int newlength = str.length();
			System.out.println(str1 + "=" +(length-newlength));
		}
	}
	
	public static void main(String[] args) {
		Assignment26 a26 = new Assignment26();
		String str = "technocreditst";
		System.out.println("Repetetive character in given " +  str  + " string is" );
		a26.getRepChar(str);
		
		
	}
}

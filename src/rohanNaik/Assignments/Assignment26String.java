/*find out frequency of each character from given input using single while loop.
String str = "technocreditst";
Also handled Case sensitivity.
*/
package rohanNaik.Assignments;

public class Assignment26String {

	void getCount(String input) {

		String str = input;
		str = str.toLowerCase();
		
		while (str.length() > 0) {
			char ch = str.charAt(0);
			int originalLength = str.length();
			String replaceElement = Character.toString(ch);
			str = str.replace(replaceElement, "");
			int newLength = str.length();
			System.out.println(replaceElement + " count is : " + (originalLength - newLength));
		}
	}

	public static void main(String[] args) {

		Assignment26String obj = new Assignment26String();
		obj.getCount("TechnocrediDCHtst");
	}

}

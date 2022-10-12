/*find out frequency of each character from given input using single while loop.
String str = "technocreditst";
*/

package saroj.arrayPrograms;

public class Assignment26 {

	void frequencyOfCharacter(String input) {
		input = input.toLowerCase();
		while(input.length()>0) {
			int originalLength = input.length();
			String ch = Character.toString(input.charAt(0));
			input = input.replace(ch,""); 
			int newLength = input.length();
			System.out.println(ch+"->"+(originalLength-newLength));
		}
		
	}
	
	public static void main(String[] args) {
		Assignment26 assignment26 = new Assignment26();
		String str= "technocreditst";
		System.out.println("Frequency of each caharcter in: "+str);
		assignment26.frequencyOfCharacter(str);
	}
}

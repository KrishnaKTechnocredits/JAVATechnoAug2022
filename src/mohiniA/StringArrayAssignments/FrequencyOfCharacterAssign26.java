package mohiniA.StringArrayAssignments;

/******Assignment - 26 : 21st Sep'2022 *******************/ 
/*find out frequency of each character from given input using single while loop.
String str = "technocreditst";
*/
public class FrequencyOfCharacterAssign26 {
	
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
		FrequencyOfCharacterAssign26 freq = new FrequencyOfCharacterAssign26();
		String str= "technocreditst";
		System.out.println("Frequency of each caharcter in: "+str);
		freq.frequencyOfCharacter(str);
	}


}

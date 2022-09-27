//Assignment - 26 : 21st Sep'2022
//
//find out frequency of each character from given input using single while loop.
//String str = "technocreditst";
package maheshSantoki.LoopExamples;

public class CharacaterFrequency {
	void findCharacterFrequency(String str) {
		System.out.println("Given String is : " + str);
		System.out.println("Frequency of characters in given String is : \n");

		while (str.length() > 0) {
			int orginalLen = str.length();//Original length of input string
			char ch = str.charAt(0);//get character from input string and store it in char
			String str1 = Character.toString(ch);//convert character to string
			
			str = str.replace(str1, "");//replace char with blank space
			int newLength = str.length();// get the new length of input string
			
			int frequency = orginalLen - newLength;//get frequency of char
			System.out.println(str1 + " --> " + frequency);
		}
	}

	public static void main(String[] args) {
		CharacaterFrequency char1 = new CharacaterFrequency();
		String str = "technocreditst";
		char1.findCharacterFrequency(str);
	}
}
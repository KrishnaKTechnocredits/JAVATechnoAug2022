/*Assignment - 26 : 21st Sep'2022

find out frequency of each character from given input using single while loop.
String str = "technocreditst";*/

package adittyThakare.stringoperations;

public class Assignment26 {
		
		// Method to find frequency of each character in the given String
		void getFrequencyOfChar(String input) {
			int originalStrLength = 0 , newStrLength = 0, frequencyCount = 0;
			
			while (input.length() > 0) { //iterate loop till String length
				char ch = input.charAt(0);  // Get first character of String
				String str = Character.toString(ch); //Convert character to String
				
				originalStrLength = input.length();    //Get Original String length
				input = input.replace(str, "");        // Replace character returned in line 16 with blank
				newStrLength = input.length();         // Find new length of string
				frequencyCount = originalStrLength - newStrLength;    //Subtract original string length from new string length, giving frequency of that particular character

				System.out.println("\'" + ch + "\'" + " -> " + frequencyCount);
			}
		}

		public static void main(String[] args) {
			String input = "technocreditst";
			Assignment26 assignment26 = new Assignment26();
			
			System.out.println("Method to find frequency of each character from given String!");
			System.out.println("\nInput String: "+input+"\nOutput:");
			assignment26.getFrequencyOfChar(input);
		}
}

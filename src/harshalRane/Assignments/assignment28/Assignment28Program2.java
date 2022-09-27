/*
 * Program 2 : [10 mins]
Return first vowel from given String.

input : technocredits
outout : e
 */

package harshalRane.Assignments.assignment28;

public class Assignment28Program2 {
	
		char getVovels(String input) {
			for(int index=0;index<input.length();index++) {
				char ch = input.charAt(index);
			
			switch(ch) {
				case 'a' :
					return ch;
					
				case 'e' :
					return ch;
					
				case 'i' :
					return ch;
					
				case 'o' :
					return ch;
					
				case 'u' :
					return ch;
			
				default:
			}
		}	
			return 0;
	}
		
		public static void main(String[] args) {
			Assignment28Program2 assignment28 = new Assignment28Program2();
			String input = "technocredits";
			char ch = assignment28.getVovels(input);
			System.out.println("First vowel in given string " + "\" "+input+ "\""+ " is: " +ch);
		}
	}

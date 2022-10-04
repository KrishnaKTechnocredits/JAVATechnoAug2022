/*
 * Print count of each vowels in a given String using switch case.

input : technocredits
output : e -> 2
         o -> 1
		 i -> 1
 */

package harshalRane.Assignments.assignment28;

public class Assignment28Program3 {
	
	void getVovels(String input) {
		int count=0, countA=0, countE=0, countI=0, countO=0, countU=0;
		
		for(int index=0;index<input.length();index++) {
			char ch = input.charAt(index);
			
		switch(ch){
			case 'A' :
			case 'a' :
				countA++;
				break;
					
			case 'E' :
			case 'e' :
				countE++;
				break;
				
			case 'I' :
			case 'i' :
				countI++;
				break;
				
			case 'O' :
			case 'o' :
				countO++;
				break;
				
			case 'U' :
			case 'u' :
				countU++;
				break; 
			}
		}
		System.out.println("a --> " + countA);
		System.out.println("e --> " + countE);
		System.out.println("i --> " + countI);
		System.out.println("o --> " + countO);
		System.out.println("u --> " + countU);
	}
	
	
	public static void main(String[] args) {
		Assignment28Program3 assignment28 = new Assignment28Program3();
		String input = "technocredits";
		System.out.println("Count of vowel in given String "+ "\""+input+ "\""+ " is: ");
		assignment28.getVovels(input);
	}
}

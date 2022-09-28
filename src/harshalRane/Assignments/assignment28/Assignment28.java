/*
 * Program 1 : [10 mins - 13 mins]
Return count of vowels in a given String using switch case.

input : TechnOcredits
output : 4
 */

package harshalRane.Assignments.assignment28;

public class Assignment28 {
	int getVovels(String input) {
		int count=0;
		
		for(int index=0;index<input.length();index++) {
			char ch = input.charAt(index);
		
		switch(ch){
			case 'A' :
			case 'a' :
				count++;
				break;
				
			case 'E' :
			case 'e' :
				count++;
				break;
				
			case 'I' :
			case 'i' :
				count++;
				break;
				
			case 'O' :
			case 'o' :
				count++;
				break;
				
			case 'U' :
			case 'u' :
				count++;
				break;
		
			default:
				break;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		Assignment28 assignment28 = new Assignment28();
		String input = "TechnOcredits";
		int count = assignment28.getVovels(input);
		System.out.println("Number of vowels in given String are: "+ "\""+input+ "\""+ " is: " +count);
	}
}

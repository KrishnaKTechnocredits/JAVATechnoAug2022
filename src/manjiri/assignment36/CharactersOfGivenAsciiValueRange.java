/*Program 6 : 
Print all characters having ascii value 91 ot 96.

output : 91 -> [
         92 -> \
         93 -> ]		 
*/

package manjiri.assignment36;

import java.util.Scanner;

public class CharactersOfGivenAsciiValueRange {
	
	public static void main(String[] args) {
		
		System.out.println("Enter Start Range and End Range of Ascii Value: ");
		Scanner sc = new Scanner(System.in);
		int startRange = sc.nextInt();
		int endRange = sc.nextInt();
		sc.close();
		
		System.out.println("-----------------------------------------------------");
		System.out.println("Characters for the given ascii values are: ");
		CharacterOfGivenAsciiValue ch = new CharacterOfGivenAsciiValue();
		
		for (int index = startRange; index <= endRange; index++) {
			char ch1 = ch.asciiToCharacter(index);
			System.out.println(index +"--> "+ ch1);
		}
	}
}

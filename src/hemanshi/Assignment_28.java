/*Program 1 : [15 mins]
Return count of vowels in a given String using switch case.
input : TechnOcredits
output : 4*/

package hemanshi;
import java.util.Arrays;
public class Assignment_28 {
	
	int getVowels(String str) {
		String str2 = str.toLowerCase();
		int count = 0;
		for(int index=0; index<str.length(); index++) {
			char ch = str2.charAt(index);
			switch (ch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;
			}
			
		}return count;
		
		
		}
	
	
/* Program 2 : [10 mins]
	Return first vowel from given String.
	input : technocredits
	outout : e */
	
	char getFirstVowels(String name) {
		for (int index = 0; index < name.length(); index++) {
			char ch = name.charAt(index);
			switch (ch) {
			case 'a': {
				return ch;
			}
			case 'e': {
				return ch;
			}
			case 'i': {
				return ch;
			}
			case 'o': {
				return ch;
			}
			case 'u': {
				return ch;
			}
			}
		}
		return 0;
	}
	
	
/*Program 3: [15 mins]
	Print count of each vowels in a given String using switch case.
	input : technocredits
	output : e -> 2
	         o -> 1
			 i -> 1 */
	
	void getVowelsCount(String name) {
		int counta = 0; int counte = 0; int counti = 0; int counto = 0; int countu = 0;
		for (int index = 0; index < name.length(); index++) {
			char ch = name.charAt(index);
			switch (ch) {
			case 'a':
				counta++;
				break;
			case 'e':
				counte++;
				break;
			case 'i':
				counti++;
				break;
			case 'o':
				counto++;
				break;
			case 'u':
				countu++;
				break;
			}
		}
		if (counta > 0)
			System.out.println('a' + "=" + counta);
		if (counte > 0)
			System.out.println('e' + "=" + counte);
		if (counti > 0)
			System.out.println('i' + "=" + counti);
		if (counto > 0)
			System.out.println('o' + "=" + counto);
		if (countu > 0) {
			System.out.println('u' + "=" + countu);
		}
	}
	
	
/* Program 4: [15 mins]
	Print count of each vowels in a given String Array using switch case.
	input : {"technocredits", "swati", "aashvi"}
	output : vowel count in technocredits:
			 e -> 2
	         o -> 1
			 i -> 1
			 vowel count in swati:
			 a -> 1
	         i -> 1
			 vowel count in aashvi:
			 a -> 2
	         i -> 1 */
	
	void geteachVowels(String name) {
		System.out.println("Given string name in array : " + name);
		int counta = 0;	int counte = 0;	int counti = 0;	int counto = 0;	int countu = 0;
		for (int index = 0; index < name.length(); index++) {
			char ch = name.charAt(index);
			switch (ch) {
			case 'a':
				counta++;
				break;
			case 'e':
				counte++;
				break;
			case 'i':
				counti++;
				break;
			case 'o':
				counto++;
				break;
			case 'u':
				countu++;
				break;
			}
		}
		if (counta > 0)
			System.out.println('a' + "=" + counta);
		if (counte > 0)
			System.out.println('e' + "=" + counte);
		if (counti > 0)
			System.out.println('i' + "=" + counti);
		if (counto > 0)
			System.out.println('o' + "=" + counto);
		if (countu > 0) {
			System.out.println('u' + "=" + countu);
		}
	}
	
		
		public static void main(String[] args) {
				Assignment_28 assignment_28 = new Assignment_28();
				
				String input = "Hemanshi";
				System.out.println("The count of vowels in giving string is:");
				int count = assignment_28.getVowels(input);
				System.out.println("No. of Vowels in  " + input + "  " + count);
				System.out.println("---------------------------------------------");
				
				
				String input1 = "Hemanshi";
				System.out.println("The count of vowels in giving string is:");
				char ch = assignment_28.getFirstVowels(input1);
				System.out.println("First vowels of given string " + input + " is " + ch);
				System.out.println("---------------------------------------------");
				
				String input2 = "Hemanshi";
				System.out.println("The count of vowels in giving string is:");
				System.out.println("Given String is " + input);
				assignment_28.getVowelsCount(input2);
				System.out.println("---------------------------------------------");
				
				String[] input3={ "technocredits", "swati", "hemanshi" };
				System.out.println("Given array String  : "  + Arrays.toString(input3));
				for (String  name : input3) {
				assignment_28.geteachVowels(name);
					
				}
		}
}
	



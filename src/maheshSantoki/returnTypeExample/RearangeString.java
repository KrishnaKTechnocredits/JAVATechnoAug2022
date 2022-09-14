
package maheshSantoki.returnTypeExample;

import smitaVetal.BankSystem;

public class RearangeString {
	/* Write a program to rearrange String in given format. */
	String rearangeString(String input) {
		String digit = "";
		String str = "";

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isDigit(ch)) {
				digit = digit + Character.getNumericValue(ch);
			} else {
				str = str + ch;
			}
		}
		return digit + str;
	}
	/*
	 * Write a program to rearrange String in given format. Hint : 
	 * Uppercase letters + digits + LowerCase letter 
	 * input = "t8EcHNo5Cred3iTs"; 
	 * output :
	 * EHNCT853tcoredis
	 */// Character.isUpperCase(ch), Character.isLowerCase(ch)
	String rearangeFormat(String input) {
		String uppercase="";
		String digit="";
		String lowercase="";
		for (int i = 0; i < input.length(); i++) {
			char ch=input.charAt(i);
			if(Character.isUpperCase(ch)) {
				uppercase=uppercase+ch;
			}
			else if(Character.isDigit(ch)) {
				digit=digit+ch;
			}
			else if(Character.isLowerCase(ch)) {
				lowercase=lowercase+ch;
			}
		}
		return uppercase+digit+lowercase;
	}

	/*
	 * Find frequency of given character from given String. String str =
	 * "TechnoTtcredits"; 
	 * char targetChar = 't'; 
	 * output : 4
	 */
	int characterFreq(String input,Character ch) {
		int count=0;
		input=input.toLowerCase();
		for (int i = 0; i < input.length(); i++) {
			char ch1=input.charAt(i);
			if(ch1== ch) {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		RearangeString rearange = new RearangeString();
		String str1 = "tec2cH4no";
		String str2="t8EcHNo5Cred3iTs";
		
		System.out.println(" #Original :" + str1 + " --> #Rearanged : " + rearange.rearangeString(str1));
		System.out.println(" #Original :" + str2 + " --> #Rearanged : " + rearange.rearangeFormat(str2));
		System.out.println(" #Frequncy is "+rearange.characterFreq("TechnoTtcredits",'t'));
	}
}

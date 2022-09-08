/*Assignment 18 - 8th Sep 2022
Write a program to rearrange String in given format. 
Hint : Uppercase letters + digits + LowerCase letter
input = "t8EcHNo5Cred3iTs";
output : EHNCT853tcoredis 
Character.isUpperCase(ch), Character.isLowerCase(ch) */

package komalShrivastava;

public class RearrangeString2 {
	
	String rearrangeString2(String inputString) {
		String upper = "";
		String digit = "";
		String lower = "";
		for(int index = 0; index < inputString.length(); index++ ) {
			char ch = inputString.charAt(index);
			if(Character.isUpperCase(ch)) 
				upper = upper + ch;
			else if(Character.isDigit(ch))
				digit = digit + ch;
			else if(Character.isLowerCase(ch))
				lower = lower + ch;
		}
		return upper + digit + lower;
	}

	public static void main(String[] args) {
		RearrangeString2 rearrangeString2 = new RearrangeString2();
		String input = "t8EcHNo5Cred3iTs";
		String output = rearrangeString2.rearrangeString2(input);
		System.out.println("Re-arranged sequence for " + input + " is : " + output);
	}
}
//2) Write a program to rearrange String in given format. 
//Hint : Uppercase letters + digits + LowerCase letter
//input = "t8EcHNo5Cred3iTs";
//output : EHNCT853tcoredis 
// Character.isUpperCase(ch), Character.isLowerCase(ch)

package sohail.stringprograms;

public class RearrangeStringCase {
	String uppar="";
	int digit;
	String alpha;
	String getRearrangedStringCase(String str) {
		
		for(int index=0;index<str.length();index++) {
			char char1=str.charAt(index);
			if(Character.isUpperCase(char1)) {
				uppar=uppar+char1;
			}
			else if(Character.isDigit(char1)) {
				digit=digit+char1;
				
			}
			else if(Character.isAlphabetic(char1)) {
				alpha=alpha+char1;
			}
			
		}
		System.out.println(""+uppar+""+digit+""+alpha);
		
		return null;
	}
	

	public static void main(String[] args) {
		RearrangeStringCase rearrangestring=new RearrangeStringCase();
		rearrangestring.getRearrangedStringCase("t8EcHNo5Cred3iTs");
		

	}

}

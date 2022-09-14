//2) Write a program to rearrange String in given format. 
//Hint : Uppercase letters + digits + LowerCase letter
//input = "t8EcHNo5Cred3iTs";
//output : EHNCT853tcoredis 
// Character.isUpperCase(ch), Character.isLowerCase(ch)

package harshadaJagtap.StringExamples;

public class Example9 {
	
	String getDigitLetter(String input) {
		String digitStr="";
		String lowerletterStr="";
		String upperletterStr="";
		String str="";
		
		int lenght=input.length();
		
		for(int index=0;index<lenght;index++) {
			char ch=input.charAt(index);
			if(Character.isDigit(ch)) {
				digitStr+=ch;}
			else if(Character.isLetter(ch)&& Character.isLowerCase(ch))	
				lowerletterStr+=ch;
			else if(Character.isLetter(ch)&& Character.isUpperCase(ch))	
				upperletterStr+=ch;
			
			str= upperletterStr + digitStr + lowerletterStr; 
		}
		return str;
	}
	
	public static void main(String[] args) {
		Example9 example9=new Example9();
		example9.getDigitLetter("t8EcHNo5Cred3iTs");
		System.out.println(example9.getDigitLetter("t8EcHNo5Cred3iTs"));
	}

}

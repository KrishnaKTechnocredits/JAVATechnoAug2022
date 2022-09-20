//1) Write a program to rearrange String in given format. 
//String str = "te2cH4no";
//output : "24tecHno";
//Hint : AllDigitAllCharacter

package harshadaJagtap.StringExamples;

public class Example8 {
	
	String getDigitLetter(String input) {
		String digitStr="";
		String letterStr="";
		String str="";
		
		int lenght=input.length();
		
		for(int index=0;index<lenght;index++) {
			char ch=input.charAt(index);
			if(Character.isDigit(ch)) {
				digitStr+=ch;}
			else if(Character.isLetter(ch))	
				letterStr+=ch;
			
			str=digitStr+letterStr;
		}
		return str;
	}
	
	public static void main(String[] args) {
		Example8 example8=new Example8();
		String output=example8.getDigitLetter("te2cH4no");
		System.out.println(output);
	}
}

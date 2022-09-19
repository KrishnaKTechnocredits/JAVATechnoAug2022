//1) Write a program to rearrange String in given format. 
//String str = "te2cH4no";
//output : "24tecHno";
//Hint : AllDigitAllCharacter


package hemanshi;
import java.lang.String;
public class String2 {

	String getDigit(String input) {
		String dStr="";
		String lStr="";
		String str="";

		int lenght=input.length();

		for(int index=0;index<lenght;index++) {
			char ch=input.charAt(index);
			if(Character.isDigit(ch)) {
				dStr+=ch;
				}
			else if(Character.isLetter(ch))	
				lStr+=ch;

			str=dStr+lStr;
		}
		return str;
	}

	public static void main(String[] args) {
		String2 s2=new String2();
		String output=s2.getDigit("te2cH4no");
		System.out.println(output);
	}
	
	

}

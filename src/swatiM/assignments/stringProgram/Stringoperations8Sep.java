package swatiM.assignments.stringProgram;

//1) Write a program to rearrange String in given format. 
//String str = "te2cH4no";
//output : "24tecHno";
//Hint : AllDigitAllCharacter

//2) Write a program to rearrange String in given format. 
//Hint : Uppercase letters + digits + LowerCase letter
//input = "t8EcHNo5Cred3iTs";
//output : EHNCT853tcoredis 
//Character.isUpperCase(ch), Character.isLowerCase(ch)

//3) Find frequency of given character from given String. 
//String str = "TechnoTtcredits";
//char targetChar = 't';
//output : 4

public class Stringoperations8Sep {
    
	String getAllDigitAllCharacter(String input){
		String digitStr = "";
		String letterStr = "";
		for(int index = 0;index < input.length();index++){
			char ch = input.charAt(index);
			if(Character.isDigit(ch)){
				digitStr += ch;
			}
			else if(Character.isLetter(ch)){
			    letterStr += ch;
		    }
		}
		return digitStr+letterStr ;
	}
	String getRearrangeUpperDigitLowerCharacter(String input){
			String digitStr = "";
			String upperStr = "";
			String lowerStr = "";
			for(int index = 0;index<input.length();index++){
				char ch = input.charAt(index);
				if(Character.isDigit(ch)){
					digitStr += ch;
				}
				else if(Character.isUpperCase(ch)){
				    upperStr += ch;	
				}	
				else if(Character.isLowerCase(ch)){
					lowerStr += ch;
				}
			}
			return upperStr+digitStr+lowerStr;
				
	}
	int getFrequencyOfCharacter(String input , char targetStr){
			int index = 0;
			int count = 0;
			while(index != input.length()){
				input = input.toLowerCase();
				targetStr = Character.toLowerCase(targetStr);
				char ch = input.charAt(index);
				if(ch == targetStr){
					count++;
				}
				index ++;
			}
			return count;
	}
	public static void main(String[] args) 
	{
		System.out.println("Input String: te2cH4no");
		System.out.println("Output String: "+new Stringoperations8Sep().getAllDigitAllCharacter("te2cH4no"));
		System.out.println("Input String: t8EcHNo5Cred3iTs");
		System.out.println("Output String: "+new Stringoperations8Sep().getRearrangeUpperDigitLowerCharacter("t8EcHNo5Cred3iTs"));
		System.out.println("Input String: TechnoTtcredits");
		char targetStr = 't';
		System.out.println("Output String: "+new Stringoperations8Sep().getFrequencyOfCharacter("TechnoTtcredits",targetStr));
	}
}

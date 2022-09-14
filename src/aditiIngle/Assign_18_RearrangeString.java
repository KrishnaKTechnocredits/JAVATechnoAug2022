package aditiIngle;

public class Assign_18_RearrangeString {

	String rearrangeString(String str) {
		String result1="";
		String str1="";
		String str2="";
		for(int index=0; index<str.length();index++) {
			char ch = str.charAt(index);
			if(Character.isDigit(ch)) {
				str1=str1+ch;				
			}
			else if(Character.isLetter(ch)) {
				str2=str2+ch;
			}
		}
		result1= str1+str2;
		return result1;
	}
	String rearrangeLowerUpper(String str) {
		String result2="";
		String str1="";
		String str2="";
		String str3="";
		for(int index=0; index<str.length();index++) {
			char ch = str.charAt(index);
			if(Character.isUpperCase(ch)) {
				str1=str1+ch;				
			}
			else if(Character.isDigit(ch)) {
				str2=str2+ch;
			}
			else if(Character.isLowerCase(ch)) {
				str3=str3+ch;
			}
		}
		result2= str1+str2+str3;
		return result2;
	}
	
	int targetCharCount(String str, char targetChar) {
		int count=0;
		String s = str.toLowerCase();
		char target = Character.toLowerCase(targetChar);
		
		for(int index=0; index<s.length();index++) {
			char ch = s.charAt(index);
			if(ch == target) {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		String str = "te2cH4no";
		String str1 = "t8EcHNo5Cred3iTs";
		String str2 = "TechnoTtcredits";
		char targetChar ='t';
		
		Assign_18_RearrangeString assign_18_RearrangeString = new Assign_18_RearrangeString();
		
		String result1= assign_18_RearrangeString.rearrangeString(str);
		System.out.println("Reaarangement of "+str+" as Digits + Letters is "+ result1);
	
		String result2 = assign_18_RearrangeString.rearrangeLowerUpper(str1);
		System.out.println("Reaarangement of "+str1+" as Uppercase + digits + Lowercase is "+result2);
		
		int count = assign_18_RearrangeString.targetCharCount(str2,targetChar);
		System.out.println("Count of "+targetChar +" in "+str2+" is "+count);
	}
	
}

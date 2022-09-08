package swapnilMaheshwari;

public class StringRearrange {
	
	String allDigitAllCharacter (String str) {
		String str1="", str2="" , str3="";
		for ( int index=0; index<=str.length()-1; index++) {
				char ch=str.charAt(index);
				if (Character.isDigit(ch))
						str1=str1+Character.getNumericValue(ch);
				else if(Character.isLetter(ch))
						str2=str2+ch;
					
		}
			return str3=str1+str2;
	}
	
	String allUpperAllDigitAllLower (String str) {
		String str1="", str2="" , str3="", str4="";
		for ( int index=0; index<=str.length()-1; index++) {
				char ch=str.charAt(index);
				if (Character.isUpperCase(ch))
					str1=str1+ch;
				else if (Character.isDigit(ch))
					str2=str2+Character.getNumericValue(ch);
				else if (Character.isLowerCase(ch))
					str3=str3+ch;	
		}
		return str4=str1+str2+str3;
	}
	
	int frequencyOfCharacter (String str , char targetChr) {
			int count=0;
				for ( int index=0; index<=str.length()-1; index++) {
					str=str.toLowerCase();
					char ch=str.charAt(index);
					if(ch==targetChr)
						count++;
				
		}
				return count;	
	}
	public static void main(String[] args) {
		StringRearrange stringRearrange = new StringRearrange();
		String s1="TechnoTtcredits";
		char c1='t';
		System.out.println("All digit first and then all characters :" +stringRearrange.allDigitAllCharacter("te2cH4no"));
		System.out.println("All upper case letters first then all digits and at the last all small letters :" +stringRearrange.allUpperAllDigitAllLower("t8EcHNo5Cred3iTs"));
		System.out.println("Frequency of character of :" +c1+ " in given string :" +s1+ " are :"+stringRearrange.frequencyOfCharacter (s1 , c1));
	}
}











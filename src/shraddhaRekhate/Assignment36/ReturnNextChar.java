package shraddhaRekhate.Assignment36;
//Program 7 : 
//WAP to return String by encrypting all characters from given string by its next character.
//
//input : aPd%3zZ
//output : bQe%3aA
//
//if(ch =='Z'){
//	output = output + 'A';
//}else if(ch =='z'){
//	output = output + 'a';
//}else{
//	if((ch>=65 && ch<=90) || (ch>=97 && ch<=122)){
//		ch++;
//	}
//	output = output + ch;
//}

public class ReturnNextChar {
	String returnNextChar(String str) {
		String nextString="";
		for(int index=0;index<str.length();index++) {
			char ch=str.charAt(index);
			if(str.charAt(index) =='Z'){
				nextString = nextString + 'A';
             }else if(str.charAt(index) =='z'){
            	 nextString = nextString + 'a';
			}else{
				if((ch>=97 && ch<=122)||(ch>=60 && ch<=90)){
					ch++;
				}
				nextString = nextString + ch;
			}
		}
		return nextString;
	}
	public static void main(String[] args) {
		ReturnNextChar returnNextChar=new ReturnNextChar();
		System.out.println(returnNextChar.returnNextChar("aPd%3zZ"));
	}

}

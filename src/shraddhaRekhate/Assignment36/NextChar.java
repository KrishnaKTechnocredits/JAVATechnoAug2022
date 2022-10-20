package shraddhaRekhate.Assignment36;
//Program 1 : 
//WAP to return String by encrypting all characters from given string by its next character.
//
//input : apdz
//output : bqea
//ascii of a-z=97 to 122

public class NextChar {
	
	void replaceAllCharOfStringByItsNextChar(String str,char ch) {
		for(int index=0;index<str.length();index++) {
			ch=str.charAt(index);
			ch=(char)(ch+1);
			System.out.print(ch);
			if(ch=='z') {
				System.out.println('a');
			}
		}
	}

	public static void main(String[] args) {
		NextChar nextChar= new NextChar();
		nextChar.replaceAllCharOfStringByItsNextChar("apdz",'a');

	}

}

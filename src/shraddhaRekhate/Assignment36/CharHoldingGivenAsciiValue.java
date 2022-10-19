package shraddhaRekhate.Assignment36;
//Program 5 : 
//Return character holding given Ascii value.
//
//input : 69
//output : E

public class CharHoldingGivenAsciiValue {
	void asciiOfGivenChar(int ascii) {
		char ch=(char)ascii;
		System.out.println("input:"+ascii);
		System.out.println("output:"+ch);
		}
	public static void main(String[] args) {
		CharHoldingGivenAsciiValue asciObj=new CharHoldingGivenAsciiValue();
				asciObj.asciiOfGivenChar(69);
	}

}

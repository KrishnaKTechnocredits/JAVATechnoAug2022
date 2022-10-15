package technocredits.inteview;

import mohiniA.ArrayOprationAssignments.ArrayPlacingZero;

public class AsciiExample {

	void printAscii(char ch){
		int ascii = ch; // 97
		System.out.println(ch + "--" + ascii);
	}
	
	void printCharOfGivenAscii(int ascii) {
		char ch = (char)ascii;
		System.out.println(ascii + "-->" + ch);
	}
	
	public static void main(String[] args) {
		AsciiExample asciiExample = new AsciiExample();
		//asciiExample.printCharOfGivenAscii(799);
		asciiExample.printAscii('?');
		/*
		 * for(int ascii=91;ascii<=96;ascii++) {
		 * asciiExample.printCharOfGivenAscii(ascii); }
		 */
		
		/*
		 * char ch = 'a'; System.out.println(ch+1); // 98 ch = (char)(ch+1);
		 */
		//asciiExample.printAscii('_');
		/*
		 * for(char ch='a';ch<='z';ch++) { asciiExample.printAscii(ch); }
		 */
	}
}

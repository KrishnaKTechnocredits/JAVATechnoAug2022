package titikshaG;

public class AsciiPrpgram {
//Assignment - 36 : 9th Oct'2022
//Program 1 : 
//WAP to return String by encrypting all characters from given string by its next character.
//input : apdz
//output : bqea

	String getAsciiNextCharacter(String character) {
		String output="";
		for(int index=0;index<character.length();index++) {
			char ascii=character.charAt(index);
			if(ascii == 'z') {
				output=output+'a';}
			else if (ascii == 'Z') {
				output=output+'A';}
			else {
				output=output+(char)(ascii+1);}
			}
		return output;
	}
	
//Program 2 : 
//WAP to return ascii of given character.
//input : C
//output : 67
	
	void getAsciiOfGivenChararcter(char ch) {
		int ascii=ch;
		System.out.println("The ascii of"+" "+ ch +" "+ "is" +" "+ascii);
	}
	
//Program 3 : 
//WAP to print ascii value of A->Z.
//output : A -> 65
			// B -> 66
			//Z -> 90
	void getAsciiOfAllAlphabets() {
		for(int index='A';index<='Z';index++) {
			int ascii=index;
			System.out.println("The ascii of"+" "+ (char)index +" "+ "is" +" "+ascii);
	}
}
	
//Program 4 :
//Return count of digits from given String without using isDigit method of Character class..
//input : te1chno2cre4di6ts 
//output : 4
	int getCountOfNumbericDigits(String str) {
		int count=0;
		for(int index=0;index<str.length();index++) {
			char ch=str.charAt(index);
			if(ch>=48 && ch<=57) {
				count++;}
		}
		return count;
	}
	
//Program 5 : 
//Return character holding given Ascii value.
//input : 69
//output : E
	void getAsciiOfAllOneNumber(int num) {
		char ascii=(char)num;
		System.out.println("The ascii of"+" "+ num +" "+ "is :" +" "+ascii);
	}
	


	
//Program 6 : 
//Print all characters having ascii value 91 ot 96.
//output : 91 -> [
		   //92 -> \
		    //93 -> ]

	void getAsciiOfAllNumbers() {
		for(int index=91;index<=100;index++) {
			int ascii=index;
			System.out.println("The ascii of"+" "+ ascii +" "+ "is :" +" "+(char)index);
	}
}
	
//Program 7 : 
//WAP to return String by encrypting all characters from given string by its next character.
//input : aPd%3zZ
//output : bQ%e3aA

	String getAsciiNextCharacterOfGivenString(String character) {
		String output="";
		for(int index=0;index<character.length();index++) {
			char ascii=character.charAt(index);
			if(ascii == 'z') {
				output=output+'a';}
			else if (ascii == 'Z') {
				output=output+'A';}
			else {
				if((ascii>=65 && ascii<=90) || (ascii>=97 && ascii<=122) || (ascii>=33 && ascii<=64)){
				output=output+(char)(ascii+1);}
			}
		}
		return output;
	}
	public static void main(String[] args) {
		AsciiPrpgram asciiPrpgram =new AsciiPrpgram();
		System.out.println("------------Program 1-----------------") ;
		System.out.println("Input is"+" "+"apdz");
		String input=asciiPrpgram.getAsciiNextCharacter("apdz");
		System.out.println("the output of program 1 is:"+" "+input);
		
		System.out.println();
		System.out.println("------------Program 2-----------------") ;
		asciiPrpgram.getAsciiOfGivenChararcter('C');
		
		System.out.println();
		System.out.println("------------Program 3-----------------") ;
		asciiPrpgram.getAsciiOfAllAlphabets();
		
		System.out.println();
		System.out.println("------------Program 4-----------------") ;
		System.out.println("Input is"+" "+"te1chno2cre4di6ts");
		int input2=asciiPrpgram.getCountOfNumbericDigits("te1chno2cre4di6ts");
		System.out.println("Output is"+" "+input2);
		
		System.out.println();
		System.out.println("------------Program 5-----------------") ;
		asciiPrpgram.getAsciiOfAllOneNumber(69);
		
		System.out.println();
		System.out.println("------------Program 6-----------------") ;
		asciiPrpgram.getAsciiOfAllNumbers();
		
		System.out.println();
		System.out.println("------------Program 7-----------------") ;
		System.out.println("Input is"+" "+"aPd%3zZ");
		String input3=asciiPrpgram.getAsciiNextCharacterOfGivenString("aPd%3zZ");
		System.out.println("Output is"+" "+input3);
		
		
		
		
	}

	
}
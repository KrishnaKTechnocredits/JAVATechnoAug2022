/*Assignment - 36 : 9th Oct'2022

Program 1 : 
WAP to return String by encrypting all characters from given string by its next character.

input : apdz
output : bqea

Program 2 : 
WAP to return ascii of given character.

input : C
output : 67

Program 3 : 
WAP to print ascii value of A->Z.

output : A -> 65
         B -> 66
		 .
		 .
		 Z -> 90
		 
Program 4 :
Return count of digits from given String without using isDigit method of Character class..

input : te1chno2cre4di6ts 
output : 4

Program 5 : 
Return character holding given Ascii value.

input : 69
output : E

Program 6 : 
Print all characters having ascii value 91 ot 96.

output : 91 -> [
         92 -> \
         93 -> ]		 

Program 7 : 
WAP to return String by encrypting all characters from given string by its next character.

input : aPd%3zZ
output : bQe%3aA

if(ch =='Z'){
	output = output + 'A';
}else if(ch =='z'){
	output = output + 'a';
}else{
	if((ch>=65 && ch<=90) || (ch>=97 && ch<=122)){
		ch++;
	}
	output = output + ch;
}*/
package shrutiArora;
public class Assignment36 {
	String getEncryptedString(String input){
		System.out.println("input: " + input);
         String outputString = "";
		  for (int index = 0; index < input.length(); index++) {
			 char ch = input.charAt(index);
			  if(ch == 'z') {
				 ch = 'a';
			  }else { 
				 ch++;
			   }
			outputString += ch;
		}	
		return outputString;	
	}
	int charToAscii(char ch) {
		int asciiValue = ch;
		return asciiValue;
	}
	void printASciiOfCapitalLetter() {
		System.out.println("Ascii value of Characters");
	     for(char ch = 'A' ; ch<='Z' ; ch++) {
			 int ascii = ch;
			 System.out.println(ch + "-> " + ascii);
		 }
	 }
	 int getCountOfDigits(String str){
		int count = 0;
		
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			
			if(ch >= 48 && ch <= 57) {
				count++;
			}
		}	
		return count;
	}
	 char asciiToCharacter(int asciiValue) {
			char ch = (char)asciiValue; 
			return ch;
	 }
		
	 void printAsciiToCharInRange() {
		 System.out.println("All character having range 91 to 96: ");
	      for(int ascii = 91 ; ascii<=96 ; ascii++) {
			 char ch = asciiToCharacter(ascii);
			 System.out.println(ascii + "-> " + ch);
		 }
	 }
	 String getEncryptedstr(String str) {
		 System.out.println("input: " + str);
	     String output = "";
	     for(int index = 0 ; index<str.length(); index++) {
			 char ch = str.charAt(index);
			 if(ch =='Z'){
					output = output + 'A';
			 }else if(ch =='z'){
					output = output + 'a';
			  }else{
					if((ch>=65 && ch<=90) || (ch>=97 && ch<=122)){
						ch++;
					}
					output = output + ch;
			  }
		 }
			 return output;
	 }
	    public static void main(String[] args) {
		     Assignment36 a36 = new Assignment36();
		     System.out.println("*************************************************************program-1*************************************************");
		     String str = "apdz";
		     String output = a36.getEncryptedString(str);
		     System.out.println("output: " + output);
		     System.out.println("*************************************************************program-2*************************************************");
		     a36.printASciiOfCapitalLetter();
		     System.out.println("*************************************************************program-3*************************************************");
	         char ch = 'C';
	         System.out.println(ch);
		     int ascii = a36.charToAscii(ch);
		     System.out.println("Output: " + ascii);
		     System.out.println("*************************************************************program-4*************************************************");
		     String input = "te1chno2cre4di6ts";
	    	 System.out.println("input: " + input);
		     int count = a36.getCountOfDigits(input);
		     System.out.println("Output: " + count);
		     System.out.println("*************************************************************program-5*************************************************");
		     int Ascii = 69;
		     System.out.println("input: " + Ascii);
		     char c = a36.asciiToCharacter(Ascii);
		     System.out.println("output: " + c);
		     System.out.println("*************************************************************program-6*************************************************");
	     	 a36.printAsciiToCharInRange();
		     System.out.println("*************************************************************program-7*************************************************");
		     String input1 = "aPd%3zZ";
		     String output1   =  a36.getEncryptedstr(input1);
		     System.out.println("output: " + output1);
	    }
}
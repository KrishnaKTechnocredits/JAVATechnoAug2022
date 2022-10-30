/*
 * ssignment - 36 : 9th Oct'2022

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
}
 */

package akankshaVyas.ASCII;

public class Assignemnet36ASCII {
int getAsciiOfChar(char ch) {
		
		int ascii=ch;
		return ascii;
		}
	
	void printAsciiValueAZ(){
		System.out.println(" Outcome of Program 3-print ascii value of A->Z : ");
		char ch;
		for( ch='A';ch<='Z'; ch++) {
			System.out.println(ch +" ->" + getAsciiOfChar(ch));
			}
					}

					int getCountOfDigit(String str) {
						int count = 0;
						for (int index = 0; index < str.length(); index++) {
							char ch = str.charAt(index);
							if (ch >= 48 && ch <= 57) {
								count++;
							}

						}
						return count;

					}
					
			char getCharAscciValue(int asciiValue) {
				char ch = (char)asciiValue;
				return ch;
			}
			
			void printAscii() {
				for(int asciiValue =91; asciiValue<=96; asciiValue++) {
					char ch= (char)asciiValue;
					System.out.println(asciiValue + "->" + ch);
				}
			}
			
			String getEncryptedStrin1(String str) {
				
				String str2="";
				for(int index=0;index<str.length();index++) {
					char ch=str.charAt(index);
								if(ch == 'z') {
						str2=str2 + 'a';
						}
					else  {
						ch++;
						str2=str2+ch;
					}
				}
				return str2;
			}
			
			String getEncryptedString2(String str) {
				String str2 = "";
				for (int index = 0; index < str.length(); index++) {
					char ch = str.charAt(index);
					if (ch == 'z') {
						str2 = str2 + 'a';
					} else if (ch == 'Z') {
						str2 = str2 + 'A';
					} else {
						if ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)) {
							ch++;
						}
					str2 = str2 + ch;
					}
					
					}return str2;
			}
	public static void main(String[] args) {
		Assignemnet36ASCII ascii= new Assignemnet36ASCII();
		System.out.println("Outcome of Program2 is Ascii of given character ");
		System.out.println(ascii.getAsciiOfChar('o'));
		System.out.println("==============================================");
		ascii.printAsciiValueAZ();
		System.out.println("==============================================");
		System.out.println("total count of digit in String -"  +ascii.getCountOfDigit(" te1chno2cre4di6ts"));
		System.out.println("==============================================");
		System.out.println("Character for given ASCII value is - "+ascii.getCharAscciValue(69));
		System.out.println("==============================================");
		ascii.printAscii();
		System.out.println("==============================================");
		String str="apdz";
		System.out.println("Given string is "+ str);
		System.out.println("Output encrypted string is "+ascii.getEncryptedStrin1(str));
		System.out.println("==============================================");
		System.out.println("Output encrypted string is "+ascii.getEncryptedString2("aPd%3zZ"));
		
		
	}
}


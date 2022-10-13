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
output : bQ%e3aA

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


package shivaniLikhia;

public class Assignment36 {

	
	String getEncryptedString(String str) {
		System.out.println("The given String is : "+str);
		String output = "";
		for(int index=0;index<str.length();index++) {
			char ch = str.charAt(index);
			if(ch == 'z') {
				output = output + 'a';
			}
			else if(ch == 'Z') {
				output = output + 'A';
			}
			else {
			if((ch>=65 && ch<=90) || (ch>=97 && ch<=122)) {
				ch++;
			}
			output = output + ch;
			}
		}
		return output;
	}
	
	int getAsciiValueOfCharacter(char ch) {
		System.out.println("The Ascii value of the given character "+ch+" is :");
		int ascii = ch;
		return ascii;
	}
	
	void printAsciiValueOfAllCharacters(char ch1, char ch2) {
		for(char ch = ch1;ch <=ch2;ch++) {
			System.out.println((int) ch + " is the Ascii value of " + ch);
		}
		
	}
	
	int getCountOfDigitFromString(String str) {
		int count = 0;
		for(int index=0;index<str.length();index++) {
			boolean flag = true;
			char ch = str.charAt(index);
			int ascii = ch;
			if(ascii>=97 && ascii<=120) {
				flag = false;	
			}
			else if (flag) {
				count++;
			}
		}
		return count;
	}
	
	char getCharacterFromAsciiValue(int ascii) {
		char ch = (char) ascii;
		return ch;
	}
	
	void printAsciiValueBetweenGivenRange(int startRange,int endRange) {
		for(int index=startRange;index<=endRange;index++) {
			System.out.println("Character for given Ascii Value "+index+" is : " + (char)index);
		}
	}
	
	public static void main(String[] args) {
		Assignment36 assignment36 = new Assignment36();
		System.out.println("------------------------------Program 1-----------------------------------------");
		System.out.println("The Encrypted Strig for the given String is : "+assignment36.getEncryptedString("apdz"));
		System.out.println("------------------------------Program 2-----------------------------------------");
		System.out.println(assignment36.getAsciiValueOfCharacter('C'));
		System.out.println("------------------------------Program 3-----------------------------------------");
		assignment36.printAsciiValueOfAllCharacters('A','Z');
		System.out.println("------------------------------Program 4-----------------------------------------");
		System.out.println("The count of digits in given string is : "+assignment36.getCountOfDigitFromString("te1chno2cre4di6ts"));
		System.out.println("------------------------------Program 5-----------------------------------------");
		System.out.println("The character for the given ascii value is : "+assignment36.getCharacterFromAsciiValue('C'));
		System.out.println("------------------------------Program 5-----------------------------------------");
		assignment36.printAsciiValueBetweenGivenRange(91,96);
		System.out.println("------------------------------Program 7-----------------------------------------");
		System.out.println("The Encrypted Strig for the given String is : "+assignment36.getEncryptedString("aPd%3zZ"));
	}
	
}

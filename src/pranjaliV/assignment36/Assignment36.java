/*
 Assignment - 36 : 9th Oct'2022 

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
output : 
A -> 65 
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
Print all characters having ascii value 91 to 96. 
output : 
91 -> [ 
92 -> \ 
93 -> ] 

Program 7 : 
WAP to return String by encrypting all characters from given string by its next character. 
input : aPd%3zZ 
output : bQe%3aA 

if(ch =='Z'){ 
	output = output + 'A'; 
	}
else if(ch =='z'){ 
	output = output + 'a'; 
	}
else{ 
	if((ch>=65 && ch<=90) || (ch>=97 && ch<=122)){ 
		ch++; 
	} 

output = output + ch; }
  
 */

package pranjaliV.assignment36;

public class Assignment36 {
	
	String printNextChar(String input) {//program1
		String output = "";
		System.out.println("Input : "+input);
		for(int index=0; index<input.length(); index++) {
			char ch = input.charAt(index);
			if(ch == 'z') {
				output = output + 'a';
			}
			else if(ch == 'Z') {
				output = output + 'A';
			}
			else {
				if((ch>=65 && ch<=90) || (ch>=97 && ch<=122)){ //when alphabet other than z/Z
					output = output + (char)(ch+1); // type cast ch+1 to char and add to output 
				}
			}
		}
		return output;
		//
	}
	
	int printAsciiValue(char ch) {//program2
		int output = ch; // storing ch in int -> stores ascii value
		System.out.println("Input : "+ch);
		return output;
	}
	
	void printAsciiA_Z() {//program3
		for(int index = 'A' ;index<='Z'; index++ ) {
			System.out.println((char)index + " -> " + index);
		}
	}
	
	int getCountDigit(String input) {//program4
		int count=0;
		System.out.println("Input : "+input);
		for(int index=0; index<input.length(); index++) {
			char ch = input.charAt(index);
			if(ch>=48 && ch<=57) {//when ascii value of ch is of 0 - 9
				count++;
			}
		}
		return count;
	}
	
	char getAsciiChar(int num) {//program5
		return  (char) num;
	}
	
	void printAsciiChar(int start, int end) {//program6
		for(int index=start; index<=end; index++) {
			System.out.println(index + " -> " +  getAsciiChar(index));
		}
	}
	
	String getNextCharAll(String input) {//program7
		String output = "";
		System.out.println("Input : "+input);
		for(int index=0; index<input.length(); index++) {
			char ch = input.charAt(index);
			if(ch == 'Z') {
				output = output + 'A';
			}
			else if(ch == 'z') {
				output = output + 'a';
			}
			else if((ch>=65 && ch<=90) || (ch>=97 && ch<=122)) {//alphabets
				output = output + (char)(ch+1);
			}
			else {//all other chars and num
				output = output + (char)ch;
			}	
		}
		return output;
	}
	
	public static void main(String[] args) {
		Assignment36 ex36 = new Assignment36();
		
		System.out.println("---------------");
		System.out.println("Program 1 : WAP to return String by encrypting all characters from given string by its next character. ");
		String input1 = "apdz"; 
		System.out.println("Output : " + ex36.printNextChar(input1));
		System.out.println("");
		
		System.out.println("---------------");
		System.out.println("Program 2 : WAP to return ascii of given character.");
		char input2 = 'C';
		System.out.println("Output : "+ex36.printAsciiValue(input2));
		System.out.println("");
		
		System.out.println("---------------");
		System.out.println("Program 3 : WAP to print ascii value of A->Z. ");
		ex36.printAsciiA_Z();
		System.out.println("");
		
		System.out.println("---------------");
		System.out.println("Program 4 : Return count of digits from given String without using isDigit method of Character class.");
		String input4 = "te1chno2cre4di6ts";
		System.out.println("Output : "+ ex36.getCountDigit(input4));
		System.out.println("");
		
		System.out.println("---------------");
		System.out.println("Program 5 : Return character holding given Ascii value. ");
		int input5 = 69; 
		System.out.println("Input : " + input5);
		System.out.println("Output : " + ex36.getAsciiChar(input5));
		System.out.println("");
		
		System.out.println("---------------");
		System.out.println("Program 6 : Print all characters having ascii value 91 to 96. ");
		ex36.printAsciiChar(91,96);
		System.out.println("");
		
	
		System.out.println("---------------");
		System.out.println("Program 7 : WAP to return String by encrypting all characters from given string by its next character.");
		String input7 = "aPd%3zZ"; 
		System.out.println("Output : "+ ex36.getNextCharAll(input7));
		System.out.println("");
		

	}

}

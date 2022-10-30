

/****
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
***/


package mohiniA.AsciiVal.Assignment36;

public class NextChar {

	
	String getNextChar(String input) {
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
				if((ch>=65 && ch<=90) || (ch>=97 && ch<=122)){ //for wilecard charaters
					output = output + (char)(ch+1); // type cast ch+1 to char and add to output 
				}
			}
		}
		return output;
		//
	}
	
	int getAsciiValue(char ch) {
		int output = ch; //  int -> stores ascii value in int
		System.out.println("Input : "+ch);
		return output;
	}
	
	void getAsciiA_Z() {
		for(int index = 'A' ;index<='Z'; index++ ) {
			System.out.println((char)index + " -> " + index);
		}
	}
	
	
	public static void main(String[] args) {
		NextChar obj36 = new NextChar();
		
		
		System.out.println("Return String by encrypting all characters from given string by its next character. ");
		String input1 = "apdz"; 
		System.out.println("Output : " + obj36.getNextChar(input1));
		System.out.println("");
		
		System.out.println("---------------");
		System.out.println("Return ascii of given character.");
		char input2 = 'C';
		System.out.println("Output : "+obj36.getAsciiValue(input2));
		System.out.println("");
		
		System.out.println("---------------");
		System.out.println("Print ascii value of A->Z. ");
		obj36.getAsciiA_Z();
		System.out.println("");
}
}

/*****
 * Program 4 : 
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
  
 ****/

package mohiniA.AsciiVal.Assignment36;

public class AsciiOperation {
	
	
	
	int getCountDigit(String input) {
		int count=0;
		System.out.println("Input : "+input);
		for(int index=0; index<input.length(); index++) {
			char ch = input.charAt(index);
			if(ch>=48 && ch<=57) {//Ascii value of Number charaters is of 0 - 9
				count++;
			}
		}
		return count;
	}
	
	char getAsciiChar(int num) {
		return  (char) num;
	}
	
	void printAsciiChar(int start, int end) {
		for(int index=start; index<=end; index++) {
			System.out.println(index + " -> " +  getAsciiChar(index));
		}
	}
	
	String getNextCharAll(String input) {
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
			else {//rest chars,numbers
				output = output + (char)ch;
			}	
		}
		return output;
	}
	
	
	
	public static void main(String[] args) {
		AsciiOperation obj36 = new AsciiOperation();
		
				
		
		System.out.println("Return count of digits from given String without using isDigit method of Character class.");
		String input4 = "te1chno2cre4di6ts";
		System.out.println("Output : "+ obj36.getCountDigit(input4));
		System.out.println("");
		
		System.out.println("------------------------------------");
		System.out.println("Return character holding given Ascii value. ");
		int input5 = 69; 
		System.out.println("Input : " + input5);
		System.out.println("Output : " + obj36.getAsciiChar(input5));
		System.out.println("");
		
		System.out.println("-----------------------------------------");
		System.out.println("Print all characters having ascii value 91 to 96. ");
		obj36.printAsciiChar(91,96);
		System.out.println("");
		
	
		System.out.println("--------------------------------------------");
		System.out.println("Return String by encrypting all characters from given string by its next character.");
		String input7 = "aPd%3zZ"; 
		System.out.println("Output : "+ obj36.getNextCharAll(input7));
		System.out.println("");
		

	}


}

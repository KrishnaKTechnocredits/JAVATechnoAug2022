/*
Assignment - 36 : 9th Oct'2022
Program 7 : 
WAP to return String by encrypting all characters from given string by its next character.

input : aPd%3zZ
output : bQ%e3aA
*/

package deepakPatil.Assignment36ASCIIValue;

public class Assignment36_3{
	
	String getEncryptedString(String input){
		String encryptString="";
		for(int index=0; index<input.length(); index++){
			
			char ch = input.charAt(index);
			
			if(ch=='%'){
				encryptString+=ch;
			}else if(ch>=48 && ch<=57){
				encryptString+=ch;
			}else if(ch=='z'){
				encryptString+='a';
			}else if(ch=='Z'){
				encryptString+="A";
			}else{
				if((ch>=65 && ch<=90) || (ch>=97 && ch<=122))
					ch++;
				encryptString+=ch;
			}				
		}
		return encryptString;
	}
	
	public static void main(String[]args){
		String input="aPd%3zZ";
		System.out.println("Given input string is: "+input);
		System.out.println("Encrypted string of string '"+input+"' is '"+new Assignment36_3().getEncryptedString(input));
	}
}

/*Program 7 : 
WAP to return String by encrypting all characters from given string by its next character.

input : aPd%3zZ
output : bQe%3aA
*/
package gauravSahu;

import java.util.Scanner;

public class Assignment36G {
	
	
	String encryptChar(String input) {
		String output = " ";
		for(int i =0;i<input.length();i++) {
			char ch = input.charAt(i);
			if(ch=='Z') {
				output += 'A';
			}else if(ch=='z'){
				output += 'a';
			}else if(ch>=48 && ch<=57 && ch>=123) {
				output = output + ch;
			}else {
				if((ch>=65 && ch<=90) || (ch>=97 && ch<=122)) {
					ch++;
				}output = output + ch;
			}
		}return output;
	}
	
	public static void main(String[] args) {
	Assignment36G a36 = new Assignment36G();
	Scanner sc  = new Scanner(System.in);
	System.out.println("Give input : ");
	String input = sc.next();
	String output = a36.encryptChar(input);
	System.out.println(output);
	
	}
}

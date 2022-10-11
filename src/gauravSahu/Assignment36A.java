/*Program 1 : 
WAP to return String by encrypting all characters from given string by its next character.

input : apdz
output : bqea*/

package gauravSahu;

import java.util.Scanner;

public class Assignment36A {

	String getAscii(String input) {
		String output = "";
		for(int i=0;i<input.length();i++) {
			char ch = input.charAt(i);
			//int ascii = ch;
			if(ch=='Z') {
				output = output + 'A';
			}else if(ch=='z') {
				output = output + 'a';
			}else {
				if((ch>=65 && ch<=90) || (ch>=97 && ch<=122)) {
					ch++;
				}output = output + ch;
			}
		}
		return output;
	}
	public static void main(String[] args) {
		Assignment36A a36 = new Assignment36A();
		Scanner sc  = new Scanner(System.in);
		System.out.println(" Give input : ");
		String input = sc.next();
		//String input = "apdz";
		String output  = a36.getAscii(input);
		System.out.println("Output : " + output);
	}
}

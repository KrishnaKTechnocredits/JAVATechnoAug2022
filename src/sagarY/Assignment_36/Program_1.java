/*Program 1 : WAP to return String by encrypting all characters from given string by its next character.
input : apdz
output : bqea
*/

package sagarY.Assignment_36;

import java.util.Scanner;

public class Program_1 {
	
	String nextCharReturnByUsingAscii(String str) {
		String nextCharString="";
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!='z') {
				int num = str.charAt(i);
				nextCharString=nextCharString+(char)(num+1);
			}else
				nextCharString = nextCharString+'a';
		}		
		return nextCharString;		
	}
	
	public static void main(String[] args) {
		System.out.println("Program 1: WAP to return String by encrypting all characters from given string by its next character");
		System.out.println("-----------------------------------------------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any String: ");
		String str = sc.next();
		Program_1 prg = new Program_1();
		String returnnString = prg.nextCharReturnByUsingAscii(str);
		System.out.print("Output: String returning with its next chars is: "+returnnString);
		sc.close();
	}

}

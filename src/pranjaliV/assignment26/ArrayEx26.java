/*
 Assignment - 26 - 21st Sep'2022
 
  Find out frequency of each charachter from given input using single while loop.
  String str = "technocreditst"
 */

package pranjaliV.assignment26;

public class ArrayEx26 {

	void printFreqEachChar(String input) {
		System.out.println("Input : " + input) ;
		int count = 0 ;
		while (input.length()>0) {
			char charac = input.charAt(0);
			String ch = Character.toString(charac); //converts character to string
			int originalLength = input.length(); // original length of string
			input = input.replace(ch,""); //replace character with nothing ie remove that character from string
			int newLength = input.length(); // gives changed length
			count = originalLength - newLength; // diff of 2 lengths gives the no chars replaced i.e its freq
			System.out.println(charac +" -> " + count) ;
		}
	}
	
	public static void main(String[] args) {
		ArrayEx26 ex26 = new ArrayEx26();
		System.out.println("Find out frequency of each charachter from given input using single while loop.");
		String str = "technocreditst";
		ex26.printFreqEachChar(str);
	}

}

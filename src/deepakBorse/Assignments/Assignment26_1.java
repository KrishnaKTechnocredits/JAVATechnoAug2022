/*
 * Assignment - 26 : 21st Sep'2022

find out frequency of each character from given input using single while loop.
String str = "technocreditst";
 */
package deepakBorse.Assignments;

public class Assignment26_1 {

	void getFreqchar(String str) {
		int count = 0;
		
		for (int i = 0; i <= str.length()-1; i++) {
			char ch = str.charAt(i);

			for (int j = 0; j < str.length(); j++) {
				char ch1=str.charAt(j);
				if (Character.valueOf(ch)==Character.valueOf(ch1)&& i!=j){
					
					count++;
					//ch1="";

				}
			}
			System.out.println(ch + " -> " + count);
			count=0;
		}
	}

	public static void main(String[] args) {

		Assignment26_1 Assignment = new Assignment26_1();

		String input = ("technocreditst");

		Assignment.getFreqchar(input);

	}
}
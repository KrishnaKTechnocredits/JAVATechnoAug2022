/*
 * Assignment - 26 : 21st Sep'2022

find out frequency of each character from given input using single while loop.
String str = "technocreditst";
 */

package deepakBorse.Assignments;


class Assignment26{

	void getFreqchar(String input){
		int origstrlen =0,newstrLen=0,freqcount=0;
		
		while(input.length()>0) {
			char ch=input.charAt(0);
			origstrlen=input.length();// get the original string length
			String str=Character.toString(ch);// Convert character to string
			input=input.replace(str,"");// Replace ch with blank
			newstrLen=input.length(); //get the new length of the string
			
			freqcount=origstrlen-newstrLen;//
			
			System.out.println(ch+" -> "+freqcount);
		}
	}
	
	public static void main(String[] args){
		
		Assignment26 Assignment = new Assignment26();
		
		String input=("technocreditst");
		System.out.println("Frequency of each character in given string '"+input+"' is as follows");
		Assignment.getFreqchar(input);
	
	}
}	
/*Assignment - 26 : 21st Sep'2022

find out frequency of each character from given input using single while loop.
String str = "technocreditst";
*/

package deepakPatil.Assignment26StringReplaceMethod;

public class Assignment26 {
	
	void findFrequencyOfEachChar(String str){
		System.out.println("Given string is: "+str+"\n");
		System.out.println("Frequence of each character from given string is as below:");
		while(str.length()>0){
			int strLength= str.length();
			char ch= str.charAt(0);
			String chStr= Character.toString(ch);
			str= str.replace(chStr,"");
			int newStrLength= str.length();
			System.out.println(ch+" --> "+(strLength-newStrLength));
		}
	}
	
	public static void main(String[]args){
		
		new Assignment26().findFrequencyOfEachChar("technocreditst");
	}
}



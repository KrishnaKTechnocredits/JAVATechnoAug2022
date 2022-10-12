package shraddhaRekhate.Assignment21_26_29_30;
//Assignment 26
//find out frequency of each character from given input using single while loop.
//String str = "technocreditst";

public class FrequencyOfChar {
  void frequencyOftCharacterFromString(String str) {
	  int origiNalLength=0;
	  int newLength=0;
	  int freQuencyt=0;
	  while(str.length()>0) {
		  char ch=str.charAt(0);
		  String str1=Character.toString(ch);
		  origiNalLength=str.length();
		  str=str.replace(str1,"");
		  newLength=str.length();
		  freQuencyt=origiNalLength-newLength;
		  System.out.println("Frequenncy of charater "+ch+" is: "+freQuencyt);
		  }
	  }
	  
	public static void main(String[] args) {
		FrequencyOfChar frequencyOfChar=new FrequencyOfChar();
		frequencyOfChar.frequencyOftCharacterFromString("technocreditst");

	}

}

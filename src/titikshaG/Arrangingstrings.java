package titikshaG;

public class Arrangingstrings {
  String getRearranging(String name)
  {
	  String tempDigit="";
	  String tempLetter="";
	  for(int index=0;index < name.length()-1;index++) {
		  char ch=name.charAt(index);
		  if(Character.isLetter(ch)) {
			  tempLetter=tempLetter+ch;}
		  else if(Character.isDigit(ch))
		  {
			  tempDigit=tempDigit+ch;
		  }
	 }
		  return tempDigit + tempLetter;
  }
  
  String getUpperCase(String name)
  {
	  String tempDigit="";
	  String tempUpperLetter="";
	  String tempLowerLetter="";
	  for(int index=0;index < name.length()-1;index++) {
		  char ch=name.charAt(index);
		  if(Character.isUpperCase(ch)) {
			  tempUpperLetter=tempUpperLetter+ch;}
		  else if(Character.isDigit(ch))
		  {
			  tempDigit=tempDigit+ch;
		  }
		  else if(Character.isLowerCase(ch))
		  {
			  tempLowerLetter=tempLowerLetter+ch;
		  }
		  
	  }
		  return tempUpperLetter + tempDigit + tempLowerLetter;
	}
		 
  int getCountOfTargetChar(String input, char targetChar)
  {
	  int count=0;
	  input=input.toLowerCase();
	  targetChar=Character.toLowerCase(targetChar);
	  for(int index=0;index < input.length();index++) {
		  char ch=input.charAt(index);
		  if(ch==targetChar) {
			  count++;
			  }
	  }
		  return count;
  }
  
  public static void main(String[] a)
	{
	Arrangingstrings arrangingstrings=new Arrangingstrings();
	System.out.println(new Arrangingstrings().getRearranging("te2cH4no"));
	System.out.println();
	System.out.println(new Arrangingstrings().getUpperCase("t8EcHNo5Cred3iTs"));
	System.out.println();
	String input="TechnoTtcredits";
	char targetChar='t';
	System.out.print(input+ "Frequency of character" + targetChar + "is : " + " "+ arrangingstrings.getCountOfTargetChar(input,targetChar));
	}
}

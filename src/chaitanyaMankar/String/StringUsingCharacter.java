/*
 Assignment - 18 : 8th Sep'2022

1) Write a program to rearrange String in given format. 
String str = "te2cH4no";
output : "24tecHno";
Hint : AllDigitAllCharacter

2) Write a program to rearrange String in given format. 
Hint : Uppercase letters + digits + LowerCase letter
input = "t8EcHNo5Cred3iTs";
output : EHNCT853tcoredis 
// Character.isUpperCase(ch), Character.isLowerCase(ch)

3) Find frequency of given character from given String. 
String str = "TechnoTtcredits";
char targetChar = 't';
output : 4
*/
package chaitanyaMankar.String;

public class StringUsingCharacter 
{
	String strng = "";
	String num = "";
	
	String Rearrange1(String Name)
	{
		for(int i=0;i<=Name.length()-1;i++)
		{
			char ch = Name.charAt(i);
			if(Character.isDigit(ch))
			{
				num = num + ch;
			}
			else if(Character.isLetter(ch))
			{
				strng = strng + ch;
			}
		}
		return num+strng;	
	}
	
	String Rearrange2(String Name)
	{
		String upper="";
		String lower="";
		String num="";
		
		for(int i=0;i<=Name.length()-1;i++)
		{
			char ch=Name.charAt(i)	;
			if(Character.isUpperCase(ch))
				{
					upper=upper+ch;
				}
			else if(Character.isLowerCase(ch))
				{
					lower=lower+ch;
				}
			else if(Character.isDigit(ch))
				{
					num=num+ch;
				}
		}
	return upper+num+lower;
	}
	
	int Frequency(String name, char t)
	{
		int frq=0;
		String uName = name.toLowerCase();
		for(int i=0;i<=uName.length()-1;i++)
		{
		 char ch = uName.charAt(i);
		 if(ch==t)
		 {
			 frq++;
		 }
		}
		return frq;
	}
	public static void main(String[] args) 
	{
		StringUsingCharacter str = new StringUsingCharacter();
		String str1 = str.Rearrange1("te2cH4no");
		System.out.println("Output:"+str1);
		String str2 = str.Rearrange2("t8EcHNo5Cred3iTs");
		System.out.println("Output:"+str2);
		int count = str.Frequency("TechnoTtcredits", 't');
		System.out.println("Count:"+count);
	}
}

/*Program 1 : (20 mins)
Return middle character of max length String from given array.
input : {"Krishna","Maulik","Aashvi","Technocredits","Harsh"}
output : c*/

package chaitanyaMankar.Array;

public class StringOpsUsingArray 
{
	char MiddleChar(String Name[])
	{	
		String maxString = "";
		int maxLength = 0;
		
		char ch = '0';
		String tName = "";
		
		for(int i=0;i<Name.length-1;i++)
		{
			if(maxString.length() < Name[i].length()); 
			{			
				maxString = Name[i];
				maxLength = maxString.length();
			}
		}
		
		if(maxLength % 2 == 0)
		{
			ch = maxString.charAt(maxLength/2);
			return ch;
		}
		else if(maxLength % 2 != 0)
		{
			ch = maxString.charAt(maxLength/2-1);
			return ch;
		}
		return ch;
	}
	
	public static void main(String[] args) 
	{
		StringOpsUsingArray schar = new StringOpsUsingArray();
		String[] arr = {"Krishna","Maulik","Aashvi","Technocredits","Harsh"};
		char c = schar.MiddleChar(arr);
		System.out.println("Middle Char: "+c);
	}
}

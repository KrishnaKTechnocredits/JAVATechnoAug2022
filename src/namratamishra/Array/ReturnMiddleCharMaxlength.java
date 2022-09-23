//Return middle character of max length String from given array.
//input : {"Krishna","Maulik","Aashvi","Technocredits","Harsh"}
//output : c

package namratamishra.Array;

public class ReturnMiddleCharMaxlength {

	
	public static void main(String[] args) {
		
		String[] input = {"Krishna", "Maulik", "Aashvi", "Technocredits", "Harsh"};	
		
		ReturnMiddleCharMaxlength rmcl=new ReturnMiddleCharMaxlength();
		String maxlenghname=rmcl.getMaxlength(input);
		System.out.println("Maximum lenght string from the given array is "+maxlenghname);
		char c=rmcl.getMiddleChar(maxlenghname);
		System.out.print("  and middile charcter of the maximum length string is  "+c);
	}
	
	char getMiddleChar(String str) {
		char ch = ' ';
		if (str.length() % 2 == 0) {
			ch = str.charAt(str.length() / 2 - 1);
		} else
                   {
			ch = str.charAt(str.length() / 2);
		}
		return ch;
	}
	
	String getMaxlength(String[] str)
	{
	int maxLength=0;
	String maxLengthName= " ";

		for (int i=0; i<str.length; i++)
		{
				if (maxLength<str[i].length())
				{
				maxLength=str[i].length();
				maxLengthName=str[i];
				}
		}
		return maxLengthName;
				
	}
}
		
		
		
		
		
	
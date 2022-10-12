package jagruti.Test3and4;
public class Test3 
{
	public static void main(String[] args) 
	{
		Test3 a = new Test3();
		String[] input = {"Krishna","Maulik","Aashvi","Technocredits","Harsh"};
		String name  = a.getMaxLength(input);
		System.out.println("Maximum length string from given array : "+name);
		char ch = a.middleChar(name);
		System.out.println("Middle character of "+name+" is : "+ch);
	}		
	String getMaxLength(String[] name)
	{
		int maxLength = name[0].length();
		String maxString = name[0];

		for (int index = 1; index < name.length; index++)
		{
			if (name[index].length() > maxLength)
			{
				maxString = name[index];
			}
		}
		return maxString;
	}	
	char middleChar(String name) {
		char ch = ' ';
		for (int index = 0; index < name.length(); index++) {
			int arrIndex = 0;
			int length = name.length();
			if (length % 2 == 0) {
				arrIndex = length / 2 - 1;
			} else {
				arrIndex = length / 2;
			}
			ch = name.charAt(arrIndex);
		}
		return ch;
	}
	
}

package jagruti.Assignment20;

import java.util.Arrays;

public class ReturnMaximumLengthName 
{
	public static void main(String[] args) 
	{
		ReturnMaximumLengthName a = new ReturnMaximumLengthName();
		String[] input = { "Ashish", "Aditty", "Manjiri", "Ankita", "Credits" };
		System.out.println(Arrays.toString(input) + "\n" + a.getMaxLength(input));
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
}

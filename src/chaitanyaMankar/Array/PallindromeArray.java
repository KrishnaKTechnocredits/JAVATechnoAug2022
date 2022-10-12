package chaitanyaMankar.Array;


public class PallindromeArray {
	void ProcessData(String[] str)
	{
		
		for(int index=0;index<str.length;index++)
		{
			String temp = "";
			for(int jindex = str[index].length()-1;jindex >= 0;jindex--)
			{
				temp = temp	+ str[index].charAt(jindex);
			}
		
		if(str[index].equals(temp))
		{
			System.out.println("String is Palindrome: "+str[index]);
		}
		else
		{
			System.out.println("String is Not Palindrome: "+str[index]);
		}
		}
	}

	public static void main(String[] args) 
	{
		PallindromeArray pdr = new PallindromeArray();
		String[] str = {"radar","techhpet","madam","maulikkilum"};
		//String[] str = {"madam"};
		pdr.ProcessData(str);
	}

}

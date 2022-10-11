package chaitanyaMankar.String;

public class Palindrome 
{
	void ProcessData(String str)
	{
		String temp = "";
		for(int index=str.length()-1;index>=0;index--)
		{
			temp = temp	+ str.charAt(index);
		}
		if(str.equals(temp))
		{
			System.out.println("String is Palindrome: "+str);
		}
		else
		{
			System.out.println("String is Not Palindrome: "+str);
		}
	}

	public static void main(String[] args) 
	{
		Palindrome pdr = new Palindrome();
		pdr.ProcessData("radar");
		pdr.ProcessData("aabcbaa");
		pdr.ProcessData("abcabc");
	}

}
